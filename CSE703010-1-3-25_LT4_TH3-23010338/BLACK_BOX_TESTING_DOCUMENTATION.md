# Bài Thực Hành 3: Kiểm Thử Hộp Đen (Black Box Testing)

**Lớp:** CSE703010-1-3-25 LT4 TH3  
**MSSV:** 23010338  
**Ngôn ngữ:** Kotlin  

---

## 1. Tính Chu Vi Hình Chữ Nhật

### Input/Output
- **Đầu vào:** `length` (Double), `width` (Double)
- **Đầu ra:** Chu vi (Double)
- **Công thức:** P = 2 × (length + width)

### Phân Lớp Tương Đương (Equivalence Partitioning)
| Lớp | Điều kiện | Trạng thái |
|-----|-----------|-----------|
| EP1 | length > 0, width > 0 | Hợp lệ |
| EP2 | length ≤ 0 hoặc width ≤ 0 | Không hợp lệ |

### Phân Tích Giá Trị Biên (Boundary Value Analysis)
| Test Case | Input | Expected | Loại |
|-----------|-------|----------|------|
| 1 | (5, 5) | 20 | Normal - Hình vuông |
| 2 | (3, 7) | 20 | Normal - Hình chữ nhật |
| 3 | (0.1, 0.1) | 0.4 | Boundary - Giá trị rất nhỏ |
| 4 | (2.5, 3.5) | 12 | Normal - Giá trị thập phân |
| 5 | (0, 5) | Exception | Invalid - length = 0 |
| 6 | (5, 0) | Exception | Invalid - width = 0 |
| 7 | (-5, 5) | Exception | Invalid - length < 0 |
| 8 | (-3, -4) | Exception | Invalid - cả hai âm |

---

## 2. Tính Diện Tích Hình Chữ Nhật

### Input/Output
- **Đầu vào:** `length` (Double), `width` (Double)
- **Đầu ra:** Diện tích (Double)
- **Công thức:** S = length × width

### Phân Lớp Tương Đương
| Lớp | Điều kiện | Trạng thái |
|-----|-----------|-----------|
| EP1 | length > 0, width > 0 | Hợp lệ |
| EP2 | length ≤ 0 hoặc width ≤ 0 | Không hợp lệ |

### Test Cases
| Test Case | Input | Expected | Loại |
|-----------|-------|----------|------|
| 1 | (4, 4) | 16 | Normal - Hình vuông |
| 2 | (3, 8) | 24 | Normal - Hình chữ nhật |
| 3 | (0.5, 0.5) | 0.25 | Boundary - Giá trị nhỏ |
| 4 | (5, 0) | Exception | Invalid - width = 0 |
| 5 | (-4, 6) | Exception | Invalid - length < 0 |

---

## 3. Giải Phương Trình Bậc 2: ax² + bx + c = 0

### Input/Output
- **Đầu vào:** `a` (Double), `b` (Double), `c` (Double)
- **Đầu ra:** Pair<List<Double>, String> - Danh sách nghiệm và mô tả

### Phân Lớp Tương Đương
| Lớp | Điều kiện | Kết quả |
|-----|-----------|--------|
| EP1 | a ≠ 0, Δ > 0 | 2 nghiệm thực |
| EP2 | a ≠ 0, Δ = 0 | 1 nghiệm kép |
| EP3 | a ≠ 0, Δ < 0 | Vô nghiệm |
| EP4 | a = 0, b ≠ 0 | Phương trình bậc 1 |
| EP5 | a = 0, b = 0, c ≠ 0 | Vô nghiệm |
| EP6 | a = 0, b = 0, c = 0 | Vô số nghiệm |

### Test Cases
| Test Case | Input | Expected | Loại |
|-----------|-------|----------|------|
| 1 | (1, -5, 6) | 2 nghiệm (2, 3) | Normal - Δ > 0 |
| 2 | (1, -2, 1) | 1 nghiệm (1) | Boundary - Δ = 0 |
| 3 | (1, 0, 1) | Vô nghiệm | Normal - Δ < 0 |
| 4 | (0, 2, 3) | 1 nghiệm (-1.5) | Normal - Bậc 1 |
| 5 | (0, 0, 5) | Vô nghiệm | Invalid - a=0, b=0, c≠0 |
| 6 | (0, 0, 0) | Vô số nghiệm | Invalid - a=0, b=0, c=0 |

