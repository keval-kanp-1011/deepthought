package dev.kevalkanpariya.deepthoughtedutech.di

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.kevalkanpariya.deepthoughtedutech.remote.DeepThoughtApi
import dev.kevalkanpariya.deepthoughtedutech.remote.repository.ProjectRepository
import dev.kevalkanpariya.deepthoughtedutech.remote.repository.ProjectRepositoryImpl
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @OptIn(ExperimentalSerializationApi::class)
    @Provides
    @Singleton
    fun provideApi(): DeepThoughtApi {
        return Retrofit
            .Builder()
            .baseUrl("http://dev.deepthought.education")
            .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
            .build()
            .create(DeepThoughtApi::class.java)
    }

    @Provides
    @Singleton
    fun provideProjectRepository(api: DeepThoughtApi): ProjectRepository {
        return ProjectRepositoryImpl(api = api)
    }
}