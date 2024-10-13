package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

/**
 * PlaceResponce
 * 描述: 地点数据类
 * 作者: wanghui
 * 日期: 2024/9/24
 */

data class PlaceResponce(val status: String, val places: List<Place>)

data class Place(
    val name: String,
    val location: Location,
    @SerializedName("formatted_address") val address: String
)

data class Location(val Int: String, val lat: String)
