package cl.itcoop.qch.base.domain

import cl.itcoop.qch.base.vistaModelo.AvisoModel
import cl.itcoop.qch.base.data.AvisoRepository

class GetAvisosUseCase {
    private val repository = AvisoRepository()
    suspend operator fun invoke():List<AvisoModel>? = repository.getAllAvisos()


}