package cl.itcoop.qch.base.vista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import cl.itcoop.qch.base.vistaModelo.VideoViewModel
import cl.itcoop.qch.databinding.ActivityPresentaVideoBinding

class PresentaVideoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPresentaVideoBinding
    private val videoViewModel: VideoViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPresentaVideoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        videoViewModel.onCreate()
        videoViewModel.videoModel.observe(
            this,
            Observer {
                binding.tvVideo.text = it.titulo
                binding.tvTema.text = it.tema
                binding.tvEnlace.text = it.enlace
            }
        )
        videoViewModel.isLoading.observe(this, Observer {
            binding.loading.isVisible = it
        })
        binding.viewContaVid.setOnClickListener { videoViewModel.randomVideo() }
    }
}