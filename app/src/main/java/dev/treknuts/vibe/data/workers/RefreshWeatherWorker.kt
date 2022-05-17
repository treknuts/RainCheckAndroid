//package dev.treknuts.vibe.data.workers
//
//import android.content.Context
//import androidx.work.CoroutineWorker
//import androidx.work.WorkerParameters
//
//// Over my head at the moment
//class RefreshWeatherWorker(private val weatherRepository: WeatherRepository,
//context: Context,
//params: WorkerParameters) : CoroutineWorker(context, params) {
//
//    override suspend fun doWork(): Result = try {
//        weatherRepository.fetchLatestWeather()
//        Result.success()
//    } catch (error: Throwable) {
//        Result.failure()
//    }
//}