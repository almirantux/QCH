package cl.itcoop.qch.base.data

import cl.itcoop.qch.base.data.modelo.RecetaModel
import cl.itcoop.qch.base.data.modelo.RecetaProvider
import cl.itcoop.qch.base.data.network.RecetaService

class RecetaRepository {
    private val api = RecetaService()
  //  private val recetaProvider = RecetaProvider()

    suspend fun getAllRecetas():List<RecetaModel>{
        val response = api.getRecetas()
        RecetaProvider.recetas = response
        return response
    }

}