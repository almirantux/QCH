package cl.itcoop.qch.base.vista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import cl.itcoop.qch.base.vistaModelo.ArticuloViewModel
import cl.itcoop.qch.databinding.ActivityPresentaArticuloBinding

class PresentaArticuloActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPresentaArticuloBinding
    private val articuloViewModel: ArticuloViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPresentaArticuloBinding.inflate(layoutInflater)
        setContentView(binding.root)
        articuloViewModel.onCreate()
        articuloViewModel.articuloModel.observe(
            this,
            Observer {
                binding.tvArticulo.text = it.titulo
                binding.tvTema.text = it.tema
                binding.tvEnlace.text = it.enlace
            }
        )
        articuloViewModel.isLoading.observe(this, Observer {
            binding.loading.isVisible = it
        })
        binding.viewContaArt.setOnClickListener { articuloViewModel.randomArticulo() }
    }
}