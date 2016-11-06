package pl.design.patterns.abstractFactory


class ConcretePlantFactory1 : PlantFactory() {
    override fun createOrangePlant(): OrangePlant {
        return ConcreteOrange1()
    }

    override fun createApplePlant(): ApplePlant {
        return ConcreteApple1()
    }
}