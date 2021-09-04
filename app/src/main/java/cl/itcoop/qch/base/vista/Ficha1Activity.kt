package cl.itcoop.qch.base.vista

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import cl.itcoop.qch.R
import cl.itcoop.qch.base.room.*
import cl.itcoop.qch.base.room.FichaDatabase
import cl.itcoop.qch.databinding.ActivityFicha1Binding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Ficha1Activity : AppCompatActivity() {
    private lateinit var binding: ActivityFicha1Binding
    private lateinit var database: FichaDatabase
    private lateinit var ficha: Ficha
    private lateinit var fichaLiveData: LiveData<Ficha>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFicha1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        database = FichaDatabase.getDatabase(this)
        val numFicha = intent.getIntExtra("idficha", 0)
        // despues de obtener el id de la ficha, obtengo la lista y  se la paso a livedata

        fichaLiveData = database.fichaDao().get(numFicha)
        fichaLiveData.observe(this, Observer {
            ficha = it
            binding.nombre.text = ficha.nombre
            binding.email.text = ficha.email
            binding.rut.text = ficha.rut
            binding.dv.text = ficha.dv
            binding.movil.text = ficha.movil
            binding.fechanacimiento.text = ficha.fechanacimiento
            binding.genero.text = ficha.genero
            binding.edad.text = ficha.edad
            binding.peso.text = ficha.peso
            binding.estatura.text = ficha.estatura
            binding.imc.text = ficha.IMC
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.ficha_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.edit_item -> {
                val intent = Intent(this, NuevaFichaActivity::class.java)
                intent.putExtra("ficha", ficha)
                startActivity(intent)
            }

            R.id.delete_item -> {
                fichaLiveData.removeObservers(this)

                CoroutineScope(Dispatchers.IO).launch {
                    database.fichaDao().delete(ficha) // estara bien???
                    this@Ficha1Activity.finish()
                }
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
