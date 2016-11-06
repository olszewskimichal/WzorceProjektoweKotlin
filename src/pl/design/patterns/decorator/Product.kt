package pl.design.patterns.decorator

import java.math.BigDecimal


abstract class Product {
    abstract fun getPrice(): BigDecimal
    abstract fun getDescription()
}