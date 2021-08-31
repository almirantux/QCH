package cl.itcoop.qch.base.data.modelo

import com.google.gson.annotations.SerializedName
import java.util.*

data class AvisoModel(
    @SerializedName("idavisos") val idavisos: String,
    @SerializedName("fecha") val fecha: Date,
    @SerializedName("imagen") val imagen: String,
    @SerializedName("enlace") val enlace: String,
    @SerializedName("idusuario") val idusuario: String,
    @SerializedName("idnutricionista") val idnutricionista: String

    // "idavisos","fecha","imagen","enlace","idusuario","idnutricionista"

)