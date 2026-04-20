import pytest
from problems import calculate_rectangle_perimeter, calculate_rectangle_area, solve_quadratic_equation, get_days_in_month, is_prime, calculate_alternating_sum, find_gcd, calculate_factorial_sum

def test_valid_cases():
    # 1. Chu vi & Diện tích HCN
    assert calculate_rectangle_perimeter(5, 5) == 20.0
    assert calculate_rectangle_perimeter(3, 7) == 20.0
    assert calculate_rectangle_area(4, 4) == 16.0
    assert calculate_rectangle_area(3, 8) == 24.0

    # 2. Phương trình bậc 2 (Chỉ lấy phần tử [0] là danh sách nghiệm)
    roots1, _ = solve_quadratic_equation(1, -5, 6) 
    assert set(roots1) == {2.0, 3.0}
    
    roots2, _ = solve_quadratic_equation(1, -2, 1)
    assert roots2 == [1.0]

    # 3. Số ngày trong tháng
    assert get_days_in_month(1, 2024) == 31
    assert get_days_in_month(2, 2024) == 29 
    assert get_days_in_month(2, 2023) == 28 

    # 4. Số nguyên tố
    assert is_prime(2) is True
    assert is_prime(17) is True
    assert is_prime(4) is False

    # 5. Tổng luân phiên
    assert calculate_alternating_sum(5) == 3
    assert calculate_alternating_sum(4) == -2

    # 6. ƯCLN
    assert find_gcd(48, 18) == 6
    assert find_gcd(0, 5) == 5

    # 7. Tổng giai thừa
    assert calculate_factorial_sum(3) == 9

def test_invalid_and_boundary_cases():
    # 1. Hình chữ nhật
    with pytest.raises(ValueError):
        calculate_rectangle_perimeter(0, 5)
    
    # 2. Phương trình bậc 2
    # Vô nghiệm: Kiểm tra danh sách nghiệm (phần tử [0]) có rỗng không
    res_vo_nghiem, _ = solve_quadratic_equation(1, 0, 1)
    assert res_vo_nghiem == []
    
    # a=0: Kiểm tra nghiệm bậc 1
    res_bac_1, _ = solve_quadratic_equation(0, 2, -3)
    assert res_bac_1 == [1.5]

    # 3. Tháng không hợp lệ
    with pytest.raises(ValueError):
        get_days_in_month(13, 2024)

    # 4. Số nguyên tố biên
    assert is_prime(0) is False
    assert is_prime(-5) is False

    # 5. Tổng luân phiên biên
    with pytest.raises(ValueError):
        calculate_alternating_sum(0)

    # 6. ƯCLN (0,0)
    with pytest.raises(ValueError):
        find_gcd(0, 0)