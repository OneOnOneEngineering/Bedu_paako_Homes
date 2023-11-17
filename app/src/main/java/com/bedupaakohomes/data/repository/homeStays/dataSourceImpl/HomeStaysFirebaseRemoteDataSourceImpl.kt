package com.bedupaakohomes.data.repository.homeStays.dataSourceImpl

import android.util.Log
import com.bedupaakohomes.data.model.HomeStay
import com.bedupaakohomes.data.repository.homeStays.dataSource.HomeStaysFirebaseRemoteDataSource
import com.google.android.gms.tasks.Task
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener

class HomeStaysFirebaseRemoteDataSourceImpl(
    private val homeStaysDatabaseReference: DatabaseReference
) : HomeStaysFirebaseRemoteDataSource {

    private lateinit var listOfHomeStays: MutableList<HomeStay>
    override suspend fun getHomeStaysFromFirebase(): List<HomeStay> {
        homeStaysDatabaseReference.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                for (childSnapshot in snapshot.children) {
                    val data = childSnapshot.getValue(HomeStay::class.java)
                    data?.let {
                        listOfHomeStays.add(it)
                    }
                }
            }

            override fun onCancelled(error: DatabaseError) {
                //capture logs or retry
            }

        })
        return listOfHomeStays
    }
}