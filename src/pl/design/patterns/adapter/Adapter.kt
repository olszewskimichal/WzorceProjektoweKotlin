package pl.design.patterns.adapter

import java.math.BigDecimal

fun main(args: Array<String>) {
    val celsiusTemperature = CelsiusTemperature(BigDecimal.ZERO)
    val fahrenheitTemperature = FahrenheitTemperature(celsiusTemperature)

    celsiusTemperature.temperature = BigDecimal.valueOf(36.6)
    println("${celsiusTemperature.temperature} C -> ${fahrenheitTemperature.temperature} F")

    fahrenheitTemperature.temperature = BigDecimal.valueOf(100)
    println("${fahrenheitTemperature.temperature} F -> ${celsiusTemperature.temperature} C")
}


