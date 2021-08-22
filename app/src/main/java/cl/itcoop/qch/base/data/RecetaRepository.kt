package cl.itcoop.qch.base.data

import cl.itcoop.qch.base.VistaModelo.RecetaModel
import cl.itcoop.qch.base.data.modelo.RecetaProvider
import cl.itcoop.qch.base.data.network.RecetaService
//da error,   import javax.inject.Inject

// da error class RecetaRepository @Inject constructor(
class RecetaRepository {
    private val api = RecetaService()
    private val recetaProvider = RecetaProvider()

    suspend fun getAllRecetas():List<RecetaModel>{
        val response = api.getRecetas()
        RecetaProvider.recetas = response
        return response
    }

}