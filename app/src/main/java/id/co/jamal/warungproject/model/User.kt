package id.co.jamal.warungproject.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

open class User {

    @SerializedName("email")
    @Expose
    open var email: String? = null

    @SerializedName("namaLengkap")
    @Expose
    open var namaLengkap: String? = null

    @SerializedName("password")
    @Expose
    open var password: String? = null
}