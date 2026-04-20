import math

# ==================== 1. TÍNH CHU VI HÌNH CHỮ NHẬT ====================
def calculate_rectangle_perimeter(length, width):
    if length <= 0 or width <= 0:
        raise ValueError("Chiều dài và chiều rộng phải > 0")
    return 2 * (length + width)

# ==================== 2. TÍNH DIỆN TÍCH HÌNH CHỮ NHẬT ====================
def calculate_rectangle_area(length, width):
    if length <= 0 or width <= 0:
        raise ValueError("Chiều dài và chiều rộng phải > 0")
    return length * width

# ==================== 3. GIẢI PHƯƠNG TRÌNH BẬC 2 ====================
def solve_quadratic_equation(a, b, c):
    if a == 0:
        if b == 0:
            if c == 0:
                return ([], "Phương trình có vô số nghiệm")
            else:
                return ([], "Phương trình vô nghiệm")
        else:
            x = -c / b
            return ([x], f"Phương trình bậc 1, nghiệm: {x}")

    delta = b**2 - 4 * a * c

    if delta < 0:
        return ([], "Phương trình vô nghiệm (delta < 0)")
    elif delta == 0:
        x = -b / (2 * a)
        return ([x], f"Phương trình có nghiệm kép: {x}")
    else:
        sqrt_delta = math.sqrt(delta)
        x1 = (-b + sqrt_delta) / (2 * a)
        x2 = (-b - sqrt_delta) / (2 * a)
        return ([x1, x2], f"Phương trình có 2 nghiệm: {x1}, {x2}")

# ==================== 4. TÍNH SỐ NGÀY CỦA MỘT THÁNG ====================
def is_leap_year(year):
    return (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0)

def get_days_in_month(month, year):
    if month < 1 or month > 12:
        raise ValueError("Tháng phải từ 1 đến 12")
    if year < 1:
        raise ValueError("Năm phải > 0")

    if month in [1, 3, 5, 7, 8, 10, 12]:
        return 31
    elif month in [4, 6, 9, 11]:
        return 30
    elif month == 2:
        return 29 if is_leap_year(year) else 28
    else:
        raise ValueError("Tháng không hợp lệ")

# ==================== 5. KIỂM TRA SỐ NGUYÊN TỐ ====================
def is_prime(n):
    if n < 2: return False
    if n == 2: return True
    if n % 2 == 0: return False

    for i in range(3, int(math.sqrt(n)) + 1, 2):
        if n % i == 0:
            return False
    return True

# ==================== 6. TÍNH TỔNG S = 1 - 2 + 3 - 4 + ... + n ====================
def calculate_alternating_sum(n):
    if n < 1:
        raise ValueError("n phải >= 1")
    
    total_sum = 0
    for i in range(1, n + 1):
        total_sum += i if i % 2 == 1 else -i
    return total_sum

# ==================== 7. TÌM ƯCLN (GCD) ====================
def find_gcd(a, b):
    if a == 0 and b == 0:
        raise ValueError("a và b không thể đều bằng 0")
    
    x, y = abs(a), abs(b)
    while y != 0:
        x, y = y, x % y
    return x

# ==================== 8. TÍNH TỔNG S = 1! + 2! + ... + n! ====================
def factorial(n):
    if n < 0:
        raise ValueError("n phải >= 0")
    if n == 0 or n == 1:
        return 1
    
    result = 1
    for i in range(2, n + 1):
        result *= i
    return result

def calculate_factorial_sum(n):
    if n < 1:
        raise ValueError("n phải >= 1")
    
    total_sum = 0
    for i in range(1, n + 1):
        total_sum += factorial(i)
    return total_sum