package run

fun main() {
    example(ValueClassContainer(ValueClass("a"), "b"))
}

value class ValueClass<T>(
    val value: T,
)

class ValueClassContainer<T>(
    val valueClass: ValueClass<T>,
    val somethingMore: String
)

fun example(data: ValueClassContainer<*>) {
    println(data.valueClass)
    println(data.somethingMore)
}