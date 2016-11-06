package pl.design.patterns.singleton


object Config {
    init {
        println("Inicjalizacja obiketu: $this")
    }

    fun loadConfig() {
        println("Aktualna konfiguracja wyglada nastepujaco")
    }
}