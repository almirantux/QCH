package cl.itcoop.qch.base.vista

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import cl.itcoop.qch.base.MainActivity

import android.webkit.WebView
import android.widget.Toast
import cl.itcoop.qch.R


class PresentacionActivity : AppCompatActivity() {
    lateinit var dato:String
    lateinit var view:WebView
    val baseurl="http://www.itcoop.cl/"
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_presentacion)
        var extra=intent.extras
        dato= extra?.getString("dato") ?:""
        var urlfinal=baseurl+dato
        view =  findViewById<View>(R.id.webview01) as WebView
        Toast.makeText(this,urlfinal, Toast.LENGTH_SHORT).show()
        view.loadUrl(urlfinal)


    }

    fun  vuelta (view: View) {
        var vuelve= Intent(this, MainActivity::class.java )
        startActivity(vuelve)

    }

}