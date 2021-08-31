package cl.itcoop.qch.base.vistaModelo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cl.itcoop.qch.base.data.modelo.ArticuloModel
import cl.itcoop.qch.base.domain.GetArticulosUseCase
import cl.itcoop.qch.base.domain.GetRandomArticuloUseCase
import kotlinx.coroutines.launch

class ArticuloViewModel : ViewModel() {

    val articuloModel = MutableLiveData<ArticuloModel>()
    val isLoading = MutableLiveData<Boolean>()

    var getArticulosUseCase = GetArticulosUseCase()
    var getRandomArticuloUseCase = GetRandomArticuloUseCase()

    fun onCreate() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getArticulosUseCase()

            if(!result.isNullOrEmpty()){
                articuloModel.postValue(result[0])
                isLoading.postValue(false)
            }
        }
    }


    fun randomArticulo() {
        isLoading.postValue(true)
        val articulo = getRandomArticuloUseCase()
        if(articulo!=null){
            articuloModel.postValue(articulo!!)
        }
        isLoading.postValue(false)
    }
}

