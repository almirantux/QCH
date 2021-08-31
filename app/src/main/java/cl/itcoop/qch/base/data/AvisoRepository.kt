package cl.itcoop.qch.base.data

import cl.itcoop.qch.base.data.modelo.AvisoModel
import cl.itcoop.qch.base.data.modelo.AvisoProvider
import cl.itcoop.qch.base.data.network.AvisoService

class AvisoRepository {
    private val api = AvisoService()
    suspend fun getAllAvisos():List<AvisoModel>{
        val response = api.getAvisos()
        AvisoProvider.avisos = response
        return response
    }

}
