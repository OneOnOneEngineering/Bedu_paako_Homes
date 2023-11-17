package com.bedupaakohomes.data.repository.homeStays.dataSource

import com.bedupaakohomes.data.model.HomeStay
import com.google.android.gms.tasks.Task
import com.google.firebase.database.DataSnapshot

interface HomeStaysFirebaseRemoteDataSource {
    suspend fun getHomeStaysFromFirebase() : List<HomeStay>
}