package cl.itcoop.qch.base.vistaModelo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cl.itcoop.qch.base.data.modelo.VideoModel
import cl.itcoop.qch.base.domain.GetVideosUseCase
import cl.itcoop.qch.base.domain.GetRandomVideoUseCase
import kotlinx.coroutines.launch

class VideoViewModel : ViewModel() {

    val videoModel = MutableLiveData<VideoModel>()
    val isLoading = MutableLiveData<Boolean>()

    var getVideosUseCase = GetVideosUseCase()
    var getRandomVideoUseCase = GetRandomVideoUseCase()

    fun onCreate() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getVideosUseCase()

            if(!result.isNullOrEmpty()){
                videoModel.postValue(result[0])
                isLoading.postValue(false)
            }
        }
    }
    fun randomVideo() {
        isLoading.postValue(true)
        val video = getRandomVideoUseCase()
        if(video!=null){
            videoModel.postValue(video!!)
        }
        isLoading.postValue(false)
    }


}
