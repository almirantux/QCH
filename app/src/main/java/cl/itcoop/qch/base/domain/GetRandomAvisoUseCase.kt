package cl.itcoop.qch.base.domain

import cl.itcoop.qch.base.vistaModelo.AvisoModel
import cl.itcoop.qch.base.data.modelo.AvisoProvider

class GetRandomAvisoUseCase {

    operator fun invoke(): AvisoModel?{
        val avisos = AvisoProvider.avisos
        if(!avisos.isNullOrEmpty()){
            val randomNumber = (avisos.indices).random()
            return avisos[randomNumber]
        }
        return null
    }
}