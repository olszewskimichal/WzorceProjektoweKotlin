package pl.design.patterns.factoryMethod

fun main(args: Array<String>) {
    val firstOrder = PizzaFactory().getPizza(PizzaType.Hawaiian)
    firstOrder.getName()
    val secondOrder = PizzaFactory().getPizza(PizzaType.Deluxe)
    secondOrder.getName()
}

/**
plusy
- hermetyzacja tworzenia obiektow poprzez jeden wspolny interfejs
- ulatwia tworzenie obiektow zaleznych od ustawien konfiguracyjnych
 **/