package dev.kevalkanpariya.deepthoughtedutech.remote.repository

import dev.kevalkanpariya.deepthoughtedutech.util.Project
import dev.kevalkanpariya.deepthoughtedutech.util.Resource

interface ProjectRepository {

    suspend fun getAllProjects():Resource<List<Project>?>
}