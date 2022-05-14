package cl.itcoop.qch.base.vistamodelo


import androidx.lifecycle.*
import cl.itcoop.qch.base.room.Ficha
//import cl.itcoop.qch.base.room.FichaDatabase
import cl.itcoop.qch.base.data.FichaRepository

class FichaViewModel( private val repo: FichaRepository):  ViewModel() {
     val allFichas : LiveData<List<Ficha>> = repo.fichas.asLiveData()

 class FichaViewModelFactory(private val repo: FichaRepository): ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(FichaViewModel::class.java)) {
                @Suppress("UNCHECKED_CAST")
                return FichaViewModel(repo) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")

        }
    }

}