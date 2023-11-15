package com.bedupaakohomes.domain.useCase

import com.bedupaakohomes.data.model.HomeStay
import com.bedupaakohomes.domain.repository.HomeStaysRepository

class GetHomeStaysUseCase (private val homeStaysRepository : HomeStaysRepository) {
    suspend fun execute() : List<HomeStay>? = homeStaysRepository.getHomeStays()
}