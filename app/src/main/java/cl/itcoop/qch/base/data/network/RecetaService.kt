package cl.itcoop.qch.base.data.network

import cl.itcoop.qch.base.core.RetrofitHelper
import cl.itcoop.qch.base.data.modelo.RecetaModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RecetaService {
    private val retrofit = RetrofitHelper.getRetrofit()
    suspend fun getRecetas(): List<RecetaModel> {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(APIService::class.java).getAllRecetas()
            response.body() ?: emptyList()
        }
    }
}