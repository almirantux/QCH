package cl.itcoop.qch.base.data.modelo

import com.google.gson.annotations.SerializedName

data class RecetaModel(
    @SerializedName("Receta") val nombre: String,
    @SerializedName("Nivel") val dificultad: String,
    @SerializedName("Enlace") val imagen: String

)