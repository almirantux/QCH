package cl.itcoop.qch.base.vista


import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
// import androidx.lifecycle.*
import cl.itcoop.qch.base.MainActivity
import androidx.recyclerview.widget.LinearLayoutManager
import cl.itcoop.qch.base.core.FichaApplication
import cl.itcoop.qch.base.data.FichaRepository
import cl.itcoop.qch.base.data.adapter.FichaAdapter
import cl.itcoop.qch.base.vistamodelo.FichaViewModel
import cl.itcoop.qch.databinding.ActivityFichaBinding


class FichaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFichaBinding
    private val viewModel: FichaViewModel by viewModels {
      //  FichaViewModel.FichaViewModelFactory( ( FichaApplication(this)).repositorio )
        FichaViewModel.FichaViewModelFactory(repo= FichaApplication(this).repositorio )
    }
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFichaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(baseContext)
        binding.recyclerView.layoutManager = layoutManager
        val adapter=FichaAdapter()
        binding.recyclerView.adapter = adapter

        viewModel.allFichas.observe(   this   ){
            fichas-> fichas.let{
                if (it.isNotEmpty()){
                    adapter.fichas = it
                }
        }
        }


        binding.floatingActionButton.setOnClickListener {
            val intent = Intent(this, NuevaFichaActivity::class.java)
            startActivity(intent)
        }

    }




    fun  vuelta() {
        val anterior= Intent(this, MainActivity::class.java )
        startActivity(anterior)
    }
}



