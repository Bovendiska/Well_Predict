package com.will.capstonebangkit.data.api.retrofit

import com.will.capstonebangkit.data.api.response.LoginResponse
import com.will.capstonebangkit.data.api.response.RegisterResponse
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface AuthApiService {
    @FormUrlEncoded
    @POST("register")
    fun registerUser(
        @Field("email") email: String,
        @Field("name") username: String,
        @Field("password") password: String
    ): Call<RegisterResponse>

    @FormUrlEncoded
    @POST("login")
    fun loginUser(
        @Field("email") email: String,
        @Field("password") password: String
    ): Call<LoginResponse>
}