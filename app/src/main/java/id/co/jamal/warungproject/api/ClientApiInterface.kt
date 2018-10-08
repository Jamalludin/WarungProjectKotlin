package id.co.jamal.warungproject.api

import id.co.jamal.warungproject.model.User
import retrofit2.Call
import retrofit2.http.*

interface ClientApiInterface{

    @GET("/public/users/find")
    fun getUser():Call<User>

    @POST("/public/users/save")
    @FormUrlEncoded
    fun saveUser(@Body user: User):Call<User>
}