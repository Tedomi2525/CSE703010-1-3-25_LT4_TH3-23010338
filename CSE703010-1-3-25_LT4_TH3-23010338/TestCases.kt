/**
 * Bài thực hành 3: Kiểm thử hộp đen
 * Test cases cho các hàm toán học
 */

import kotlin.math.abs

// ==================== 1. KIỂM THỬ CHU VI HÌNH CHỮ NHẬT ====================

/**
 * Test case cho calculateRectanglePerimeter
 * Phân lớp tương đương:
 * - Valid: length > 0, width > 0
 * - Invalid: length <= 0 hoặc width <= 0
 * 
 * Giá trị biên:
 * - Boundary: length = 0, width = 0
 * - Min valid: length > 0, width > 0 (rất nhỏ)
 * - Max: giá trị rất lớn
 */
fun testRectanglePerimeter() {
    println("\n=== TEST: Chu vi hình chữ nhật ===")
    
    // Valid case 1: Hình vuông
    println("Test 1 - Hình vuông 5x5:")
    try {
        val result = calculateRectanglePerimeter(5.0, 5.0)
        println("  Input: length=5, width=5")
        println("  Expected: 20.0")
        println("  Got: $result")
        println("  Status: ${if (result == 20.0) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    // Valid case 2: Hình chữ nhật thường
    println("\nTest 2 - Hình chữ nhật 3x7:")
    try {
        val result = calculateRectanglePerimeter(3.0, 7.0)
        println("  Input: length=3, width=7")
        println("  Expected: 20.0")
        println("  Got: $result")
        println("  Status: ${if (result == 20.0) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    // Valid case 3: Giá trị nhỏ (boundary)
    println("\nTest 3 - Giá trị rất nhỏ 0.1x0.1:")
    try {
        val result = calculateRectanglePerimeter(0.1, 0.1)
        println("  Input: length=0.1, width=0.1")
        println("  Expected: 0.4")
        println("  Got: $result")
        println("  Status: ${if (abs(result - 0.4) < 0.0001) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    // Valid case 4: Giá trị thập phân
    println("\nTest 4 - Giá trị thập phân 2.5x3.5:")
    try {
        val result = calculateRectanglePerimeter(2.5, 3.5)
        println("  Input: length=2.5, width=3.5")
        println("  Expected: 12.0")
        println("  Got: $result")
        println("  Status: ${if (result == 12.0) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    // Invalid case 1: Chiều dài = 0
    println("\nTest 5 - INVALID: length=0, width=5:")
    try {
        val result = calculateRectanglePerimeter(0.0, 5.0)
        println("  ✗ FAIL: Should throw exception but got $result")
    } catch (e: IllegalArgumentException) {
        println("  ✓ PASS: Exception thrown - ${e.message}")
    }
    
    // Invalid case 2: Chiều rộng = 0
    println("\nTest 6 - INVALID: length=5, width=0:")
    try {
        val result = calculateRectanglePerimeter(5.0, 0.0)
        println("  ✗ FAIL: Should throw exception but got $result")
    } catch (e: IllegalArgumentException) {
        println("  ✓ PASS: Exception thrown - ${e.message}")
    }
    
    // Invalid case 3: Chiều dài âm
    println("\nTest 7 - INVALID: length=-5, width=5:")
    try {
        val result = calculateRectanglePerimeter(-5.0, 5.0)
        println("  ✗ FAIL: Should throw exception but got $result")
    } catch (e: IllegalArgumentException) {
        println("  ✓ PASS: Exception thrown - ${e.message}")
    }
    
    // Invalid case 4: Cả hai âm
    println("\nTest 8 - INVALID: length=-3, width=-4:")
    try {
        val result = calculateRectanglePerimeter(-3.0, -4.0)
        println("  ✗ FAIL: Should throw exception but got $result")
    } catch (e: IllegalArgumentException) {
        println("  ✓ PASS: Exception thrown - ${e.message}")
    }
}

// ==================== 2. KIỂM THỬ DIỆN TÍCH HÌNH CHỮ NHẬT ====================

fun testRectangleArea() {
    println("\n=== TEST: Diện tích hình chữ nhật ===")
    
    // Valid case 1: Hình vuông
    println("Test 1 - Hình vuông 4x4:")
    try {
        val result = calculateRectangleArea(4.0, 4.0)
        println("  Input: length=4, width=4")
        println("  Expected: 16.0")
        println("  Got: $result")
        println("  Status: ${if (result == 16.0) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    // Valid case 2: Hình chữ nhật
    println("\nTest 2 - Hình chữ nhật 3x8:")
    try {
        val result = calculateRectangleArea(3.0, 8.0)
        println("  Input: length=3, width=8")
        println("  Expected: 24.0")
        println("  Got: $result")
        println("  Status: ${if (result == 24.0) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    // Valid case 3: Giá trị nhỏ
    println("\nTest 3 - Giá trị nhỏ 0.5x0.5:")
    try {
        val result = calculateRectangleArea(0.5, 0.5)
        println("  Input: length=0.5, width=0.5")
        println("  Expected: 0.25")
        println("  Got: $result")
        println("  Status: ${if (abs(result - 0.25) < 0.0001) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    // Invalid case 1: width = 0
    println("\nTest 4 - INVALID: length=5, width=0:")
    try {
        val result = calculateRectangleArea(5.0, 0.0)
        println("  ✗ FAIL: Should throw exception but got $result")
    } catch (e: IllegalArgumentException) {
        println("  ✓ PASS: Exception thrown - ${e.message}")
    }
    
    // Invalid case 2: Chiều dài âm
    println("\nTest 5 - INVALID: length=-4, width=6:")
    try {
        val result = calculateRectangleArea(-4.0, 6.0)
        println("  ✗ FAIL: Should throw exception but got $result")
    } catch (e: IllegalArgumentException) {
        println("  ✓ PASS: Exception thrown - ${e.message}")
    }
}

// ==================== 3. KIỂM THỬ PHƯƠNG TRÌNH BẬC 2 ====================

fun testQuadraticEquation() {
    println("\n=== TEST: Phương trình bậc 2 ===")
    
    // Valid case 1: 2 nghiệm thực phân biệt
    println("Test 1 - Có 2 nghiệm: x^2 - 5x + 6 = 0:")
    try {
        val result = solveQuadraticEquation(1.0, -5.0, 6.0)
        println("  Input: a=1, b=-5, c=6")
        println("  Expected: 2 nghiệm thực (x=2, x=3)")
        println("  Got: ${result?.first} - ${result?.second}")
        println("  Status: ${if (result?.first?.size == 2) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    // Valid case 2: Nghiệm kép
    println("\nTest 2 - Nghiệm kép: x^2 - 2x + 1 = 0:")
    try {
        val result = solveQuadraticEquation(1.0, -2.0, 1.0)
        println("  Input: a=1, b=-2, c=1")
        println("  Expected: 1 nghiệm kép (x=1)")
        println("  Got: ${result?.first} - ${result?.second}")
        println("  Status: ${if (result?.first?.size == 1 && abs(result.first[0] - 1.0) < 0.0001) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    // Valid case 3: Vô nghiệm
    println("\nTest 3 - Vô nghiệm: x^2 + 1 = 0:")
    try {
        val result = solveQuadraticEquation(1.0, 0.0, 1.0)
        println("  Input: a=1, b=0, c=1")
        println("  Expected: Vô nghiệm")
        println("  Got: ${result?.first} - ${result?.second}")
        println("  Status: ${if (result?.first?.isEmpty() == true) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    // Valid case 4: a=0 (phương trình bậc 1)
    println("\nTest 4 - Phương trình bậc 1: 2x + 3 = 0:")
    try {
        val result = solveQuadraticEquation(0.0, 2.0, 3.0)
        println("  Input: a=0, b=2, c=3")
        println("  Expected: 1 nghiệm (x=-1.5)")
        println("  Got: ${result?.first} - ${result?.second}")
        println("  Status: ${if (result?.first?.size == 1 && abs(result.first[0] - (-1.5)) < 0.0001) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    // Invalid case 1: a=0, b=0, c≠0 (vô nghiệm)
    println("\nTest 5 - INVALID: a=0, b=0, c=5:")
    try {
        val result = solveQuadraticEquation(0.0, 0.0, 5.0)
        println("  Input: a=0, b=0, c=5")
        println("  Expected: Vô nghiệm")
        println("  Got: ${result?.first} - ${result?.second}")
        println("  Status: ${if (result?.first?.isEmpty() == true) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    // Invalid case 2: a=0, b=0, c=0 (vô số nghiệm)
    println("\nTest 6 - INVALID: a=0, b=0, c=0:")
    try {
        val result = solveQuadraticEquation(0.0, 0.0, 0.0)
        println("  Input: a=0, b=0, c=0")
        println("  Expected: Vô số nghiệm")
        println("  Got: ${result?.first} - ${result?.second}")
        println("  Status: ${if (result?.first?.isEmpty() == true && result.second.contains("vô số")) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
}

// ==================== 4. KIỂM THỬ SỐ NGÀY TRONG THÁNG ====================

fun testDaysInMonth() {
    println("\n=== TEST: Số ngày trong tháng ===")
    
    // Valid cases: Các tháng có 31 ngày
    println("Test 1 - Tháng 1 (31 ngày):")
    try {
        val result = getDaysInMonth(1, 2024)
        println("  Input: month=1, year=2024")
        println("  Expected: 31")
        println("  Got: $result")
        println("  Status: ${if (result == 31) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    // Tháng 4 (30 ngày)
    println("\nTest 2 - Tháng 4 (30 ngày):")
    try {
        val result = getDaysInMonth(4, 2024)
        println("  Input: month=4, year=2024")
        println("  Expected: 30")
        println("  Got: $result")
        println("  Status: ${if (result == 30) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    // Tháng 2 năm nhuận
    println("\nTest 3 - Tháng 2 năm nhuận (2024):")
    try {
        val result = getDaysInMonth(2, 2024)
        println("  Input: month=2, year=2024")
        println("  Expected: 29")
        println("  Got: $result")
        println("  Status: ${if (result == 29) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    // Tháng 2 năm thường
    println("\nTest 4 - Tháng 2 năm thường (2023):")
    try {
        val result = getDaysInMonth(2, 2023)
        println("  Input: month=2, year=2023")
        println("  Expected: 28")
        println("  Got: $result")
        println("  Status: ${if (result == 28) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    // Tháng 2 năm chia hết cho 100 nhưng không chia hết cho 400
    println("\nTest 5 - Tháng 2 năm 1900 (không nhuận):")
    try {
        val result = getDaysInMonth(2, 1900)
        println("  Input: month=2, year=1900")
        println("  Expected: 28")
        println("  Got: $result")
        println("  Status: ${if (result == 28) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    // Tháng 2 năm chia hết cho 400 (nhuận)
    println("\nTest 6 - Tháng 2 năm 2000 (nhuận):")
    try {
        val result = getDaysInMonth(2, 2000)
        println("  Input: month=2, year=2000")
        println("  Expected: 29")
        println("  Got: $result")
        println("  Status: ${if (result == 29) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    // Invalid case 1: Tháng = 0
    println("\nTest 7 - INVALID: month=0:")
    try {
        val result = getDaysInMonth(0, 2024)
        println("  ✗ FAIL: Should throw exception but got $result")
    } catch (e: IllegalArgumentException) {
        println("  ✓ PASS: Exception thrown - ${e.message}")
    }
    
    // Invalid case 2: Tháng = 13
    println("\nTest 8 - INVALID: month=13:")
    try {
        val result = getDaysInMonth(13, 2024)
        println("  ✗ FAIL: Should throw exception but got $result")
    } catch (e: IllegalArgumentException) {
        println("  ✓ PASS: Exception thrown - ${e.message}")
    }
    
    // Invalid case 3: Tháng âm
    println("\nTest 9 - INVALID: month=-1:")
    try {
        val result = getDaysInMonth(-1, 2024)
        println("  ✗ FAIL: Should throw exception but got $result")
    } catch (e: IllegalArgumentException) {
        println("  ✓ PASS: Exception thrown - ${e.message}")
    }
    
    // Invalid case 4: Năm âm
    println("\nTest 10 - INVALID: year=-1:")
    try {
        val result = getDaysInMonth(5, -1)
        println("  ✗ FAIL: Should throw exception but got $result")
    } catch (e: IllegalArgumentException) {
        println("  ✓ PASS: Exception thrown - ${e.message}")
    }
}

// ==================== 5. KIỂM THỬ SỐ NGUYÊN TỐ ====================

fun testPrime() {
    println("\n=== TEST: Kiểm tra số nguyên tố ===")
    
    // Valid cases: Các số nguyên tố
    println("Test 1 - n=2 (số nguyên tố nhỏ nhất):")
    val r1 = isPrime(2)
    println("  Input: 2")
    println("  Expected: true")
    println("  Got: $r1")
    println("  Status: ${if (r1) "✓ PASS" else "✗ FAIL"}")
    
    println("\nTest 2 - n=17 (số nguyên tố):")
    val r2 = isPrime(17)
    println("  Input: 17")
    println("  Expected: true")
    println("  Got: $r2")
    println("  Status: ${if (r2) "✓ PASS" else "✗ FAIL"}")
    
    println("\nTest 3 - n=97 (số nguyên tố lớn):")
    val r3 = isPrime(97)
    println("  Input: 97")
    println("  Expected: true")
    println("  Got: $r3")
    println("  Status: ${if (r3) "✓ PASS" else "✗ FAIL"}")
    
    // Valid cases: Các số không phải nguyên tố
    println("\nTest 4 - n=1 (không phải số nguyên tố):")
    val r4 = isPrime(1)
    println("  Input: 1")
    println("  Expected: false")
    println("  Got: $r4")
    println("  Status: ${if (!r4) "✓ PASS" else "✗ FAIL"}")
    
    println("\nTest 5 - n=4 (hợp số):")
    val r5 = isPrime(4)
    println("  Input: 4")
    println("  Expected: false")
    println("  Got: $r5")
    println("  Status: ${if (!r5) "✓ PASS" else "✗ FAIL"}")
    
    println("\nTest 6 - n=100 (hợp số lớn):")
    val r6 = isPrime(100)
    println("  Input: 100")
    println("  Expected: false")
    println("  Got: $r6")
    println("  Status: ${if (!r6) "✓ PASS" else "✗ FAIL"}")
    
    println("\nTest 7 - n=9 (bình phương của số nguyên tố):")
    val r7 = isPrime(9)
    println("  Input: 9")
    println("  Expected: false")
    println("  Got: $r7")
    println("  Status: ${if (!r7) "✓ PASS" else "✗ FAIL"}")
    
    // Invalid cases
    println("\nTest 8 - INVALID: n=0:")
    val r8 = isPrime(0)
    println("  Input: 0")
    println("  Expected: false")
    println("  Got: $r8")
    println("  Status: ${if (!r8) "✓ PASS" else "✗ FAIL"}")
    
    println("\nTest 9 - INVALID: n=-5:")
    val r9 = isPrime(-5)
    println("  Input: -5")
    println("  Expected: false")
    println("  Got: $r9")
    println("  Status: ${if (!r9) "✓ PASS" else "✗ FAIL"}")
}

// ==================== 6. KIỂM THỬ TỔNG LUÂN PHIÊN ====================

fun testAlternatingSum() {
    println("\n=== TEST: Tổng S = 1 - 2 + 3 - 4 + ... + n ===")
    
    // Valid cases
    println("Test 1 - n=5:")
    try {
        val result = calculateAlternatingSum(5)
        println("  Input: 5")
        println("  Expected: 1 - 2 + 3 - 4 + 5 = 3")
        println("  Got: $result")
        println("  Status: ${if (result == 3L) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    println("\nTest 2 - n=4:")
    try {
        val result = calculateAlternatingSum(4)
        println("  Input: 4")
        println("  Expected: 1 - 2 + 3 - 4 = -2")
        println("  Got: $result")
        println("  Status: ${if (result == -2L) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    println("\nTest 3 - n=1:")
    try {
        val result = calculateAlternatingSum(1)
        println("  Input: 1")
        println("  Expected: 1")
        println("  Got: $result")
        println("  Status: ${if (result == 1L) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    println("\nTest 4 - n=2:")
    try {
        val result = calculateAlternatingSum(2)
        println("  Input: 2")
        println("  Expected: 1 - 2 = -1")
        println("  Got: $result")
        println("  Status: ${if (result == -1L) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    println("\nTest 5 - n=10:")
    try {
        val result = calculateAlternatingSum(10)
        println("  Input: 10")
        println("  Expected: 1 - 2 + 3 - 4 + 5 - 6 + 7 - 8 + 9 - 10 = -5")
        println("  Got: $result")
        println("  Status: ${if (result == -5L) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    // Invalid cases
    println("\nTest 6 - INVALID: n=0:")
    try {
        val result = calculateAlternatingSum(0)
        println("  ✗ FAIL: Should throw exception but got $result")
    } catch (e: IllegalArgumentException) {
        println("  ✓ PASS: Exception thrown - ${e.message}")
    }
    
    println("\nTest 7 - INVALID: n=-3:")
    try {
        val result = calculateAlternatingSum(-3)
        println("  ✗ FAIL: Should throw exception but got $result")
    } catch (e: IllegalArgumentException) {
        println("  ✓ PASS: Exception thrown - ${e.message}")
    }
}

// ==================== 7. KIỂM THỬ ƯCLN ====================

fun testGCD() {
    println("\n=== TEST: ƯCLN của a và b ===")
    
    // Valid cases
    println("Test 1 - a=48, b=18:")
    try {
        val result = findGCD(48, 18)
        println("  Input: a=48, b=18")
        println("  Expected: 6")
        println("  Got: $result")
        println("  Status: ${if (result == 6) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    println("\nTest 2 - a=100, b=50:")
    try {
        val result = findGCD(100, 50)
        println("  Input: a=100, b=50")
        println("  Expected: 50")
        println("  Got: $result")
        println("  Status: ${if (result == 50) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    println("\nTest 3 - a=17, b=19 (số nguyên tố):")
    try {
        val result = findGCD(17, 19)
        println("  Input: a=17, b=19")
        println("  Expected: 1")
        println("  Got: $result")
        println("  Status: ${if (result == 1) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    println("\nTest 4 - a=0, b=5:")
    try {
        val result = findGCD(0, 5)
        println("  Input: a=0, b=5")
        println("  Expected: 5")
        println("  Got: $result")
        println("  Status: ${if (result == 5) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    println("\nTest 5 - a=-12, b=8 (số âm):")
    try {
        val result = findGCD(-12, 8)
        println("  Input: a=-12, b=8")
        println("  Expected: 4")
        println("  Got: $result")
        println("  Status: ${if (result == 4) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    println("\nTest 6 - a=1, b=1:")
    try {
        val result = findGCD(1, 1)
        println("  Input: a=1, b=1")
        println("  Expected: 1")
        println("  Got: $result")
        println("  Status: ${if (result == 1) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    // Invalid case
    println("\nTest 7 - INVALID: a=0, b=0:")
    try {
        val result = findGCD(0, 0)
        println("  ✗ FAIL: Should throw exception but got $result")
    } catch (e: IllegalArgumentException) {
        println("  ✓ PASS: Exception thrown - ${e.message}")
    }
}

// ==================== 8. KIỂM THỬ TỔNG GIAI THỪA ====================

fun testFactorialSum() {
    println("\n=== TEST: Tổng S = 1! + 2! + 3! + ... + n! ===")
    
    // Valid cases
    println("Test 1 - n=3:")
    try {
        val result = calculateFactorialSum(3)
        println("  Input: 3")
        println("  Expected: 1! + 2! + 3! = 1 + 2 + 6 = 9")
        println("  Got: $result")
        println("  Status: ${if (result == 9L) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    println("\nTest 2 - n=1:")
    try {
        val result = calculateFactorialSum(1)
        println("  Input: 1")
        println("  Expected: 1! = 1")
        println("  Got: $result")
        println("  Status: ${if (result == 1L) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    println("\nTest 3 - n=4:")
    try {
        val result = calculateFactorialSum(4)
        println("  Input: 4")
        println("  Expected: 1! + 2! + 3! + 4! = 1 + 2 + 6 + 24 = 33")
        println("  Got: $result")
        println("  Status: ${if (result == 33L) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    println("\nTest 4 - n=5:")
    try {
        val result = calculateFactorialSum(5)
        println("  Input: 5")
        println("  Expected: 1! + 2! + 3! + 4! + 5! = 1 + 2 + 6 + 24 + 120 = 153")
        println("  Got: $result")
        println("  Status: ${if (result == 153L) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    println("\nTest 5 - n=10:")
    try {
        val result = calculateFactorialSum(10)
        println("  Input: 10")
        println("  Expected: 3628800 + 362880 + ... + 2 + 1")
        println("  Got: $result")
        // 10! = 3628800, 9! = 362880, ..., expected = 4037913
        println("  Status: ${if (result == 4037913L) "✓ PASS" else "✗ FAIL"}")
    } catch (e: Exception) {
        println("  ✗ FAIL: ${e.message}")
    }
    
    // Invalid cases
    println("\nTest 6 - INVALID: n=0:")
    try {
        val result = calculateFactorialSum(0)
        println("  ✗ FAIL: Should throw exception but got $result")
    } catch (e: IllegalArgumentException) {
        println("  ✓ PASS: Exception thrown - ${e.message}")
    }
    
    println("\nTest 7 - INVALID: n=-5:")
    try {
        val result = calculateFactorialSum(-5)
        println("  ✗ FAIL: Should throw exception but got $result")
    } catch (e: IllegalArgumentException) {
        println("  ✓ PASS: Exception thrown - ${e.message}")
    }
}

fun main() {
    println("╔════════════════════════════════════════════════════════════╗")
    println("║  BÀI THỰC HÀNH 3: KIỂM THỬ HỘP ĐEN (BLACK BOX TESTING)   ║")
    println("║  Lớp: CSE703010-1-3-25 LT4 TH3 - MSSV: 23010328          ║")
    println("╚════════════════════════════════════════════════════════════╝")
    
    testRectanglePerimeter()
    testRectangleArea()
    testQuadraticEquation()
    testDaysInMonth()
    testPrime()
    testAlternatingSum()
    testGCD()
    testFactorialSum()
    
    println("\n╔════════════════════════════════════════════════════════════╗")
    println("║  HOÀN THÀNH TẤT CẢ CÁC TEST CASE                          ║")
    println("╚════════════════════════════════════════════════════════════╝")
}
