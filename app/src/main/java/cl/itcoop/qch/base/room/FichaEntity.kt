package cl.itcoop.qch.base.room

import androidx.room.*

@Entity(tableName = "genero" )
data class  Genero (@ColumnInfo(name = "idgenero")
                    @PrimaryKey(autoGenerate = true)
                    val idgenero:Long = 0 ,
                    @ColumnInfo(name = "descripcion")
                    val descripcion:String)

@Entity(foreignKeys = [ForeignKey(entity = Genero::class,
    parentColumns = arrayOf("idgenero"),
    childColumns = arrayOf("genero"),
    onDelete = ForeignKey.CASCADE)], tableName = "usuario",indices = [Index("genero" )] )
data class  Usuario (@ColumnInfo(name = "idusuario")
                    @PrimaryKey(autoGenerate = true)
                    val idusuario:Long = 0,
                    @ColumnInfo(name = "movil")
                    val movil:String,
                    val genero:String)

@Entity(foreignKeys = [ForeignKey(entity = Usuario::class,
    parentColumns = arrayOf("idusuario"),
    childColumns = arrayOf("usuario"),
    onDelete = ForeignKey.CASCADE)], tableName = "ficha", indices = [Index("usuario")]
)
data class Ficha(@ColumnInfo(name = "idficha")
                 @PrimaryKey(autoGenerate = true)
                 val idficha:Long = 0,
                 @ColumnInfo(name = "rut")
                 val rut:Long,
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
                 val usuario:String

)
