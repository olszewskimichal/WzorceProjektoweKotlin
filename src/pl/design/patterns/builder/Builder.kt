package pl.design.patterns.builder

fun main(args: Array<String>) {
    val person = Person.create {
        name = "Peter"
        surname = "Slesarew"
        age = 28
    }
    println(person)

    val person2 = Person.create {
        name = "Peter"
        surname = "Slesarew"
    }
    println(person2)

    val person3 = Person.create {
        name = "Peter"
    }
    println(person3)

    val person4 = Person.create {}
    println(person4)

}

/**
plus
Duża skalowalność (dodawanie nowych reprezentacji obiektów jest uproszczone).
minus
Duża liczba obiektów reprezentujących konkretne produkty.
 */

