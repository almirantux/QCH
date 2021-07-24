package cl.itcoop.qch.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.itcoop.qch.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}