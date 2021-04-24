package com.example.apieveris.api

import android.telecom.Call
import com.example.apieveris.model.Product
import retrofit2.http.GET

interface ProductApi {
    @GET("getdata.php")
    fun getProductApi(): retrofit2.Call<List<Product>>
}