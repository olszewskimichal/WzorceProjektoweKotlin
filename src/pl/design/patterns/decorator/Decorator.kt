package pl.design.patterns.decorator

fun main(args: Array<String>) {
    val orders: MutableList<ProductDecorator> = arrayListOf()
    var pizza = Pizza()
    var doubleChessePizza = DoubleCheeseDecorator(pizza)
    var olivesPizza = OlivesDecorator(pizza)
    orders.add(doubleChessePizza)
    orders.add(olivesPizza)
    var cheeseAndOlivesPizza = OlivesDecorator(doubleChessePizza)
    orders.add(cheeseAndOlivesPizza)


    for (order in orders) {
        println("Zamowienie")
        order.getDescription()
        println(order.getPrice())
        println()
    }


}

