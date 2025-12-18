package com.example.questapi_223.apiservice

import com.example.questapi_223.modeldata.DataSiswa
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ServiceApiSiswa {
    @GET("bacateman.php")
    suspend fun getSiswa(): List<DataSiswa>

    @POST("insertTM.php")
    suspend fun postSiswa(@Body dataSiswa: DataSiswa):retrofit2.Response<Void>

//    @GET("baca1teman.php/{id}")
//    suspend fun getStatusSiswa(@Query("id") id: Int): DataSiswa
//
//    @PUT("editTM")
}