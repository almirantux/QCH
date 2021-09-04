package cl.itcoop.qch.base.vista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import cl.itcoop.qch.base.vistaModelo.AvisoViewModel
import cl.itcoop.qch.databinding.ActivityPresentaAvisoBinding

class PresentaAvisoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPresentaAvisoBinding
    private val avisoViewModel: AvisoViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPresentaAvisoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        avisoViewModel.onCreate()
        avisoViewModel.avisoModel.observe(
            this,
            Observer {
                binding.tvImagen.text = it.imagen
                binding.tvEnlace.text = it.enlace
            }
        )
        avisoViewModel.isLoading.observe(this, Observer {
            binding.loading.isVisible = it
        })
        binding.viewContaAvi.setOnClickListener { avisoViewModel.randomAviso() }
    }
}