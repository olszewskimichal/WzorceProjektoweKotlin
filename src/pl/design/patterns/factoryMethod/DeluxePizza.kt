package pl.design.patterns.factoryMethod


class DeluxePizza() : Pizza {
    override fun getName() {
        println("Zamowiona pizza to Deluxe")
    }
}