package cl.itcoop.qch.base.modelo
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import cl.itcoop.qch.R
import kotlin.collections.ArrayList

class AdaptadorReceta(val recetaList: ArrayList<Receta>) : RecyclerView.Adapter<AdaptadorReceta.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        val v = LayoutInflater.from(parent.context).inflate(R.layout.tarjeta, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return recetaList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(recetaList[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bindItems(receta: Receta) {
            val textViewReceta = itemView.findViewById(R.id.textViewNombre) as TextView
            val textViewDificultad = itemView.findViewById(R.id.textViewTema) as TextView
            textViewReceta.text = receta.nombre
            textViewDificultad.text = receta.dificultad
        }
    }

}

class AdaptadorVideo(val videoList: ArrayList<Video>) : RecyclerView.Adapter<AdaptadorVideo.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        val v = LayoutInflater.from(parent.context).inflate(R.layout.tarjeta, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return videoList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(videoList[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bindItems(video: Video) {
            val textViewVideo = itemView.findViewById(R.id.textViewNombre) as TextView
            val textViewTema = itemView.findViewById(R.id.textViewTema) as TextView
            textViewVideo.text = video.titulo
            textViewTema.text = video.tema
        }
    }

}


class AdaptadorArticulo(val articuloList: ArrayList<Articulo>) : RecyclerView.Adapter<AdaptadorArticulo.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        val v = LayoutInflater.from(parent.context).inflate(R.layout.tarjeta, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return articuloList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(articuloList[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bindItems(articulo: Articulo) {
            val textViewTitulo = itemView.findViewById(R.id.textViewNombre) as TextView
            val textViewTema = itemView.findViewById(R.id.textViewTema) as TextView
            textViewTitulo.text = articulo.titulo
            textViewTema.text = articulo.tema
        }
    }

}
