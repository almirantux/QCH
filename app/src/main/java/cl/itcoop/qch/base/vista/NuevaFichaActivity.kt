package cl.itcoop.qch.base.vista

import android.icu.text.SimpleDateFormat
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.itcoop.qch.base.room.Ficha
import cl.itcoop.qch.base.room.FichaDatabase
import cl.itcoop.qch.databinding.ActivityNuevaFichaBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.*

class NuevaFichaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNuevaFichaBinding
       override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
           binding= ActivityNuevaFichaBinding.inflate(layoutInflater)
           setContentView(binding.root)

           val idFicha: Int? = null

        if (intent.hasExtra("ficha")) {
            val ficha = intent.extras?.getSerializable("ficha") as Ficha

            binding.nombreFc.setText(ficha.nombre)
            binding.emailFc.setText(ficha.email)
            binding.rutFc.setText(ficha.rut)
            binding.dvFc.setText(ficha.dv)
            binding.movilFc.setText(ficha.movil)
            binding.fnFc.setText(ficha.fechanacimiento)
            binding.generoFc.setText(ficha.genero)
            binding.edadFc.setText(ficha.edad)
            binding.pesoFc.setText(ficha.peso)
            binding.estaturaFc.setText(ficha.estatura)
            binding.imcFc.setText(ficha.IMC)
            ficha.idficha

              }

        val database = FichaDatabase.getDatabase(this)

           fun Date.toString(format: String, locale: Locale = Locale.getDefault()): String {
               val formatter = SimpleDateFormat(format, locale)
               return formatter.format(this)
           }

           fun getCurrentDateTime(): Date {
               return Calendar.getInstance().time
           }
           val date = getCurrentDateTime()

        binding.saveBtn.setOnClickListener {
            val nombre = binding.nombreFc.text.toString()
            val email = binding.emailFc.text.toString()
            val rut = binding.rutFc.text.toString() //// como lo hago long?
            val dv = binding.dvFc.text.toString()
            val movil = binding.movilFc.text.toString()
            val fechanacimiento = binding.fnFc.text.toString()
            val genero = binding.generoFc.text.toString()
            val edad = binding.edadFc.text.toString()
            val peso = binding.pesoFc.text.toString()
            val estatura = binding.estaturaFc.text.toString()
            val imc = binding.imcFc.text.toString()
            val idficha = 1 // como lo hago long?
            val fechaficha = date.toString("dd/MM/yyyy")


            val ficha = Ficha(idficha, rut, dv,  nombre, fechanacimiento, email,edad,peso, estatura, imc, fechaficha,  nombre, movil, genero)
               // , R.drawable.ic_launcher_background
            if (idFicha != null) {
                CoroutineScope(Dispatchers.IO).launch {
                    ficha.idficha = idFicha

                    database.fichaDao().update(ficha)

                    this@NuevaFichaActivity.finish()
                }
            } else {
                CoroutineScope(Dispatchers.IO).launch {
                    database.fichaDao().insertFicha(ficha)

                    this@NuevaFichaActivity.finish()
                }
            }
        }
    }
}