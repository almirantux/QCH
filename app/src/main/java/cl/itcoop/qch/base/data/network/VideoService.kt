package cl.itcoop.qch.base.data.network

import cl.itcoop.qch.base.data.modelo.VideoModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class VideoService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getVideos(): List<VideoModel> {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(APIService::class.java).getAllVideos()
            response.body() ?: emptyList()
        }
    }
}