---

## 4. Tính Số Ngày Trong Tháng

### Input/Output
- **Đầu vào:** `month` (Int), `year` (Int)
- **Đầu ra:** Số ngày (Int)

### Phân Lớp Tương Đương
| Lớp | Điều kiện | Kết quả |
|-----|-----------|--------|
| EP1 | month ∈ {1,3,5,7,8,10,12} | 31 ngày |
| EP2 | month ∈ {4,6,9,11} | 30 ngày |
| EP3 | month = 2, năm nhuận | 29 ngày |
| EP4 | month = 2, năm thường | 28 ngày |
| EP5 | month < 1 hoặc month > 12 | Exception |

### Năm Nhuận
- Năm chia hết cho 4 và KHÔNG chia hết cho 100, HOẶC
- Năm chia hết cho 400

### Test Cases
| Test Case | Input | Expected | Loại |
|-----------|-------|----------|------|
| 1 | (1, 2024) | 31 | Normal - Tháng 1 |
| 2 | (4, 2024) | 30 | Normal - Tháng 4 |
| 3 | (2, 2024) | 29 | Normal - Tháng 2 năm nhuận |
| 4 | (2, 2023) | 28 | Normal - Tháng 2 năm thường |
| 5 | (2, 1900) | 28 | Boundary - Năm chia 100 không chia 400 |
| 6 | (2, 2000) | 29 | Boundary - Năm chia 400 |
| 7 | (0, 2024) | Exception | Invalid - month = 0 |
| 8 | (13, 2024) | Exception | Invalid - month = 13 |
| 9 | (-1, 2024) | Exception | Invalid - month < 0 |
| 10 | (5, -1) | Exception | Invalid - year < 0 |

---

## 5. Kiểm Tra Số Nguyên Tố

### Input/Output
- **Đầu vào:** `n` (Int)
- **Đầu ra:** Boolean (true/false)

### Phân Lớp Tương Đương
| Lớp | Điều kiện | Kết quả |
|-----|-----------|--------|
| EP1 | n = 2 | Số nguyên tố |
| EP2 | n > 2, n lẻ, nguyên tố | Số nguyên tố |
| EP3 | n > 2, n lẻ, hợp số | Không nguyên tố |
| EP4 | n chẵn, n > 2 | Không nguyên tố |
| EP5 | n < 2 | Không nguyên tố |

### Test Cases
| Test Case | Input | Expected | Loại |
|-----------|-------|----------|------|
| 1 | 2 | true | Normal - Số nguyên tố nhỏ nhất |
| 2 | 17 | true | Normal - Số nguyên tố lẻ |
| 3 | 97 | true | Normal - Số nguyên tố lớn |
| 4 | 1 | false | Boundary - n = 1 |
| 5 | 4 | false | Normal - Hợp số chẵn |
| 6 | 100 | false | Normal - Hợp số lớn |
| 7 | 9 | false | Normal - Bình phương của số nguyên tố |
| 8 | 0 | false | Invalid - n = 0 |
| 9 | -5 | false | Invalid - n < 0 |

---

## 6. Tính Tổng S = 1 - 2 + 3 - 4 + ... + n

### Input/Output
- **Đầu vào:** `n` (Int)
- **Đầu ra:** Tổng (Long)

### Công Thức
- Khi n lẻ: S = (n+1)/2
- Khi n chẵn: S = -n/2

### Phân Lớp Tương Đương
| Lớp | Điều kiện | Trạng thái |
|-----|-----------|-----------|
| EP1 | n ≥ 1 | Hợp lệ |
| EP2 | n < 1 | Không hợp lệ |

### Test Cases
| Test Case | Input | Expected | Loại |
|-----------|-------|----------|------|
| 1 | 5 | 3 | Normal - n lẻ (1-2+3-4+5=3) |
| 2 | 4 | -2 | Normal - n chẵn (1-2+3-4=-2) |
| 3 | 1 | 1 | Boundary - n = 1 |
| 4 | 2 | -1 | Boundary - n = 2 (1-2=-1) |
| 5 | 10 | -5 | Normal - n chẵn lớn |
| 6 | 0 | Exception | Invalid - n = 0 |
| 7 | -3 | Exception | Invalid - n < 0 |

