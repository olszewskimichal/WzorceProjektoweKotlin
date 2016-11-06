package pl.design.patterns.factoryMethod


class PizzaFactory {
    fun getPizza(type: PizzaType): Pizza {
        when (type) {
            PizzaType.Hawaiian -> return HawaiianPizza()
            PizzaType.Deluxe -> return DeluxePizza()
        }
    }
}