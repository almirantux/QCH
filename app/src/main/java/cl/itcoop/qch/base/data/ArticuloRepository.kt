package cl.itcoop.qch.base.data

import cl.itcoop.qch.base.VistaModelo.ArticuloModel
import cl.itcoop.qch.base.data.modelo.ArticuloProvider
import cl.itcoop.qch.base.data.network.ArticuloService
//da error,   import javax.inject.Inject

// da error class ArticuloRepository @Inject constructor(
class ArticuloRepository {
    private val api = ArticuloService()
    private val articuloProvider = ArticuloProvider()

    suspend fun getAllArticulos():List<ArticuloModel>{
        val response = api.getArticulos()
        ArticuloProvider.articulos = response
        return response
    }

}

