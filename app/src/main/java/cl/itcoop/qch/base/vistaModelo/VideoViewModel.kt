package cl.itcoop.qch.base.vistaModelo

import androidx.lifecycle.MutableLiveData
import cl.itcoop.qch.base.data.modelo.VideoProvider

class VideoViewModel : ViewModel() {

    val videoModel = MutableLiveData<VideoModel>()

    fun randomVideo() {
        val currentVideo = VideoProvider.random()
        videoModel.postValue(currentVideo)
    }
}

class VideoModel {

}

open class ViewModel {

}
