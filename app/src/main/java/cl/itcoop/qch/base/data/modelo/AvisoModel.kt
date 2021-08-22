package cl.itcoop.qch.base.data.modelo

import com.google.gson.annotations.SerializedName

data class AvisoModel(
    @SerializedName("Titulo") val titulo: String,
    @SerializedName("Tema") val tema: String,
    @SerializedName("Enlace") val url: String

)