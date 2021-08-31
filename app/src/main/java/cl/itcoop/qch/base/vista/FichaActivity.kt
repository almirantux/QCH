package cl.itcoop.qch.base.vista

import cl.itcoop.qch.R
import cl.itcoop.qch.base.vista.*
//import android.app.Activity
import android.content.Intent
import android.os.Bundle
//import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cl.itcoop.qch.base.MainActivity
import cl.itcoop.qch.base.data.adapter.FichaListAdapter
import cl.itcoop.qch.base.room.*
import cl.itcoop.qch.base.vistamodelo.fichasApplication
import com.google.android.material.floatingactionbutton.FloatingActionButton
import cl.itcoop.qch.base.vistamodelo.FichaViewModel
import cl.itcoop.qch.base.vistamodelo.FichaViewModelFactory

class FichaActivity : AppCompatActivity() {
  //  private val newFichaActivityRequestCode = 1
    private val ffichaViewModel: FichaViewModel by viewModels {
        FichaViewModelFactory((application as fichasApplication).repository)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        val adapter = FichaListAdapter()
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {
            val intent = Intent(this@FichaActivity, NuevaFichaActivity::class.java)
          // buscar por cual reemplazar startActivityForResult
            startActivity(intent)
        }


        ffichaViewModel.allFichas.observe(  this) { fichas ->

            fichas.let { adapter.submitList(it) }
        }
    }

    /* override fun onActivityResult(requestCode: Int, resultCode: Int, intentData: Intent?) {
        super.onActivityResult(requestCode, resultCode, intentData)

        if (requestCode == newFichaActivityRequestCode && resultCode == Activity.RESULT_OK) {
            intentData?.getLongExtra(NuevaFichaActivity.EXTRA_REPLY)?.let { reply ->
                val ficha = Ficha(reply)
                fichaViewModel.insert(ficha)
            }
        } else {
           Toast.makeText( applicationContext, R.string.empty_not_saved, Toast.LENGTH_LONG   ).show()
        }
    }*/
    fun  vuelta() {
        val anterior= Intent(this, MainActivity::class.java )
        startActivity(anterior)
    }
}