---

## 7. Tìm ƯCLN của a và b

### Input/Output
- **Đầu vào:** `a` (Int), `b` (Int)
- **Đầu ra:** ƯCLN (Int)

### Thuật Toán: Euclidean
GCD(a, b) = GCD(b, a mod b) cho đến khi b = 0

### Phân Lớp Tương Đương
| Lớp | Điều kiện | Trạng thái |
|-----|-----------|-----------|
| EP1 | a > 0, b > 0 | Hợp lệ |
| EP2 | a = 0 hoặc b = 0 (không cùng = 0) | Hợp lệ |
| EP3 | a < 0 hoặc b < 0 | Hợp lệ (dùng giá trị tuyệt đối) |
| EP4 | a = 0, b = 0 | Không hợp lệ |

### Test Cases
| Test Case | Input | Expected | Loại |
|-----------|-------|----------|------|
| 1 | (48, 18) | 6 | Normal - GCD = 6 |
| 2 | (100, 50) | 50 | Normal - a là bội của b |
| 3 | (17, 19) | 1 | Normal - Số nguyên tố cùng nhau |
| 4 | (0, 5) | 5 | Boundary - a = 0 |
| 5 | (-12, 8) | 4 | Normal - Số âm |
| 6 | (1, 1) | 1 | Boundary - a = b = 1 |
| 7 | (0, 0) | Exception | Invalid - a = 0, b = 0 |

---

## 8. Tính Tổng S = 1! + 2! + 3! + ... + n!

### Input/Output
- **Đầu vào:** `n` (Int)
- **Đầu ra:** Tổng (Long)

### Phân Lớp Tương Đương
| Lớp | Điều kiện | Trạng thái |
|-----|-----------|-----------|
| EP1 | n ≥ 1 | Hợp lệ |
| EP2 | n < 1 | Không hợp lệ |

### Test Cases
| Test Case | Input | Expected | Loại |
|-----------|-------|----------|------|
| 1 | 3 | 9 | Normal - 1! + 2! + 3! = 1+2+6 = 9 |
| 2 | 1 | 1 | Boundary - n = 1 |
| 3 | 4 | 33 | Normal - 1+2+6+24 = 33 |
| 4 | 5 | 153 | Normal - 1+2+6+24+120 = 153 |
| 5 | 10 | 4037913 | Normal - Tổng lớn |
| 6 | 0 | Exception | Invalid - n = 0 |
| 7 | -5 | Exception | Invalid - n < 0 |

---

## Tóm Tắt Kỹ Thuật Kiểm Thử

### 1. Phân Lớp Tương Đương (Equivalence Partitioning)
- Chia input thành các lớp tương đương
- Mỗi lớp có hành vi giống nhau
- Chọn 1 test case đại diện cho mỗi lớp

### 2. Phân Tích Giá Trị Biên (Boundary Value Analysis)
- Kiểm tra giá trị tại ranh giới của lớp
- Ví dụ: n = 0, n = 1, n = -1
- Thường phát hiện lỗi ở điểm chuyển tiếp

### 3. Dữ Liệu Hợp Lệ & Không Hợp Lệ
- **Valid:** Dữ liệu trong phạm vi chấp nhận được
- **Invalid:** Dữ liệu ngoài phạm vi → Mong đợi Exception

### 4. Các Loại Test Case
| Loại | Mục đích | Ví dụ |
|------|---------|-------|
| Normal | Kiểm tra chức năng bình thường | (5, 5) → Perimeter = 20 |
| Boundary | Kiểm tra giá trị biên | (0.1, 0.1) → Perimeter = 0.4 |
| Invalid | Kiểm tra xử lý lỗi | (0, 5) → Exception |

---

## Cách Chạy Chương Trình

```bash
kotlinc MathFunctions.kt TestCases.kt -include-runtime -d TestCases.jar
java -jar TestCases.jar
```

---

## Kết Quả Kiểm Thử

Tất cả các test case đều được chạy và in ra kết quả chi tiết với:
- Input
- Expected output
- Actual output
- Status (✓ PASS hoặc ✗ FAIL)

---

**Hoàn thành:** Bài thực hành gồm 8 bài toán, mỗi bài có ít nhất 1 test case dữ liệu không hợp lệ hoặc biên.
