package dev.treknuts.vibe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import dev.treknuts.vibe.data.data_sources.WeatherApi
import dev.treknuts.vibe.data.models.Weather
import org.w3c.dom.Text
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.StringBuilder

const val BASE_URL = "https://weather.visualcrossing.com/"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fetchWeather()
    }

    private fun fetchWeather() {
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(WeatherApi::class.java)

        val weatherDate = retrofitBuilder.fetchLatestWeather()

        weatherDate.enqueue(object : Callback<List<Weather>?> {
            override fun onResponse(
                call: Call<List<Weather>?>,
                response: Response<List<Weather>?>
            ) {
                val response = response.body()!!

                val sb = StringBuilder()
                for (weather in response) {
                    for (day in weather.days) {
                        sb.append(day.datetime)
                        sb.append("\n")
                    }
                }
                findViewById<TextView>(R.id.weatherText).text = sb
            }

            override fun onFailure(call: Call<List<Weather>?>, t: Throwable) {
                Log.d("MainActivity", "onFailure: " + t.message)
            }
        })
    }
}
