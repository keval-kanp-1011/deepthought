package dev.kevalkanpariya.deepthoughtedutech.remote.repository

import dev.kevalkanpariya.deepthoughtedutech.remote.DeepThoughtApi
import dev.kevalkanpariya.deepthoughtedutech.util.Project
import dev.kevalkanpariya.deepthoughtedutech.util.Resource
import javax.inject.Inject


class ProjectRepositoryImpl @Inject constructor(
    private val api: DeepThoughtApi
): ProjectRepository {
    override suspend fun getAllProjects(): Resource<List<Project>?> {
        val data = api.getAllProjects().response.data
        if (data != null) {
            return Resource.Success(data = data)
        } else {
            return Resource.Error("Unable retrieve Data")
        }


    }
}