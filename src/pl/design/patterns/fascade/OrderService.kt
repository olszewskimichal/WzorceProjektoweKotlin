package pl.design.patterns.fascade

class OrderService {
    fun order(login: String, product: String) {
        println("Uzytkownik ${login} zamowil ${product}")
    }
}