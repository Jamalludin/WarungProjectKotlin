package id.co.jamal.warungproject.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

open class ClientApi{

    fun create() : ClientApiInterface{
        val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Url.URL)
                .build()

        return retrofit.create(ClientApiInterface::class.java)
    }
}