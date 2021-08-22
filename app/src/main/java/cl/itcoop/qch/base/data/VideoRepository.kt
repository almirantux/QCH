package cl.itcoop.qch.base.data

import cl.itcoop.qch.base.vistaModelo.VideoModel
import cl.itcoop.qch.base.data.modelo.VideoProvider
import cl.itcoop.qch.base.data.network.VideoService
//da error,   import javax.inject.Inject

// da error class RecetaRepository @Inject constructor(
class VideoRepository {
    private val api = VideoService()
    private val VideoProvider = VideoProvider()

    suspend fun getAllVideos():List<VideoModel>{
        val response = api.getVideos()
        cl.itcoop.qch.base.data.modelo.VideoProvider.videos  = response
        return response
    }

}