package com.bedupaakohomes.data.repository.homeStays.dataSource

interface HomeStaysRemoteDataSource {
    suspend fun getHomeStaysFromFirebase() : Response<>
}