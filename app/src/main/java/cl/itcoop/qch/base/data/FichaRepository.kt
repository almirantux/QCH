package cl.itcoop.qch.base.data

import androidx.annotation.WorkerThread
import cl.itcoop.qch.base.room.*
import kotlinx.coroutines.flow.Flow


class FichaRepository (private val fichaDao: FichaDAO){

     val fichas : Flow<List<Ficha>> = fichaDao.getAllFicha()


   // val allFichas: Flow<List<Ficha>> = fichaDao.getAllFicha()

        @Suppress("RedundantSuspendModifier")
        @WorkerThread
        suspend fun insert(fichas: Ficha) {
            fichaDao.insertFicha(fichas)

        }
    }
