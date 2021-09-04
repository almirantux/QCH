package cl.itcoop.qch.base.vistamodelo


import androidx.lifecycle.*
import cl.itcoop.qch.base.room.Ficha
import cl.itcoop.qch.base.room.FichaDatabase
import cl.itcoop.qch.base.data.FichaRepository

class FichaViewModel( private val repo: FichaRepository):  ViewModel() {
     val allFichas : LiveData<List<Ficha>> = repo.fichas.asLiveData()



// obtener todas las fichas
/*
    fun getAllFichas() {
        val fichaDao = FichaDatabase.getDatabase().fichaDao()
        val list = fichaDao.getAllFicha()
         allFichas.postValue(list)
    }



// insertar una ficha
    fun insertaFicha(entity: Ficha){
        val fichaDao = FichaDatabase.getDatabase(getApplication()).fichaDao()
        fichaDao.insertFicha(entity)
        getAllFichas()
    }
// actualizar una ficha
    fun updateFicha(entity: Ficha){
        val fichaDao = FichaDatabase.getDatabase(getApplication()).fichaDao()
        fichaDao.update(entity)
        getAllFichas()
    }

*/
    class FichaViewModelFactory(private val repo: FichaRepository): ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(FichaViewModel::class.java)) {
                @Suppress("UNCHECKED_CAST")
                return FichaViewModel(repo) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")

        }
    }

}