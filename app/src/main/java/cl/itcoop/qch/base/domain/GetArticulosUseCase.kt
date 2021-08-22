package cl.itcoop.qch.base.domain

import cl.itcoop.qch.base.VistaModelo.ArticuloModel
import cl.itcoop.qch.base.data.ArticuloRepository

class GetArticulosUseCase {
    private val repository = ArticuloRepository()
    suspend operator fun invoke():List<ArticuloModel>? = repository.getAllArticulos()


}