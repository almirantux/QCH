package cl.itcoop.qch.base.room

import androidx.room.*
import java.io.Serializable

@Entity(tableName = "laficha" )
data class Ficha(@ColumnInfo(name = "idficha")
                 @PrimaryKey(autoGenerate = true)
                 var idficha:Int = 0,
                 @ColumnInfo(name = "rut")
                 val rut: String,
                 @ColumnInfo(name = "dv")
                 val dv:String,
                 @ColumnInfo(name = "nombre")
                 val nombre:String,
                 @ColumnInfo(name = "fechanacimiento")
                 val fechanacimiento:String,
                 @ColumnInfo(name = "email")
                 val email:String,
                 @ColumnInfo(name = "edad")
                 val edad:String,
                 @ColumnInfo(name = "peso")
                 val peso:String,
                 @ColumnInfo(name = "estatura")
                 val estatura:String,
                 @ColumnInfo(name = "IMC")
                 val IMC:String,
                 @ColumnInfo(name = "fechaficha")
                 val fechaficha:String,
                 @ColumnInfo(name = "usuario")
                 val usuario:String,
                 @ColumnInfo(name = "movil")
                 val movil:String,
                 @ColumnInfo(name = "genero")
                 val genero:String
) : Serializable
