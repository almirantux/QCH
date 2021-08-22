package cl.itcoop.qch.base.data.modelo

import com.google.gson.annotations.SerializedName

data class ArticuloModel(
    @SerializedName("Receta") val titulo: String,
    @SerializedName("Tema") val tema: String,
    @SerializedName("Enlace") val url: String

)