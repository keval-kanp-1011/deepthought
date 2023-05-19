package dev.kevalkanpariya.deepthoughtedutech.remote

import dev.kevalkanpariya.deepthoughtedutech.util.ApiResponse
import retrofit2.http.GET

interface DeepThoughtApi {

    @GET("/assets/uploads/files/others/project.json")
    suspend fun getAllProjects(): ApiResponse
}