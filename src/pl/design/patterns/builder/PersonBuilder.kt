package pl.design.patterns.builder


class PersonBuilder private constructor() {

    constructor(init: PersonBuilder.() -> Unit) : this() {
        init()
    }

    var name: String = "Imie"
    var surname: String = "Nazwisko"
    var age: Int = 0

    fun name(init: PersonBuilder.() -> String) = apply { name = init() }

    fun surname(init: PersonBuilder.() -> String) = apply { surname = init() }

    fun age(init: PersonBuilder.() -> Int) = apply { age = init() }

    fun build() = Person(this)
}