package cl.itcoop.qch.base.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.OnConflictStrategy
import kotlinx.coroutines.flow.Flow


@Dao
interface FichaDAO {
    @Query("SELECT * FROM ficha ORDER BY idficha ASC")
    fun getAllFicha(): Flow<List<Ficha>>
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertFicha(fichas: Ficha)
    @Query("DELETE FROM ficha")
    suspend fun deleteAll()
}
@Dao
interface UsuarioDAO {
    @Query("SELECT * FROM usuario ORDER BY idusuario ASC")
    fun getAllUsuario(): Flow<List<Usuario>>
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertUsuario(usuarios: Usuario)
    @Query("DELETE FROM usuario")
    suspend fun deleteAll(usuarios: Usuario)
}
@Dao
interface GeneroDAO {
    @Query("SELECT * FROM genero  ORDER BY idgenero ASC")
    fun getAllGenero(): Flow<List<Genero>>
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertGenero(generos: Genero)
    @Query("DELETE FROM genero")
    suspend fun deleteAll(generos: Genero)
}



