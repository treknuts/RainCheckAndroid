package dev.treknuts.vibe.data.data_sources

import dev.treknuts.vibe.data.models.Weather
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

//class WeatherDataSource(private val weatherApi: WeatherApi, private val ioDispatcher: CoroutineDispatcher) {
//    val apiInterface = WeatherApi.create().fetchLatestWeather()
//    suspend fun fetchLatestWeather(): Call<List<Weather>> =
//        withContext(ioDispatcher) {
//            apiInterface.enqueue(object: Callback<List<Weather>>{
//                override fun onResponse(
//                    call: Call<List<Weather>>,
//                    response: Response<List<Weather>>
//                ) {
//                    if (response?.body() != null)
//                        return response.body()
//                }
//
//                override fun onFailure(call: Call<List<Weather>>, t: Throwable) {
//                    TODO("Not yet implemented")
//                }
//            })
//        }
//}

interface WeatherApi {

    @GET("VisualCrossingWebServices/rest/services/timeline/58078?unitGroup=us&key=Y6HYDFNLFYNTNG7HDGR5CD9XH&contentType=json")
    fun fetchLatestWeather(): Call<List<Weather>>

}
