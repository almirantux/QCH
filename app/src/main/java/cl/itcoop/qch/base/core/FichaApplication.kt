package cl.itcoop.qch.base.core

import android.app.Application
import android.content.Context
import cl.itcoop.qch.base.data.FichaRepository
import cl.itcoop.qch.base.room.FichaDatabase

class FichaApplication(val context: Context) :Application( ){
    private val basededatos by lazy {
        FichaDatabase.getDatabase(context)
    }
    val repositorio by lazy {
     FichaRepository(basededatos.fichaDao())
    }
}