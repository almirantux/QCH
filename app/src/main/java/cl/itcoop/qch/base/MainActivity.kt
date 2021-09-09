package cl.itcoop.qch.base

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import cl.itcoop.qch.R
import cl.itcoop.qch.base.vista.FichaActivity
import cl.itcoop.qch.base.vista.PresentaRecetaActivity
import cl.itcoop.qch.base.vista.PresentaVideoActivity
import cl.itcoop.qch.base.vista.PresentaArticuloActivity
import cl.itcoop.qch.base.vista.PresentaAvisoActivity
import cl.itcoop.qch.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var recetas:ImageView
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        recetas=binding.Recetas
        recetas.setOnClickListener { presentaReceta(recetas)}

        val crashButton = Button(this)
        crashButton.text = getString(R.string.Test_Crash)
        crashButton.setOnClickListener {
            throw RuntimeException("Prueba de Crash") // Force a crash
        }

        addContentView(crashButton, ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT))


    }

    fun  presentaArticulo (view: View) {
        val extra= Bundle()
        extra.putString("dato","articulos")
      val siguiente= Intent(this, PresentaArticuloActivity::class.java )
        siguiente.putExtras(extra)
      startActivity(siguiente)
    }
    fun  presentaVideo (view: View) {
        val extra= Bundle()
        extra.putString("dato","video")
        val siguiente= Intent(this, PresentaVideoActivity::class.java )
        siguiente.putExtras(extra)
        startActivity(siguiente)
    }
    fun  presentaReceta (view: View) {
        val extra= Bundle()
        extra.putString("dato","recetas")
        val siguiente= Intent(this, PresentaRecetaActivity::class.java )
        siguiente.putExtras(extra)
        startActivity(siguiente)
    }
    fun  presentaAviso (view: View) {
        val extra= Bundle()
        extra.putString("dato","avisos")
        val siguiente= Intent(this, PresentaAvisoActivity::class.java )
        siguiente.putExtras(extra)
        startActivity(siguiente)
    }


    fun  registra (view: View) {
        val registrar= Intent(this, FichaActivity::class.java )
        startActivity(registrar)
    }





}