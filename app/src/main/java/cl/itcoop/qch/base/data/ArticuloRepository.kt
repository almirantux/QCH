package cl.itcoop.qch.base.data

import cl.itcoop.qch.base.data.modelo.ArticuloModel
import cl.itcoop.qch.base.data.modelo.ArticuloProvider
import cl.itcoop.qch.base.data.network.ArticuloService

class ArticuloRepository {
    private val api = ArticuloService()

    suspend fun getAllArticulos():List<ArticuloModel>{
        val response = api.getArticulos()
        ArticuloProvider.articulos = response
        return response
    }
}