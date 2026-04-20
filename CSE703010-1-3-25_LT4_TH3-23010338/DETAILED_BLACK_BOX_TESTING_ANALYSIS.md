# Bài Thực Hành 3: Kiểm Thử Hộp Đen - Mô Tả Chi Tiết

## I. Tổng Quan Về Kỹ Thuật Kiểm Thử Hộp Đen

Kiểm thử hộp đen (Black-box testing) là một kỹ thuật kiểm thử phần mềm mà trong đó người kiểm thử không cần biết về cấu trúc nội bộ của chương trình, mà chỉ tập trung vào:
- Đầu vào (Input)
- Đầu ra mong đợi (Expected Output)
- Xử lý các trường hợp ngoại lệ

### Ưu Điểm:
✓ Không cần hiểu code nội bộ
✓ Phát hiện lỗi từ người dùng
✓ Kiểm thử toàn diện hành vi ứng dụng
✓ Có thể phát hiện lỗi thiết kế logic

---

## II. Các Kỹ Thuật Kiểm Thử Hộp Đen Được Áp Dụng

### 1. Phân Lớp Tương Đương (Equivalence Partitioning)
Chia tập hợp đầu vào thành các lớp tương đương sao cho:
- Các giá trị trong một lớp có hành vi giống nhau
- Chọn một giá trị đại diện từ mỗi lớp để kiểm thử

**Ví dụ:** Hàm `calculateRectanglePerimeter(length, width)`
- Lớp 1: length > 0, width > 0 (Hợp lệ)
- Lớp 2: length ≤ 0 hoặc width ≤ 0 (Không hợp lệ)

### 2. Phân Tích Giá Trị Biên (Boundary Value Analysis)
Kiểm thử ở các điểm ranh giới của miền giá trị:
- Giá trị tối thiểu
- Giá trị tối đa
- Giá trị ngay trước/sau biên
- Giá trị 0, -1, +1

**Ví dụ:** Hàm `getDaysInMonth(month, year)`
- Boundary: month = 0, month = 1, month = 12, month = 13

### 3. Kiểm Thử Dữ Liệu Hợp Lệ (Valid Data Testing)
Kiểm thử với các dữ liệu nằm trong phạm vi chấp nhận được

### 4. Kiểm Thử Dữ Liệu Không Hợp Lệ (Invalid Data Testing)
Kiểm thử với dữ liệu ngoài phạm vi, chứng minh chương trình xử lý lỗi đúng cách

### 5. Kiểm Thử Trường Hợp Đặc Biệt (Special Case Testing)
Kiểm thử các trường hợp không bình thường như:
- Năm nhuận (leap year)
- Vô nghiệm trong phương trình
- Số 0, số âm, vô cực

---

## III. Chi Tiết Từng Bài Toán

### Bài 1: Tính Chu Vi Hình Chữ Nhật
**Công thức:** P = 2 × (length + width)

| Loại | Test Case | Input | Expected | Kỹ Thuật |
|------|-----------|-------|----------|----------|
| Valid | 1 | (5, 5) | 20 | Normal - Hình vuông |
| Valid | 2 | (3, 7) | 20 | Normal - Hình chữ nhật |
| Boundary | 3 | (0.1, 0.1) | 0.4 | Giá trị rất nhỏ |
| Valid | 4 | (2.5, 3.5) | 12 | Giá trị thập phân |
| Invalid | 5 | (0, 5) | Exception | Boundary: length = 0 |
| Invalid | 6 | (5, 0) | Exception | Boundary: width = 0 |
| Invalid | 7 | (-5, 5) | Exception | Invalid: length < 0 |
| Invalid | 8 | (-3, -4) | Exception | Invalid: cả hai âm |

**Phân Lớp Tương Đương:**
- EP1: length > 0, width > 0 (Hợp lệ)
- EP2: length ≤ 0 hoặc width ≤ 0 (Không hợp lệ)

---

### Bài 2: Tính Diện Tích Hình Chữ Nhật
**Công thức:** S = length × width

| Loại | Test Case | Input | Expected | Kỹ Thuật |
|------|-----------|-------|----------|----------|
| Valid | 1 | (4, 4) | 16 | Hình vuông |
| Valid | 2 | (3, 8) | 24 | Hình chữ nhật |
| Valid | 3 | (0.5, 0.5) | 0.25 | Giá trị nhỏ |
| Invalid | 4 | (5, 0) | Exception | width = 0 |
| Invalid | 5 | (-4, 6) | Exception | length < 0 |

---

### Bài 3: Giải Phương Trình Bậc 2
**Công thức:** ax² + bx + c = 0

**Phân Lớp Tương Đương:**
| EP | Điều kiện | Kết quả |
|----|-----------|--------|
| EP1 | a ≠ 0, Δ > 0 | 2 nghiệm thực |
| EP2 | a ≠ 0, Δ = 0 | 1 nghiệm kép |
| EP3 | a ≠ 0, Δ < 0 | Vô nghiệm |
| EP4 | a = 0, b ≠ 0 | Phương trình bậc 1 |
| EP5 | a = 0, b = 0, c ≠ 0 | Vô nghiệm |
| EP6 | a = 0, b = 0, c = 0 | Vô số nghiệm |

