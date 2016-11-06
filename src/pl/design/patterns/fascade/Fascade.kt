package pl.design.patterns.fascade

fun main(args: Array<String>) {
    val test = FascadeTest()
    test.register("User")
    test.login("User", "password")
    test.order("User", "product")
}
/**
plusy:
- wprowadzenie w placji podziału na warstwy, uniezalazniajac niektore elementy systemu oraz jego złozonosc

 **/