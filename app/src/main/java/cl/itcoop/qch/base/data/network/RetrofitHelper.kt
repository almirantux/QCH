package cl.itcoop.qch.base.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

        fun getRetrofit(): Retrofit {
            return Retrofit.Builder()
                .baseUrl("http://itcoop.cl/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

}