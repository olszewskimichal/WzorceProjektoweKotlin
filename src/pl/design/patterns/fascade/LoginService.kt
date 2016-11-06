package pl.design.patterns.fascade

class LoginService {
    fun login(login: String, password: String) {
        println("Logowanie uzytkownika ${login} z haslem ${password}")
    }
}