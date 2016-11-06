package pl.design.patterns.observer

fun main(args: Array<String>) {
    val subject = Subject()

    val binaryObserver = BinaryObserver()
    val octalObserver = OctalObserver()
    val hexObserver = HexObserver()
    subject.attach(binaryObserver)
    subject.attach(octalObserver)
    subject.attach(hexObserver)

    println("First state change: 15")
    subject.state = 15
    println("Second state change: 10")
    subject.state = 10

    subject.detach(binaryObserver)
    subject.detach(octalObserver)
    subject.detach(hexObserver)
}

/**
Zalety:
Luźna zależność między obiektem obserwującym i obserwowanym. Ponieważ nie wiedzą one wiele o sobie nawzajem, mogą być niezależnie rozszerzane i rozbudowywane bez wpływu na drugą stronę.
Relacja między obiektem obserwowanym a obserwatorem tworzona jest podczas wykonywania programu i może być dynamicznie zmieniana.
Możliwość zablokowania klientowi drogi do bezpośredniego korzystania ze złożonego systemu, jeśli jest to konieczne.

Wady:
Obserwatorzy nie znają innych obserwatorów, co w pewnych sytuacjach może wywołać trudne do znalezienia skutki uboczne.
 **/