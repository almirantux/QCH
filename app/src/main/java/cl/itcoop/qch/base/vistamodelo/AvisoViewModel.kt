package cl.itcoop.qch.base.vistaModelo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cl.itcoop.qch.base.data.modelo.AvisoModel
import cl.itcoop.qch.base.domain.GetAvisosUseCase
import cl.itcoop.qch.base.domain.GetRandomAvisoUseCase
import kotlinx.coroutines.launch

class AvisoViewModel : ViewModel() {

    val avisoModel = MutableLiveData<AvisoModel>()
    val isLoading = MutableLiveData<Boolean>()

    var getAvisosUseCase = GetAvisosUseCase()
    var getRandomAvisoUseCase = GetRandomAvisoUseCase()

    fun onCreate() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getAvisosUseCase()

            if(!result.isNullOrEmpty()){
                avisoModel.postValue(result[0])
                isLoading.postValue(false)
            }
        }
    }

    fun randomAviso() {
        isLoading.postValue(true)
        val aviso = getRandomAvisoUseCase()
        if(aviso!=null){
            avisoModel.postValue(aviso!!)
        }
        isLoading.postValue(false)
    }
}



