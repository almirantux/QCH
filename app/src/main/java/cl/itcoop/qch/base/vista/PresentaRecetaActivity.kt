package cl.itcoop.qch.base.vista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import cl.itcoop.qch.base.vistaModelo.RecetaViewModel
import cl.itcoop.qch.databinding.ActivityPresentaRecetaBinding


class PresentaRecetaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPresentaRecetaBinding
    private val recetaViewModel: RecetaViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPresentaRecetaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        recetaViewModel.onCreate()
        recetaViewModel.recetaModel.observe( this, Observer {
                binding.tvReceta.text = it.titulo
                binding.tvCaracteristica.text = it.caracteristica
                binding.tvEnlace.text = it.enlace
            }  )
        recetaViewModel.isLoading.observe(this, Observer {
            binding.loading.isVisible = it
        })
        binding.viewContaRec.setOnClickListener { recetaViewModel.randomReceta() }
    }
}