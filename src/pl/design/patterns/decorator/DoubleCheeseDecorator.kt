package pl.design.patterns.decorator

import java.math.BigDecimal


class DoubleCheeseDecorator(override var product: Product) : ProductDecorator() {
    override fun getPrice(): BigDecimal {
        return product.getPrice().plus(BigDecimal.ONE)
    }

    override fun getDescription() {
        product.getDescription()
        println("Dodatkowo podwojny ser ")
    }
}