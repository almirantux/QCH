package cl.itcoop.qch.base.data.modelo

import com.google.gson.annotations.SerializedName
import java.util.*

data class VideoModel(
    @SerializedName("idvideos") val idvideos: String,
    @SerializedName("fecha") val fecha: Date,
    @SerializedName("enlace") val enlace: String,
    @SerializedName("titulo") val titulo: String,
    @SerializedName("idusuario") val idusuario: String,
    @SerializedName("idnutricionista") val idnutrcionista: String,
    @SerializedName("tema") val tema: String

// "idvideos","fecha","enlace","titulo","idusuario","idnutricionista","tema"}]
)