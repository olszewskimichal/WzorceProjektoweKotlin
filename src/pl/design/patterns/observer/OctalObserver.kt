package pl.design.patterns.observer


class OctalObserver : Observer {
    override fun update(subject: Subject) {
        println("Octal string: ${Integer.toOctalString(subject.state)}")
    }
}