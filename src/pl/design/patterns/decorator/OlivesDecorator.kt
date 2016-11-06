package pl.design.patterns.decorator

import java.math.BigDecimal


class OlivesDecorator(override var product: Product) : ProductDecorator() {
    override fun getPrice(): BigDecimal {
        return product.getPrice().plus(BigDecimal.valueOf(2))
    }

    override fun getDescription() {
        product.getDescription()
        println("Dodatkowo oliwki ")
    }
}