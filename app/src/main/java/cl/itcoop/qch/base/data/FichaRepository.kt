package cl.itcoop.qch.base.data

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow
import cl.itcoop.qch.base.room.*

class FichaRepository (private val fichaDao: FichaDAO){


        val allFichas: Flow<List<Ficha>> = fichaDao.getAllFicha()

        @Suppress("RedundantSuspendModifier")
        @WorkerThread
        suspend fun insert(fichas: Ficha) {
            fichaDao.insertFicha(fichas)

        }
    }
class UsuarioRepository (private val usuarioDao: UsuarioDAO){


    val allUsuarios: Flow<List<Usuario>> = usuarioDao.getAllUsuario()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(usuarios: Usuario) {
        usuarioDao.insertUsuario(usuarios)

    }
}
class GeneroRepository (private val generoDao: GeneroDAO){


    val allGeneros: Flow<List<Genero>> = generoDao.getAllGenero()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(generos: Genero) {
        generoDao.insertGenero(generos)

    }
}