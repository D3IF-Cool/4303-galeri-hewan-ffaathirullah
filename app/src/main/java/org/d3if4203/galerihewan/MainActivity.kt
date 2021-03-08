package org.d3if4203.galerihewan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import org.d3if4203.galerihewan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


      with(binding.recyclerView) {
          addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
          adapter = MainAdapter(getData())
          setHasFixedSize(true)
      }
    }

    private fun getData(): List<Hewan> {
        return listOf(
            Hewan("Angsa", "Cygnus olor", R.drawable.angsa, "unggas"),
            Hewan("Ayam", "Gallus gallus", R.drawable.ayam, "unggas"),
            Hewan("Bebek", "Cairina moschata", R.drawable.bebek, "unggas"),
            Hewan("Domba", "Ovis ammon", R.drawable.domba, "mamalia"),
            Hewan("Kalkun", "Meleagris gallopavo", R.drawable.kalkun, "unggas"),
            Hewan("Kambing", "Capricornis sumatrensis", R.drawable.kambing, "mamalia"),
            Hewan("Kelinci", "Oryctolagus cuniculus", R.drawable.kelinci, "mamalia"),
            Hewan("Kerbau", "Bubalus bubalis", R.drawable.kerbau, "mamalia"),
            Hewan("Kuda", "Equus caballus", R.drawable.kuda, "mamalia"),
            Hewan("Sapi", "Bos taurus", R.drawable.sapi, "mamalia")
        )
    }
}