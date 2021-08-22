package cl.itcoop.qch.base.vistaModelo

import androidx.lifecycle.MutableLiveData
import cl.itcoop.qch.base.data.modelo.ArticuloModel
import cl.itcoop.qch.base.data.modelo.ArticuloProvider

class ArticuloViewModel : ViewModel() {

    val articuloModel = MutableLiveData<ArticuloModel>()

    fun randomArticulo() {
        val currentArticulo = ArticuloProvider.random()
        articuloModel.postValue(currentArticulo)
    }
}

