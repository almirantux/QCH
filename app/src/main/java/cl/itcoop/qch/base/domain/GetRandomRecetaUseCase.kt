package cl.itcoop.qch.base.domain

import cl.itcoop.qch.base.data.modelo.RecetaModel
import cl.itcoop.qch.base.data.modelo.RecetaProvider

class GetRandomRecetaUseCase {
    operator fun invoke(): RecetaModel?{
        val recetas = RecetaProvider.recetas
        if(!recetas.isNullOrEmpty()){
            val randomNumber = (recetas.indices).random()
            return recetas[randomNumber]
        }
        return null
    }
}