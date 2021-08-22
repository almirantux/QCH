package cl.itcoop.qch.base.data

import cl.itcoop.qch.base.vistaModelo.AvisoModel
import cl.itcoop.qch.base.data.modelo.AvisoProvider
import cl.itcoop.qch.base.data.network.AvisoService
//da error,   import javax.inject.Inject

// da error class RecetaRepository @Inject constructor(
class AvisoRepository {
    private val api = AvisoService()
    private val avisoProvider = AvisoProvider()

    suspend fun getAllAvisos():List<AvisoModel>{
        val response = api.getAvisos()
        AvisoProvider.avisos = response
        return response
    }

}
