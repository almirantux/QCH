package cl.itcoop.qch.base.data.modelo

import com.google.gson.annotations.SerializedName
import java.util.*

data class ArticuloModel(
    @SerializedName("idarticulo") val idarticulo: String,
    @SerializedName("fecha") val fecha: Date,
    @SerializedName("enlace") val enlace: String,
    @SerializedName("titulo") val titulo: String,
    @SerializedName("idusuario") val idusuario: String,
    @SerializedName("tema") val tema: String,
    @SerializedName("idnutricionista") val idnutricionista: String

// "idarticulo","fecha","enlace","titulo","idusuario","tema","idnutricionista"
)