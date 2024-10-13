package com.sunnyweather.android.logic

import android.media.session.MediaSessionManager.RemoteUserInfo
import androidx.lifecycle.liveData
import com.sunnyweather.android.logic.model.Place
import com.sunnyweather.android.logic.network.SunnyWeatherNetwork
import kotlinx.coroutines.Dispatchers
import java.lang.Exception
import java.lang.RuntimeException

object Repository {

    fun searchPlaces(query: String) = liveData(Dispatchers.IO) {
        val result = try {
            val placeResponce = SunnyWeatherNetwork.searchPlace(query)
            if (placeResponce.status == "ok") {
                val place = placeResponce.places
                Result.success(place)
            } else {
                Result.failure(RuntimeException("response status is ${placeResponce.status}"))
            }
        } catch (e:Exception){
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }

}