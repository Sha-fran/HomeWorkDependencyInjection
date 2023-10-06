package com.example.homeworkdependencyinjection

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ApplicationModul {
    @Provides
    @Singleton
    fun getApiClient() = ApiClient()

    @Provides
    @Singleton
    fun getRepositiry(apiClient: ApiClient) = SuperheroRepository(apiClient)
}
