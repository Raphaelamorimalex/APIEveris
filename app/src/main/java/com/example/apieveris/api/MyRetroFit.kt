package com.example.apieveris.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class MyRetroFit {

    private val retroFit: Retrofit
    fun productApi(): ProductApi{
        return retroFit.create(ProductApi::class.java)
    }

    companion object{
        private const val BASE_URL = "https://uniqueandrocode.com.000webhostapp.com/hiren/androidtutorial/mycart/"

        var myRetroFit: MyRetroFit? = null
        @get:Synchronized
        val instance: MyRetroFit?
                get(){
                    if(myRetroFit == null){
                        myRetroFit = MyRetroFit()
                    }
                    return myRetroFit
                }
    }

    init {
        retroFit = Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }
}