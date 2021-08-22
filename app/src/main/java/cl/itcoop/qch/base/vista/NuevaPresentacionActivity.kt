package cl.itcoop.qch.base.vista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import cl.itcoop.qch.base.vistaModelo.RecetaViewModel
import cl.itcoop.qch.databinding.ActivityNuevaPresentacionBinding
import androidx.lifecycle.Observer


// import javax.inject.Inject

class NuevaPresentacionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNuevaPresentacionBinding
    private val recetaViewModel: RecetaViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNuevaPresentacionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recetaViewModel.onCreate()
// {"idreceta": ,"fecha":,"enlace":,"titulo":,"idnutricionista":,"caracteristica":,"idusuario":}

        recetaViewModel.recetaModel.observe(this, Observer {
            binding.textViewNombre.text = it.titulo
            binding.textViewTema.text = it.caracteristica
            binding.textViewEnlace.text = it.enlace

        })
        recetaViewModel.isLoading.observe(this, Observer {
            binding.loading.isVisible = it
        })

        binding.viewContainer.setOnClickListener { recetaViewModel.randomReceta() }








    }








}