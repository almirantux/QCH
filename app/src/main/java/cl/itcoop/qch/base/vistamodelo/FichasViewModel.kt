package cl.itcoop.qch.base.vistamodelo

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import cl.itcoop.qch.base.data.FichaRepository
import cl.itcoop.qch.base.room.Ficha
import kotlinx.coroutines.launch

class FichaViewModel(private val repository: FichaRepository) : ViewModel() {
    val allFichas: LiveData<List<Ficha>> = repository.allFichas.asLiveData()
    fun insert(ficha: Ficha) = viewModelScope.launch {
        repository.insert(ficha)
    }
}

class FichaViewModelFactory(private val repository: FichaRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(FichaViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return FichaViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
