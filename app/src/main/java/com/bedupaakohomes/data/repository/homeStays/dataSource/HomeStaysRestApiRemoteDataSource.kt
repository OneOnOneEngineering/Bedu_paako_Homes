package com.bedupaakohomes.data.repository.homeStays.dataSource

import com.bedupaakohomes.data.model.HomeStay
import retrofit2.Response

interface HomeStaysRestApiRemoteDataSource {
    suspend fun getHomeStaysFromApi() : Response<HomeStay>
}