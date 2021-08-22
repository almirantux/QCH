package cl.itcoop.qch.base.domain

import cl.itcoop.qch.base.vistaModelo.VideoModel
import cl.itcoop.qch.base.data.VideoRepository

class GetVideosUseCase {
    private val repository = VideoRepository()
    suspend operator fun invoke():List<VideoModel>? = repository.getAllVideos()


}