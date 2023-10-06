package com.example.homeworkdependencyinjection

import retrofit2.Response

class SuperheroRepository(private val client: ApiClient) {
    private val api = client.client.create(ApiInterface::class.java)

    suspend fun getSuperheroList():Response<MutableList<DataClasses.Superheroes>> = api.getSuperheroes()
}
