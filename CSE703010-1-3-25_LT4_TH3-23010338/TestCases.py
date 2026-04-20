import pytest
import math
from problems import (
    calculate_rectangle_perimeter,
    calculate_rectangle_area,
    solve_quadratic_equation,
    get_days_in_month,
    is_prime,
    calculate_alternating_sum,
    find_gcd,
    calculate_factorial_sum
)

# ==================== ISSUE 1: DỮ LIỆU HỢP LỆ ====================

def test_valid_cases():
    # 1. Chu vi & Diện tích HCN
    assert calculate_rectangle_perimeter(5, 5) == 20.0
    assert calculate_rectangle_perimeter(3, 7) == 20.0
    assert calculate_rectangle_area(4, 4) == 16.0
    assert calculate_rectangle_area(3, 8) == 24.0

    # 2. Phương trình bậc 2 (2 nghiệm thực & nghiệm kép)
    roots1 = solve_quadratic_equation(1, -5, 6) # x=2, x=3
    assert set(roots1) == {2.0, 3.0}
    
    roots2 = solve_quadratic_equation(1, -2, 1) # x=1
    assert roots2 == [1.0]

    # 3. Số ngày trong tháng
    assert get_days_in_month(1, 2024) == 31
    assert get_days_in_month(4, 2024) == 30
    assert get_days_in_month(2, 2024) == 29 # Năm nhuận
    assert get_days_in_month(2, 2023) == 28 # Năm thường
    assert get_days_in_month(2, 1900) == 28 # Chia hết 100 không chia hết 400

    # 4. Số nguyên tố
    assert is_prime(2) is True
    assert is_prime(17) is True
    assert is_prime(4) is False
    assert is_prime(1) is False

    # 5. Tổng luân phiên (1-2+3-4+...n)
    assert calculate_alternating_sum(5) == 3   # 1-2+3-4+5
    assert calculate_alternating_sum(4) == -2  # 1-2+3-4

    # 6. ƯCLN
    assert find_gcd(48, 18) == 6
    assert find_gcd(17, 19) == 1
    assert find_gcd(0, 5) == 5

    # 7. Tổng giai thừa
    assert calculate_factorial_sum(3) == 9    # 1!+2!+3! = 1+2+6
    assert calculate_factorial_sum(1) == 1

# ==================== ISSUE 2: DỮ LIỆU KHÔNG HỢP LỆ & BIÊN ====================

def test_invalid_and_boundary_cases():
    # 1. Hình chữ nhật (Cạnh <= 0)
    with pytest.raises(ValueError):
        calculate_rectangle_perimeter(0, 5)
    with pytest.raises(ValueError):
        calculate_rectangle_area(-4, 6)

    # 2. Phương trình bậc 2 (Vô nghiệm hoặc a=0)
    # Vô nghiệm thực (Nếu hàm trả về list rỗng)
    assert solve_quadratic_equation(1, 0, 1) == []
    
    # a=0 (Trở thành PT bậc 1)
    assert solve_quadratic_equation(0, 2, -3) == [1.5]

    # 3. Tháng không hợp lệ
    with pytest.raises(ValueError):
        get_days_in_month(13, 2024)
    with pytest.raises(ValueError):
        get_days_in_month(0, 2024)
    with pytest.raises(ValueError):
        get_days_in_month(5, -1)

    # 4. Số nguyên tố (Biên/Âm)
    assert is_prime(0) is False
    assert is_prime(-5) is False

    # 5. Tổng luân phiên (n <= 0)
    with pytest.raises(ValueError):
        calculate_alternating_sum(0)

    # 6. ƯCLN (0, 0)
    with pytest.raises(ValueError):
        find_gcd(0, 0)

    # 7. Tổng giai thừa (n <= 0)
    with pytest.raises(ValueError):
        calculate_factorial_sum(0)