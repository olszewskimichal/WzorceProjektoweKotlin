package pl.design.patterns.observer


class HexObserver : Observer {
    override fun update(subject: Subject) {
        println("Hex string ${Integer.toHexString(subject.state)}")
    }
}