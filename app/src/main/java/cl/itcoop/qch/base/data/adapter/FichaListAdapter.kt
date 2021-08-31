package cl.itcoop.qch.base.data.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import cl.itcoop.qch.R
import cl.itcoop.qch.base.data.adapter.FichaListAdapter.FichaViewHolder
import cl.itcoop.qch.base.room.Ficha

class FichaListAdapter : ListAdapter<Ficha, FichaViewHolder>(WORDS_COMPARATOR) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FichaViewHolder {
        return FichaViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: FichaViewHolder, position: Int) {
        val current = getItem(position)
        holder.bind(current.idficha)
    }

    class FichaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val fichaItemView: TextView = itemView.findViewById(R.id.nombre)
//cual va en ves de textview...ojo  aqui como hago referencia
// del nuevaficha activity los trae itemview


        fun bind(text: Long) {
            fichaItemView.text = text.toString()
        }

        companion object {
            fun create(parent: ViewGroup): FichaViewHolder {
                val view: View = LayoutInflater.from(parent.context)
                    .inflate(R.layout.recyclerview_item, parent, false)
                return FichaViewHolder(view)
            }
        }
    }

    companion object {
        private val WORDS_COMPARATOR = object : DiffUtil.ItemCallback<Ficha>() {
            override fun areItemsTheSame(oldItem: Ficha, newItem: Ficha): Boolean {
                return oldItem === newItem
            }

            override fun areContentsTheSame(oldItem: Ficha, newItem: Ficha): Boolean {
                return oldItem.idficha == newItem.idficha
            }
        }
    }
}
