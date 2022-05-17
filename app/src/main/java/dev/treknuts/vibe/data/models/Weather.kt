package dev.treknuts.vibe.data.models

data class Weather(
    val address: String,
    val alerts: List<Alert>,
    val currentConditions: CurrentConditions,
    val days: List<Day>,
    val description: String,
    val latitude: Double,
    val longitude: Double,
    val queryCost: Int,
    val resolvedAddress: String,
    val stations: Stations,
    val timezone: String,
    val tzoffset: Int
)