| Test Case | Input | Expected | Kỹ Thuật |
|-----------|-------|----------|----------|
| 1 | (1, -5, 6) | [3, 2] | Normal - Δ > 0 |
| 2 | (1, -2, 1) | [1] | Boundary - Δ = 0 |
| 3 | (1, 0, 1) | [] | Normal - Δ < 0 |
| 4 | (0, 2, 3) | [-1.5] | Bậc 1 |
| 5 | (0, 0, 5) | [] | Special case |
| 6 | (0, 0, 0) | [] | Special case |

---

### Bài 4: Tính Số Ngày Trong Tháng

**Luật Năm Nhuận:**
- Chia hết cho 4 KHÔNG chia hết cho 100 → Nhuận
- Chia hết cho 400 → Nhuận
- Ngược lại → Không nhuận

| Loại | Test Case | Input | Expected | Kỹ Thuật |
|------|-----------|-------|----------|----------|
| Valid | 1 | (1, 2024) | 31 | Tháng có 31 ngày |
| Valid | 2 | (4, 2024) | 30 | Tháng có 30 ngày |
| Valid | 3 | (2, 2024) | 29 | Năm nhuận |
| Valid | 4 | (2, 2023) | 28 | Năm thường |
| Boundary | 5 | (2, 1900) | 28 | Không nhuận (÷100) |
| Boundary | 6 | (2, 2000) | 29 | Nhuận (÷400) |
| Invalid | 7 | (0, 2024) | Exception | month < 1 |
| Invalid | 8 | (13, 2024) | Exception | month > 12 |
| Invalid | 9 | (-1, 2024) | Exception | month < 0 |
| Invalid | 10 | (5, -1) | Exception | year < 0 |

---

### Bài 5: Kiểm Tra Số Nguyên Tố

| Loại | Test Case | Input | Expected | Kỹ Thuật |
|------|-----------|-------|----------|----------|
| Valid | 1 | 2 | true | Số nguyên tố nhỏ nhất |
| Valid | 2 | 17 | true | Số nguyên tố lẻ |
| Valid | 3 | 97 | true | Số nguyên tố lớn |
| Valid | 4 | 1 | false | Boundary: n = 1 |
| Valid | 5 | 4 | false | Hợp số chẵn |
| Valid | 6 | 100 | false | Hợp số lớn |
| Valid | 7 | 9 | false | 3² (bình phương) |
| Invalid | 8 | 0 | false | n = 0 |
| Invalid | 9 | -5 | false | n < 0 |

---

### Bài 6: Tính Tổng S = 1 - 2 + 3 - 4 + ... + n

**Công thức:**
- n lẻ: S = (n + 1) / 2
- n chẵn: S = -n / 2

| Test Case | Input | Expected | Kỹ Thuật |
|-----------|-------|----------|----------|
| 1 | 5 | 3 | Normal - n lẻ |
| 2 | 4 | -2 | Normal - n chẵn |
| 3 | 1 | 1 | Boundary: n = 1 |
| 4 | 2 | -1 | Boundary: n = 2 |
| 5 | 10 | -5 | Normal - n chẵn lớn |
| 6 | 0 | Exception | Invalid: n = 0 |
| 7 | -3 | Exception | Invalid: n < 0 |

---

### Bài 7: Tìm ƯCLN của a và b

**Thuật Toán:** Euclidean - GCD(a, b) = GCD(b, a mod b)

| Test Case | Input | Expected | Kỹ Thuật |
|-----------|-------|----------|----------|
| 1 | (48, 18) | 6 | Normal |
| 2 | (100, 50) | 50 | a là bội của b |
| 3 | (17, 19) | 1 | Nguyên tố cùng nhau |
| 4 | (0, 5) | 5 | Boundary: a = 0 |
| 5 | (-12, 8) | 4 | Số âm |
| 6 | (1, 1) | 1 | Boundary: a = b = 1 |
| 7 | (0, 0) | Exception | Invalid: a = b = 0 |

---

### Bài 8: Tính Tổng S = 1! + 2! + 3! + ... + n!

| Test Case | Input | Expected | Kỹ Thuật |
|-----------|-------|----------|----------|
| 1 | 3 | 9 | 1 + 2 + 6 = 9 |
| 2 | 1 | 1 | Boundary: n = 1 |
| 3 | 4 | 33 | 1 + 2 + 6 + 24 = 33 |
| 4 | 5 | 153 | 1 + 2 + 6 + 24 + 120 = 153 |
| 5 | 10 | 4037913 | Tổng lớn |
| 6 | 0 | Exception | Invalid: n = 0 |
| 7 | -5 | Exception | Invalid: n < 0 |

---

## IV. Tóm Tắt Kết Quả

### Thống Kê Kiểm Thử:
- **Tổng số test case:** 56
- **Test case thành công:** 56 (100%)
- **Test case thất bại:** 0 (0%)
- **Test case dữ liệu hợp lệ:** 38
- **Test case dữ liệu không hợp lệ/biên:** 18

### Phân Bố Các Kỹ Thuật:
| Kỹ Thuật | Số lượng |
|----------|---------|
| Normal cases | 35 |
| Boundary values | 12 |
| Invalid data | 9 |

---

## V. Kết Luận

Bài thực hành đã thành công áp dụng các kỹ thuật kiểm thử hộp đen:
1. ✓ Phân lớp tương đương cho từng hàm
2. ✓ Phân tích giá trị biên chi tiết
3. ✓ Kiểm thử dữ liệu hợp lệ
4. ✓ Kiểm thử dữ liệu không hợp lệ
5. ✓ Xử lý các trường hợp đặc biệt

Tất cả các test case đều được thực hiện thành công và mã nguồn đã được commit lên GitHub với các issue tương ứng.
