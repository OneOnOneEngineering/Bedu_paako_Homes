package com.bedupaakohomes.domain.repository

import com.bedupaakohomes.data.model.HomeStay

interface HomeStaysRepository {
suspend fun getHomeStays() : List<HomeStay>?
}