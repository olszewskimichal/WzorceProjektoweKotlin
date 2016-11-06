package pl.design.patterns.observer


class BinaryObserver : Observer {
    override fun update(subject: Subject) {
        println("Binary String= ${Integer.toBinaryString(subject.state)}")
    }

}