package cl.itcoop.qch.base.data.modelo

import com.google.gson.annotations.SerializedName

data class FichaModel(
    @SerializedName("idficha") val idficha: String,
    @SerializedName("email") val email: String,
    @SerializedName("rut") val rut: String,
    @SerializedName("dv") val dv: String,
    @SerializedName("movil") val movil: String,
    @SerializedName("fechanacimiento") val fechanacimiento: String,
    @SerializedName("genero") val genero: String,
    @SerializedName("edad") val edad: String,
    @SerializedName("peso") val peso: String,
    @SerializedName("estatura") val estatura: String,
    @SerializedName("imc") val imc: String,
    @SerializedName("usuario") val usuario: String,
    @SerializedName("nombre") val nombre: String,
    @SerializedName("fechaficha") val fechaficha: String


)