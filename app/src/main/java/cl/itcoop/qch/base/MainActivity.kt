package cl.itcoop.qch.base

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import cl.itcoop.qch.R
import cl.itcoop.qch.base.vista.FichaActivity
import cl.itcoop.qch.base.vista.NuevaPresentacionActivity


class MainActivity : AppCompatActivity() {
    lateinit var recetas:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recetas=findViewById(R.id.Recetas)
        recetas.setOnClickListener (object:View.OnClickListener{
            override fun onClick(view: View?)
            {
              presentaReceta()
            }
        }
        )
    }
    fun  presentaArticulo (view: View) {
        val extra= Bundle()
        extra.putString("dato","articulos")
      val siguiente= Intent(this, NuevaPresentacionActivity::class.java )
        siguiente.putExtras(extra)
      startActivity(siguiente)
    }
    fun  presentaVideo (view: View) {
        val extra= Bundle()
        extra.putString("dato","video")
        val siguiente= Intent(this, NuevaPresentacionActivity::class.java )
        siguiente.putExtras(extra)
        startActivity(siguiente)
    }
    fun  presentaReceta () {
        val extra= Bundle()
        extra.putString("dato","recetas")
        val siguiente= Intent(this, NuevaPresentacionActivity::class.java )
        siguiente.putExtras(extra)
        startActivity(siguiente)
    }
    fun  registra (view: View) {
        val registrar= Intent(this, FichaActivity::class.java )
        startActivity(registrar)
    }

    fun vuelta(view: View) {}

}