package cl.itcoop.qch.base.vistaModelo

import androidx.lifecycle.MutableLiveData
import cl.itcoop.qch.base.data.modelo.AvisoProvider

class AvisoViewModel : ViewModel() {

    val avisoModel = MutableLiveData<AvisoModel>()
    fun onCreate() {
        viewModelScope.launch {
            val result = getAvisosUseCase()

            if(!result.isNullOrEmpty()){
                avisoModel.postValue(result[0])
            }
        }
    }
    fun randomAviso() {
        val currentAviso = AvisoProvider.random()
        avisoModel.postValue(currentAviso)
    }
}



class AvisoModel {

}

open class ViewModel {

}
