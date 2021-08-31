package cl.itcoop.qch.base.data.network

import cl.itcoop.qch.base.core.RetrofitHelper
import cl.itcoop.qch.base.data.modelo.AvisoModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class AvisoService {
    private val retrofit = RetrofitHelper.getRetrofit()
    suspend fun getAvisos(): List<AvisoModel> {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(APIService::class.java).getAllAvisos()
            response.body() ?: emptyList()
        }
    }
}