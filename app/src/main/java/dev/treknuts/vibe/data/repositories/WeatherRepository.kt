package dev.treknuts.vibe.data.repositories

import dev.treknuts.vibe.data.models.Weather
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

//class WeatherRepository(private val weatherDataSource: WeatherDataSource) {
//    private val latestWeatherMutex = Mutex()
//
//    private var latestWeather: List<Weather> = emptyList()
//
//    suspend fun fetchLatestWeather(refresh: Boolean = false): List<Weather> {
//        if (refresh || latestWeather.isEmpty()) {
//            val networkResult = weatherDataSource.fetchLatestWeather()
//            latestWeatherMutex.withLock {
//                this.latestWeather = networkResult
//            }
//        }
//        return latestWeatherMutex.withLock { this.latestWeather }
//    }
//
//}