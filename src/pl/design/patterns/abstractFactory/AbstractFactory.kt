package pl.design.patterns.abstractFactory

fun main(args: Array<String>) {
    val factory1 = ConcretePlantFactory1()
    val factory2 = ConcretePlantFactory2()

    val orange1 = factory1.createOrangePlant()
    val orange2 = factory2.createOrangePlant()
    val apple1 = factory1.createApplePlant()
    val apple2 = factory2.createApplePlant()
    orange1.getName()
    orange2.getName()
    apple1.getName()
    apple2.getName()
}

/**

Zalety:
- Łatwa wymiana rodziny produktów.
- pójność produktów – w sytuacji, gdy pożądane jest, aby klasy produkty były z określonej rodziny, fabryka bardzo dobrze to zapewnia.

Wady:
- Trudność w dołączaniu nowego produktu do rodzin produktów, spowodowana koniecznością rozszerzania interfejsów fabryki.
- jak dla mnie za duzo walenia sie z tymi intefrejsami


 **/
