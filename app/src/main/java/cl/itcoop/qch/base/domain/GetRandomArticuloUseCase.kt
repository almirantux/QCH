package cl.itcoop.qch.base.domain

import cl.itcoop.qch.base.VistaModelo.ArticuloModel
import cl.itcoop.qch.base.data.modelo.ArticuloProvider

class GetRandomArticuloUseCase {

    operator fun invoke(): ArticuloModel?{
        val articulos = ArticuloProvider.articulos
        if(!articulos.isNullOrEmpty()){
            val randomNumber = (articulos.indices).random()
            return articulos[randomNumber]
        }
        return null
    }
}