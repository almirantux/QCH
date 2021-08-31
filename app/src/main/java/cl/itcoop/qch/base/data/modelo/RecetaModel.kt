package cl.itcoop.qch.base.data.modelo

import com.google.gson.annotations.SerializedName
import java.util.*

data class RecetaModel(
    @SerializedName("idreceta") val idreceta: String,
    @SerializedName("fecha") val fecha: Date,
    @SerializedName("enlace") val enlace: String,
    @SerializedName("titulo") val titulo: String,
    @SerializedName("idnutricionista") val idnutrcionista: String,
    @SerializedName("caracteristica") val caracteristica: String,
    @SerializedName("idusuario") val idusuario: String

// idreceta","fecha","enlace","titulo","idnutricionista","caracteristica","idusuario"
)
