package cl.itcoop.qch.base.vistaModelo

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cl.itcoop.qch.base.data.modelo.RecetaModel
import cl.itcoop.qch.base.domain.GetRecetasUseCase
import cl.itcoop.qch.base.domain.GetRandomRecetaUseCase
import kotlinx.coroutines.launch
class RecetaViewModel : ViewModel() {
    val recetaModel = MutableLiveData<RecetaModel>()
    val isLoading = MutableLiveData<Boolean>()
    var getRecetasUseCase = GetRecetasUseCase()
    var getRandomRecetaUseCase = GetRandomRecetaUseCase()
    fun onCreate() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getRecetasUseCase()
            Log.d("Información","se crea el viewmodel" )
            if(!result.isNullOrEmpty()){
                recetaModel.postValue(result[0])
                isLoading.postValue(false)
            }
        }
    }
    fun randomReceta() {
        isLoading.postValue(true)
        val receta = getRandomRecetaUseCase()
        if(receta!=null){
            Log.d("Información","Receta" )
              recetaModel.postValue(receta!!)
        }
        isLoading.postValue(false)
    }
}










