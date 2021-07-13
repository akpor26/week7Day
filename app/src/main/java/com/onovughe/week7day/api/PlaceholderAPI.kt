package com.onovughe.week7day.api

import com.onovughe.week7day.model.User
import retrofit2.Call
import retrofit2.http.GET

interface PlaceholderAPI {
    @GET("users")

    fun getUsers(): Call<List<User>>
}