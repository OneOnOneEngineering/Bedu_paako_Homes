package com.bedupaakohomes.data.repository.homeStays.dataSource

import com.bedupaakohomes.data.model.HomeStay

interface HomeStaysLocalDataSource {
    suspend fun getHomeStaysFromDb() : List<HomeStay>
    suspend fun saveHomeStaysToDb(homeStays : List<HomeStay>)
    suspend fun clearAll()

}