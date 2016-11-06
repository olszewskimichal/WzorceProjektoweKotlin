package pl.design.patterns.adapter

import java.math.BigDecimal

class CelsiusTemperature(override var temperature: BigDecimal) : Temperature