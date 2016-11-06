package pl.design.patterns.observer

open class Subject {
    var state: Int = 0
        set(value) {
            field = value
            notifyObservers()
        }
    val observers: MutableList<Observer> = mutableListOf()

    fun attach(observer: Observer) {
        observers.add(observer)
    }

    fun detach(observer: Observer) {
        observers.remove(observer)
    }

    fun notifyObservers() {
        observers.forEach { it.update(this) }

    }
}