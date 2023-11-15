package com.bedupaakohomes.data.model

data class HomeStay(
    val id : Int,
    val name : String,
    val place : String,
    var starRating : String,
    var price : String,
    val type : String,
    var availabilityDates : String,
    val propertyImages : List<String>
)