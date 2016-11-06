package pl.design.patterns.abstractFactory


class ConcretePlantFactory2 : PlantFactory() {
    override fun createOrangePlant(): OrangePlant {
        return ConcreteOrange2();
    }

    override fun createApplePlant(): ApplePlant {
        return ConcreteApple2()
    }
}