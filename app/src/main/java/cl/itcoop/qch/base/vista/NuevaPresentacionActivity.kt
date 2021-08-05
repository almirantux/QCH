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

        recyclerView.layoutManager = LinearLayoutManager(
            this,
            RecyclerView.VERTICAL,
            false
        )

        val recetas = ArrayList<Receta>()

        recetas.add(Receta("huevos a la paila", "facil","imagen1"))
        recetas.add(Receta("Vienesas con pure", "media","imagen2"))
        recetas.add(Receta("Cazuela", "dificil","imagen3"))
        recetas.add(Receta("Ratatoille", "muy dificil","imagen4"))

        val adaptador1 = CustomAdapter1(recetas)

        recyclerView.adapter = adaptador1

        val videos = ArrayList<Video>()

        videos.add(Video("comida saludable", "salud","url1"))
        videos.add(Video("porque no medicarse", "medicina","url2"))
        videos.add(Video("entrenamiento liviano", "ejercicio","url3"))
        videos.add(Video("manejo de la pandemia, final de cumbia", "opinion","url"))

        val adaptador2 = CustomAdapter2(videos)

        recyclerView.adapter = adaptador2

        val articulos = ArrayList<Articulo>()

        articulos.add(Articulo("comida saludable", "salud","url1"))
        articulos.add(Articulo("porque no medicarse", "medicina","url2"))
        articulos.add(Articulo("entrenamiento liviano", "ejercicio","url3"))
        articulos.add(Articulo("manejo de la pandemia, final de cumbia", "opinion","url"))

        val adaptador3 = CustomAdapter3(articulos)

        recyclerView.adapter = adaptador3



    }
}