package cl.itcoop.qch.base.vistamodelo

import android.app.Application
import cl.itcoop.qch.base.data.FichaRepository
import cl.itcoop.qch.base.room.FichaRoomDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class fichasApplication : Application() {

    private val applicationScope = CoroutineScope(SupervisorJob())
    private val database by lazy { FichaRoomDatabase.getDatabase(this, applicationScope) }
    val repository by lazy { FichaRepository(database.fichaDao()) }
}
