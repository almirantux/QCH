package cl.itcoop.qch.base.domain

import cl.itcoop.qch.base.VistaModelo.RecetaModel
import cl.itcoop.qch.base.data.RecetaRepository

class GetRecetasUseCase {
    private val repository = RecetaRepository()
    suspend operator fun invoke():List<RecetaModel>? = repository.getAllRecetas()


}