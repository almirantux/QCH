package cl.itcoop.qch.base.data.network

import cl.itcoop.qch.base.core.RetrofitHelper
import cl.itcoop.qch.base.data.modelo.ArticuloModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ArticuloService {
    private val retrofit = RetrofitHelper.getRetrofit()
    suspend fun getArticulos(): List<ArticuloModel> {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(APIService::class.java).getAllArticulos()
            response.body() ?: emptyList()
        }
    }
}