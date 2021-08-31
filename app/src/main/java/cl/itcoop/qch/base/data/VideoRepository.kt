package cl.itcoop.qch.base.data

import cl.itcoop.qch.base.data.modelo.VideoModel
import cl.itcoop.qch.base.data.modelo.VideoProvider
import cl.itcoop.qch.base.data.network.VideoService

class VideoRepository {
    private val api = VideoService()
    suspend fun getAllVideos():List<VideoModel>{
        val response = api.getVideos()
        VideoProvider.videos = response
        return response
    }
}