package id.co.jamal.warungproject.api

import id.co.jamal.warungproject.model.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ClientApiInterface{

    @GET("users/find")
    fun getUser():Call<User>
}