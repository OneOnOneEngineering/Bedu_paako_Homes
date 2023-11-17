package com.bedupaakohomes.data.repository.homeStays.dataSource

import com.bedupaakohomes.data.model.HomeStay

interface HomeStaysCacheDataSource {
    suspend fun getHomeStaysFromCache(): List<HomeStay>
    suspend fun saveHomeStaysToCache(homeStays : List<HomeStay>)
}