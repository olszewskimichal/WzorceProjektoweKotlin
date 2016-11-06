package pl.design.patterns.builder

data class Person private constructor(val name: String, val surname: String, val age: Int) {

    constructor(builder: PersonBuilder) : this(builder.name, builder.surname, builder.age)

    companion object {
        fun create(init: PersonBuilder.() -> Unit) = PersonBuilder(init).build()
    }

}