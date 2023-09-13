package Polynomial;

class Polynomial(
    coeffs: Map<Int, Double>

) {
    private val _coeffs: MutableMap<Int, Double> = coeffs.toMutableMap()
    val coeffs = _coeffs.toMap()

    constructor(vararg coeffs: Double) : this(coeffs.mapIndexed { index, value -> index to value}.filter { it.second != 0.0 }.toMap())
    override fun toString() =
        _coeffs.toList().joinToString(separator = ";"){"${it.first}: ${it.second}"}


}