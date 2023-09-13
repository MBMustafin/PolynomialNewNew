import Polynomial.Polynomial
import kotlin.random.Random

fun main(args: Array<String>) {
    val p1 = Polynomial(mapOf(1 to 5.0, 2 to -3.0, 5 to 1.0))
    println(p1)
    val p2 = Polynomial(0.0, 0.0, 7.0, -4.0)
    println(p2)

    var t: Polynomial? = null
    var rnd = Random.nextBoolean()
    if (rnd) t = Polynomial(3.0, 9.0, 5.0)
    if (t != null) {
        println(t.coeffs.size)
    }

}