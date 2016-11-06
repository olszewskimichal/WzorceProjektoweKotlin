package pl.design.patterns.decorator


abstract class ProductDecorator : Product() {
    abstract var product: Product

    abstract override fun getDescription()
}