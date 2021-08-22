package cl.itcoop.qch.base

import com.google.gson.annotations.SerializedName

class RecetaResponse {
    data class RecetaResponse(
        @SerializedName("idreceta") var idreceta: Number,
        @SerializedName("fecha") var fecha: String,
        @SerializedName("enlace") var enlace: String,
        @SerializedName("titulo") var titulo: String,
        @SerializedName("idnutricionista") var idnutricionista: Number,
        @SerializedName("caracteristica") var caracteristica: String,
        @SerializedName("idusuario") var idusuario: Number
    )
    class VideoResponse {
        data class VideoResponse(
            @SerializedName("idvideos") var idvideos: Number,
            @SerializedName("fecha") var fecha: String,
            @SerializedName("enlace") var enlace: String,
            @SerializedName("tema") var tema: String,
            @SerializedName("idnutricionista") var idnutricionista: Number,
            @SerializedName("titulo") var titulo: String,
            @SerializedName("idusuario") var idusuario: Number
        )
    }
    class ArticuloResponse {
        data class ArticuloResponse(
            @SerializedName("idarticulo") var idarticulo: Number,
            @SerializedName("fecha") var fecha: String,
            @SerializedName("enlace") var enlace: String,
            @SerializedName("tema") var tema: String,
            @SerializedName("idnutricionista") var idnutricionista: Number,
            @SerializedName("titulo") var titulo: String,
            @SerializedName("idusuario") var idusuario: Number
        )
    }
    class AvisoResponse {
        data class AvisoResponse(
            @SerializedName("idavisos") var idavisos: Number,
            @SerializedName("fecha") var fecha: String,
            @SerializedName("imagen") var imagen: String,
            @SerializedName("enlace") var enlace: String,
            @SerializedName("idnutricionista") var idnutricionista: Number,
            @SerializedName("idusuario") var idusuario: Number
        )
    }


}