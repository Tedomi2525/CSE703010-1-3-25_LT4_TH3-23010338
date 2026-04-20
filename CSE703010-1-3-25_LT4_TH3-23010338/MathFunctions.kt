/**
 * Bài thực hành 3: Kiểm thử hộp đen
 * Các hàm toán học phục vụ kiểm thử hộp đen
 */

import kotlin.math.sqrt
import kotlin.math.abs

/**
 * 1. Tính chu vi hình chữ nhật
 * Input: chiều dài (length), chiều rộng (width)
 * Output: chu vi
 */
fun calculateRectanglePerimeter(length: Double, width: Double): Double {
    if (length <= 0 || width <= 0) {
        throw IllegalArgumentException("Chiều dài và chiều rộng phải > 0")
    }
    return 2 * (length + width)
}

/**
 * 2. Tính diện tích hình chữ nhật
 * Input: chiều dài (length), chiều rộng (width)
 * Output: diện tích
 */
fun calculateRectangleArea(length: Double, width: Double): Double {
    if (length <= 0 || width <= 0) {
        throw IllegalArgumentException("Chiều dài và chiều rộng phải > 0")
    }
    return length * width
}

/**
 * 3. Giải phương trình bậc 2: ax^2 + bx + c = 0
 * Input: a, b, c
 * Output: Pair<List<Double>> hoặc null
 */
fun solveQuadraticEquation(a: Double, b: Double, c: Double): Pair<List<Double>, String>? {
    if (a == 0.0) {
        if (b == 0.0) {
            if (c == 0.0) {
                return Pair(listOf(), "Phương trình có vô số nghiệm")
            } else {
                return Pair(listOf(), "Phương trình vô nghiệm")
            }
        } else {
            val x = -c / b
            return Pair(listOf(x), "Phương trình bậc 1, nghiệm: $x")
        }
    }

    val delta = b * b - 4 * a * c

    return when {
        delta < 0 -> Pair(listOf(), "Phương trình vô nghiệm (delta < 0)")
        delta == 0.0 -> {
            val x = -b / (2 * a)
            Pair(listOf(x), "Phương trình có nghiệm kép: $x")
        }
        else -> {
            val sqrtDelta = sqrt(delta)
            val x1 = (-b + sqrtDelta) / (2 * a)
            val x2 = (-b - sqrtDelta) / (2 * a)
            Pair(listOf(x1, x2), "Phương trình có 2 nghiệm: $x1, $x2")
        }
    }
}

/**
 * 4. Tính số ngày của một tháng
 * Input: tháng (month), năm (year)
 * Output: số ngày
 */
fun getDaysInMonth(month: Int, year: Int): Int {
    if (month < 1 || month > 12) {
        throw IllegalArgumentException("Tháng phải từ 1 đến 12")
    }
    if (year < 1) {
        throw IllegalArgumentException("Năm phải > 0")
    }

    return when (month) {
        1, 3, 5, 7, 8, 10, 12 -> 31
        4, 6, 9, 11 -> 30
        2 -> {
            if (isLeapYear(year)) 29 else 28
        }
        else -> throw IllegalArgumentException("Tháng không hợp lệ")
    }
}

/**
 * Kiểm tra năm nhuận
 */
fun isLeapYear(year: Int): Boolean {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
}

/**
 * 5. Kiểm tra n có phải là số nguyên tố hay không
 * Input: n
 * Output: true/false
 */
fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    if (n == 2) return true
    if (n % 2 == 0) return false

    for (i in 3..sqrt(n.toDouble()).toInt() step 2) {
        if (n % i == 0) return false
    }
    return true
}

/**
 * 6. Tính tổng S = 1 - 2 + 3 - 4 + ... + n
 * Input: n
 * Output: tổng
 */
fun calculateAlternatingSum(n: Int): Long {
    if (n < 1) {
        throw IllegalArgumentException("n phải >= 1")
    }

    var sum = 0L
    for (i in 1..n) {
        sum += if (i % 2 == 1) i else -i
    }
    return sum
}

/**
 * 7. Tìm ƯCLN (GCD) của a và b
 * Input: a, b
 * Output: ƯCLN
 */
fun findGCD(a: Int, b: Int): Int {
    if (a == 0 && b == 0) {
        throw IllegalArgumentException("a và b không thể đều bằng 0")
    }

    var x = abs(a)
    var y = abs(b)

    while (y != 0) {
        val temp = y
        y = x % y
        x = temp
    }

    return x
}

/**
 * Tính giai thừa của n
 */
fun factorial(n: Int): Long {
    if (n < 0) {
        throw IllegalArgumentException("n phải >= 0")
    }
    if (n == 0 || n == 1) return 1

    var result = 1L
    for (i in 2..n) {
        result *= i
    }
    return result
}

/**
 * 8. Tính tổng S = 1! + 2! + 3! + ... + n!
 * Input: n
 * Output: tổng
 */
fun calculateFactorialSum(n: Int): Long {
    if (n < 1) {
        throw IllegalArgumentException("n phải >= 1")
    }

    var sum = 0L
    for (i in 1..n) {
        sum += factorial(i)
    }
    return sum
}
