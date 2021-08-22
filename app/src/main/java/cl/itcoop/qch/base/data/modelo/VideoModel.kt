package cl.itcoop.qch.base.data.modelo

import com.google.gson.annotations.SerializedName

data class VideoModel(
    @SerializedName("Receta") val titulo: String,
    @SerializedName("Tema") val tema: String,
    @SerializedName("Enlace") val enlace: String

)