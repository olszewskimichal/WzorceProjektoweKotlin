package pl.design.patterns.decorator

import java.math.BigDecimal


class Pizza() : Product() {
    override fun getDescription() {
        println("Zwykla pizza ")
    }

    override fun getPrice(): BigDecimal {
        return BigDecimal.TEN
    }
}