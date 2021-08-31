package cl.itcoop.qch.base.domain

import cl.itcoop.qch.base.data.ArticuloRepository

class GetArticulosUseCase {
    private val repository = ArticuloRepository()
    suspend operator fun invoke() = repository.getAllArticulos()
}