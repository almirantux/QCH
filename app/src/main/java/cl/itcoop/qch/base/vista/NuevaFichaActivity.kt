package cl.itcoop.qch.base.vista

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import cl.itcoop.qch.R

class NuevaFichaActivity : AppCompatActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nueva_ficha)
        val editFichaView = findViewById<EditText>(R.id.edit_ficha)
// uno por cada campo ojo con el nombre

        val button = findViewById<Button>(R.id.button_save)
        button.setOnClickListener {
            val replyIntent = Intent()
            if (TextUtils.isEmpty(editFichaView.text)) {
                setResult(Activity.RESULT_CANCELED, replyIntent)
            } else {
                val ficha = editFichaView.text.toString()
                replyIntent.putExtra(EXTRA_REPLY, ficha)
                setResult(Activity.RESULT_OK, replyIntent)
            }
            finish()
        }
    }

    companion object {
        const val EXTRA_REPLY = "cl.itcoop.qch.wordlistsql.REPLY"
    }





   }