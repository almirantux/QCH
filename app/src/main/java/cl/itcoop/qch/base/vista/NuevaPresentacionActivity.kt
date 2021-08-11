package cl.itcoop.qch.base.vista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cl.itcoop.qch.R
import cl.itcoop.qch.base.modelo.*

class NuevaPresentacionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nueva_presentacion)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val ss:String = intent.getStringExtra("dato").toString()
        recyclerView.layoutManager = LinearLayoutManager(
            this,
            RecyclerView.VERTICAL,
            false
        )
        when (ss) {
            "recetas" -> {
                val recetas = ArrayList<Receta>()
                recetas.add(Receta("huevos a la paila", "facil", "imagen1"))
                recetas.add(Receta("Vienesas con pure", "media", "imagen2"))
                recetas.add(Receta("Cazuela", "dificil", "imagen3"))
                recetas.add(Receta("Ratatoille", "muy dificil", "imagen4"))

                val adaptadorrec = AdaptadorReceta(recetas)

                recyclerView.adapter = adaptadorrec
            }
        "video" -> {
            val videos = ArrayList<Video>()
            videos.add(Video("comida saludable", "salud", "url1"))
            videos.add(Video("porque no medicarse", "medicina", "url2"))
            videos.add(Video("entrenamiento liviano", "ejercicio", "url3"))
            videos.add(Video("tutorial de como manjear pandemias ", "opinion", "url"))
            val adaptadorvid = AdaptadorVideo(videos)
            recyclerView.adapter = adaptadorvid
        }
         "articulos" -> {

             val articulos = ArrayList<Articulo>()
             articulos.add(Articulo("comeri bien", "salud", "url1"))
             articulos.add(Articulo("sobre covid ", "medicina", "url2"))
             articulos.add(Articulo("pauta de ejercicios", "entrenamiento", "url3"))
             articulos.add(Articulo("manejo de la pandemia, final de cumbia", "opinion", "url"))
             val adaptadorart = AdaptadorArticulo(articulos)
             recyclerView.adapter = adaptadorart
         }

    }
}
}