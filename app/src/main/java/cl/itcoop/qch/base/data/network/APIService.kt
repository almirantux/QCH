package cl.itcoop.qch.base.data.network


import cl.itcoop.qch.base.data.modelo.ArticuloModel
import cl.itcoop.qch.base.data.modelo.AvisoModel
import cl.itcoop.qch.base.data.modelo.RecetaModel
import cl.itcoop.qch.base.data.modelo.VideoModel
import retrofit2.Response
import retrofit2.http.GET

interface APIService
{
        @GET("recapi/post.php")
        suspend fun getAllRecetas(): Response<List<RecetaModel>>
        @GET("vidapi/post.php")
        suspend fun getAllVideos(): Response<List<VideoModel>>
        @GET("artapi/post.php")
        suspend fun getAllArticulos(): Response<List<ArticuloModel>>
        @GET("aviapi/post.php")
        suspend fun getAllAvisos(): Response<List<AvisoModel>>

}