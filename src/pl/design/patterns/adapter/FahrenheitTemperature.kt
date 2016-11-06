package pl.design.patterns.adapter

import java.math.BigDecimal


class FahrenheitTemperature(var celsiusTemperature: CelsiusTemperature) : Temperature {

    override var temperature: BigDecimal
        get() = convertCelsiusToFahrenheit(celsiusTemperature.temperature)
        set(temperatureInF) {
            celsiusTemperature.temperature = convertFahrenheitToCelsius(temperatureInF)
        }

    private fun convertFahrenheitToCelsius(f: BigDecimal): BigDecimal = (f.minus(BigDecimal.valueOf(32)).multiply(BigDecimal.valueOf(5 / 9)))

    private fun convertCelsiusToFahrenheit(c: BigDecimal): BigDecimal = (c.multiply(BigDecimal.valueOf(9)).divide(BigDecimal.valueOf(5))).plus(BigDecimal.valueOf(32))
}

