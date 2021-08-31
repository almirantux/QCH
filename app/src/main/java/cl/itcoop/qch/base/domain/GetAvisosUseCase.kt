package cl.itcoop.qch.base.domain

import cl.itcoop.qch.base.data.AvisoRepository

class GetAvisosUseCase {
    private val repository = AvisoRepository()
    suspend operator fun invoke() = repository.getAllAvisos()
}