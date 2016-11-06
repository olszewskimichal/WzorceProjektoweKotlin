package pl.design.patterns.fascade

class FascadeTest {
    val loginService = LoginService()
    val orderService = OrderService()
    val registerService = RegisterService()
    fun login(login: String, password: String) {
        loginService.login(login, password)
    }

    fun register(login: String) {
        registerService.register(login)
    }

    fun order(login: String, product: String) {
        orderService.order(login, product)
    }
}
