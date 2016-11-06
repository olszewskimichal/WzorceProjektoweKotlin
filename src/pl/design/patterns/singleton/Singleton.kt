package pl.design.patterns.singleton

fun main(args: Array<String>) {
    Config.loadConfig()
    Config.loadConfig()
}


/**
plusy
- tworzenie nowej instacji zachodzi dopiero przy pierwszym uzyciu  (jest tworzona leniwie)
- wyłacznie jedna instajca np polaczenie z baza danych
- mozna wykorzystac do ładowania i buforowania zasobów
- mozna wykorzystac w fasadach bo zazwyczaj chcemy jedna instacje takowej
minusy
- brak elastycznosci jezeli chodzi o instancje obiektu
- utrudnia testowanie
- naduzywanie wzorca moze powodawac nadmierne zuzywania zasosobow i problemy z wydajnoscia
 **/
