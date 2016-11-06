package pl.design.patterns.abstractFactory


abstract class PlantFactory {
    abstract fun createOrangePlant(): OrangePlant
    abstract fun createApplePlant(): ApplePlant
}