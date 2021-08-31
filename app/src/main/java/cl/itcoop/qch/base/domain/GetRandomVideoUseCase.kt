package cl.itcoop.qch.base.domain

import cl.itcoop.qch.base.data.modelo.VideoModel
import cl.itcoop.qch.base.data.modelo.VideoProvider

class GetRandomVideoUseCase {
    operator fun invoke(): VideoModel?{
        val videos = VideoProvider.videos
        if(!videos.isNullOrEmpty()){
            val randomNumber = (videos.indices).random()
            return videos[randomNumber]
        }
        return null
    }
}