package com.example.applicationavii

import retrofit2.http.GET

interface DataService {

    @GET("gifs/trending?api_key=7oB3VQTacn7iTuoNfHz847TahDHzvHOc")
    fun getGifs(): retrofit2.Call<DataResult>



}