package cl.itcoop.qch.base.data.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.itcoop.qch.base.room.Ficha
import cl.itcoop.qch.databinding.ItemFichaBinding


class FichaAdapter
    : RecyclerView.Adapter<FichaAdapter.ViewHolder>() {

    var fichas : List<Ficha> = listOf()

   /* fun setListData(data: List<Ficha>) {
        this.fichas = data
    }*/

    class ViewHolder(binding: ItemFichaBinding ) : RecyclerView.ViewHolder(binding.root) {
        val nombre= binding.nombre
        val email= binding.email
        val rut= binding.rut
        val dv= binding.dv
        val movil= binding.movil
        val fechanacimiento= binding.fechanacimiento
        val genero= binding.genero
        val edad= binding.edad
        val peso= binding.peso
        val estatura= binding.estatura
        val imc= binding.imc


    }
    // El layout manager invoca este método para renderizar cada elemento
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding= ItemFichaBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        // Aquí podemos definir tamaños, márgenes, paddings, etc
        return ViewHolder(binding)
    }

    // Este método asigna valores para cada elemento de la lista
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ficha = fichas[position]
        holder.nombre.text = ficha.nombre
        holder.email.text = ficha.email
        holder.rut.text = ficha.rut
        holder.dv.text = ficha.dv
        holder.movil.text = ficha.movil
        holder.fechanacimiento.text = ficha.fechanacimiento
        holder.genero.text = ficha.genero
        holder.edad.text = ficha.edad
        holder.peso.text = ficha.peso
        holder.estatura.text = ficha.estatura
        holder.imc.text = ficha.IMC

    }

    // Cantidad de elementos del RecyclerView
    // Puede ser más complejo (por ejm, si implementamos filtros o búsquedas)
    override fun getItemCount() = fichas.size
}

