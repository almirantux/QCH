package cl.itcoop.qch.base.vista

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.itcoop.qch.R
import cl.itcoop.qch.base.MainActivity

class FichaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ficha)
    }
    fun  vuelta ( ) {
        val anterior= Intent(this, MainActivity::class.java )
        startActivity(anterior)
    }



}