package cl.itcoop.qch.base.room


import androidx.lifecycle.LiveData
import androidx.room.*
import kotlinx.coroutines.flow.Flow


@Dao
interface FichaDAO {
    @Query("SELECT * FROM laficha ORDER BY idficha ASC")
    fun getAllFicha(): Flow<List<Ficha>>

    @Query("SELECT * FROM laficha WHERE idficha = :idficha")
    fun get(idficha: Int): LiveData<Ficha>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertFicha(fichas: Ficha)

    @Update
    fun update(fichas: Ficha)

    @Delete
    fun delete(fichas: Ficha)
}




