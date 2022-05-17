package dev.treknuts.vibe.data.models

data class Hour(
    val cloudcover: Int,
    val conditions: String,
    val datetime: String,
    val datetimeEpoch: Int,
    val dew: Double,
    val feelslike: Double,
    val humidity: Double,
    val icon: String,
    val precip: Int,
    val precipprob: Int,
    val preciptype: Any,
    val pressure: Double,
    val severerisk: Int,
    val snow: Int,
    val snowdepth: Int,
    val solarenergy: Double,
    val solarradiation: Int,
    val source: String,
    val stations: List<String>,
    val temp: Double,
    val uvindex: Int,
    val visibility: Double,
    val winddir: Int,
    val windgust: Double,
    val windspeed: Double
)