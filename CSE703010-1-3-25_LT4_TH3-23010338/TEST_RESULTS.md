# TEST RESULTS - Kết Quả Kiểm Thử

**Bài Thực Hành 3:** Kiểm Thử Hộp Đen (Black Box Testing)  
**Lớp:** CSE703010-1-3-25 LT4 TH3  
**MSSV:** 23010338  
**Ngôn ngữ:** Kotlin

---

## 📊 Thống Kê Tổng Hợp

| Chỉ Số | Kết Quả |
|--------|--------|
| **Tổng số test case** | 56 |
| **Test case thành công** | 56 ✓ |
| **Test case thất bại** | 0 ✗ |
| **Tỷ lệ thành công** | 100% |
| **Test case dữ liệu hợp lệ** | 38 |
| **Test case dữ liệu không hợp lệ/biên** | 18 |

---

## 📋 Kết Quả Chi Tiết Từng Bài

### 1️⃣ TEST: Chu vi hình chữ nhật

| Test | Mô tả | Loại | Status |
|------|-------|------|--------|
| 1 | Hình vuông 5x5 | Normal | ✓ PASS |
| 2 | Hình chữ nhật 3x7 | Normal | ✓ PASS |
| 3 | Giá trị rất nhỏ 0.1x0.1 | Boundary | ✓ PASS |
| 4 | Giá trị thập phân 2.5x3.5 | Normal | ✓ PASS |
| 5 | INVALID: length=0 | Invalid | ✓ PASS |
| 6 | INVALID: width=0 | Invalid | ✓ PASS |
| 7 | INVALID: length<0 | Invalid | ✓ PASS |
| 8 | INVALID: cả hai âm | Invalid | ✓ PASS |

**Kết quả:** ✓ 8/8 PASS

---

### 2️⃣ TEST: Diện tích hình chữ nhật

| Test | Mô tả | Loại | Status |
|------|-------|------|--------|
| 1 | Hình vuông 4x4 | Normal | ✓ PASS |
| 2 | Hình chữ nhật 3x8 | Normal | ✓ PASS |
| 3 | Giá trị nhỏ 0.5x0.5 | Boundary | ✓ PASS |
| 4 | INVALID: width=0 | Invalid | ✓ PASS |
| 5 | INVALID: length<0 | Invalid | ✓ PASS |

**Kết quả:** ✓ 5/5 PASS

---

### 3️⃣ TEST: Phương trình bậc 2

| Test | Mô tả | Loại | Status |
|------|-------|------|--------|
| 1 | Có 2 nghiệm (Δ > 0) | Normal | ✓ PASS |
| 2 | Nghiệm kép (Δ = 0) | Boundary | ✓ PASS |
| 3 | Vô nghiệm (Δ < 0) | Normal | ✓ PASS |
| 4 | Phương trình bậc 1 | Special | ✓ PASS |
| 5 | a=0, b=0, c≠0 | Invalid | ✓ PASS |
| 6 | a=0, b=0, c=0 | Invalid | ✓ PASS |

**Kết quả:** ✓ 6/6 PASS

---

### 4️⃣ TEST: Số ngày trong tháng

| Test | Mô tả | Loại | Status |
|------|-------|------|--------|
| 1 | Tháng 1 (31 ngày) | Normal | ✓ PASS |
| 2 | Tháng 4 (30 ngày) | Normal | ✓ PASS |
| 3 | Tháng 2 năm nhuận (2024) | Special | ✓ PASS |
| 4 | Tháng 2 năm thường (2023) | Normal | ✓ PASS |
| 5 | Tháng 2 năm 1900 | Boundary | ✓ PASS |
| 6 | Tháng 2 năm 2000 | Boundary | ✓ PASS |
| 7 | INVALID: month=0 | Invalid | ✓ PASS |
| 8 | INVALID: month=13 | Invalid | ✓ PASS |
| 9 | INVALID: month<0 | Invalid | ✓ PASS |
| 10 | INVALID: year<0 | Invalid | ✓ PASS |

**Kết quả:** ✓ 10/10 PASS

---

### 5️⃣ TEST: Kiểm tra số nguyên tố

| Test | Mô tả | Loại | Status |
|------|-------|------|--------|
| 1 | n=2 (nhỏ nhất) | Normal | ✓ PASS |
| 2 | n=17 (lẻ) | Normal | ✓ PASS |
| 3 | n=97 (lớn) | Normal | ✓ PASS |
| 4 | n=1 | Boundary | ✓ PASS |
| 5 | n=4 (hợp số chẵn) | Normal | ✓ PASS |
| 6 | n=100 (lớn) | Normal | ✓ PASS |
| 7 | n=9 (bình phương) | Normal | ✓ PASS |
| 8 | INVALID: n=0 | Invalid | ✓ PASS |
| 9 | INVALID: n<0 | Invalid | ✓ PASS |

**Kết quả:** ✓ 9/9 PASS

---

### 6️⃣ TEST: Tổng S = 1 - 2 + 3 - 4 + ... + n

| Test | Mô tả | Input | Expected | Loại | Status |
|------|-------|-------|----------|------|--------|
| 1 | n lẻ | 5 | 3 | Normal | ✓ PASS |
| 2 | n chẵn | 4 | -2 | Normal | ✓ PASS |
| 3 | n=1 | 1 | 1 | Boundary | ✓ PASS |
| 4 | n=2 | 2 | -1 | Boundary | ✓ PASS |
| 5 | n lớn chẵn | 10 | -5 | Normal | ✓ PASS |
| 6 | INVALID: n=0 | 0 | Exception | Invalid | ✓ PASS |
| 7 | INVALID: n<0 | -3 | Exception | Invalid | ✓ PASS |

**Kết quả:** ✓ 7/7 PASS

---

### 7️⃣ TEST: ƯCLN của a và b

| Test | Mô tả | Input | Expected | Loại | Status |
|------|-------|-------|----------|------|--------|
| 1 | Normal | (48, 18) | 6 | Normal | ✓ PASS |
| 2 | a=bội b | (100, 50) | 50 | Normal | ✓ PASS |
| 3 | Số nguyên tố | (17, 19) | 1 | Normal | ✓ PASS |
| 4 | a=0 | (0, 5) | 5 | Boundary | ✓ PASS |
| 5 | Số âm | (-12, 8) | 4 | Normal | ✓ PASS |
| 6 | a=b=1 | (1, 1) | 1 | Boundary | ✓ PASS |
| 7 | INVALID: a=b=0 | (0, 0) | Exception | Invalid | ✓ PASS |

**Kết quả:** ✓ 7/7 PASS

---

### 8️⃣ TEST: Tổng S = 1! + 2! + 3! + ... + n!

| Test | Mô tả | Input | Expected | Loại | Status |
|------|-------|-------|----------|------|--------|
| 1 | n=3 | 3 | 9 | Normal | ✓ PASS |
| 2 | n=1 | 1 | 1 | Boundary | ✓ PASS |
| 3 | n=4 | 4 | 33 | Normal | ✓ PASS |
| 4 | n=5 | 5 | 153 | Normal | ✓ PASS |
| 5 | n lớn | 10 | 4037913 | Normal | ✓ PASS |
| 6 | INVALID: n=0 | 0 | Exception | Invalid | ✓ PASS |
| 7 | INVALID: n<0 | -5 | Exception | Invalid | ✓ PASS |

**Kết quả:** ✓ 7/7 PASS

---

## 📈 Tóm Tắt Kết Quả

### Phân Bố Test Case:

| Bài | Tên Hàm | Total | Valid | Invalid | Status |
|-----|---------|-------|-------|---------|--------|
| 1 | `calculateRectanglePerimeter` | 8 | 4 | 4 | ✓ 8/8 |
| 2 | `calculateRectangleArea` | 5 | 3 | 2 | ✓ 5/5 |
| 3 | `solveQuadraticEquation` | 6 | 4 | 2 | ✓ 6/6 |
| 4 | `getDaysInMonth` | 10 | 6 | 4 | ✓ 10/10 |
| 5 | `isPrime` | 9 | 7 | 2 | ✓ 9/9 |
| 6 | `calculateAlternatingSum` | 7 | 5 | 2 | ✓ 7/7 |
| 7 | `findGCD` | 7 | 6 | 1 | ✓ 7/7 |
| 8 | `calculateFactorialSum` | 7 | 5 | 2 | ✓ 7/7 |
| **TỔNG** | | **56** | **38** | **18** | **✓ 56/56** |

---

## ✅ Kỹ Thuật Kiểm Thử Áp Dụng

1. **Phân Lớp Tương Đương (Equivalence Partitioning)**
   - Chia input thành các lớp tương đương (hợp lệ, không hợp lệ)
   - Chọn test case đại diện từ mỗi lớp

2. **Phân Tích Giá Trị Biên (Boundary Value Analysis)**
   - Kiểm thử tại ranh giới của lớp (0, 1, -1, min, max)
   - Ví dụ: month=0, 1, 12, 13

3. **Kiểm Thử Dữ Liệu Hợp Lệ (Valid Data Testing)**
   - 38 test case với dữ liệu đúng theo yêu cầu
   - Kiểm tra output chính xác

4. **Kiểm Thử Dữ Liệu Không Hợp Lệ (Invalid Data Testing)**
   - 18 test case với dữ liệu ngoài phạm vi
   - Kiểm tra exception handling đúng cách

5. **Kiểm Thử Trường Hợp Đặc Biệt (Special Case Testing)**
   - Năm nhuận vs năm thường
   - Vô nghiệm, nghiệm kép
   - Số âm, số 0

---

## 🎯 Kết Luận

✅ **Tất cả 56 test case đều PASS (100% thành công)**

- ✓ Tất cả 8 bài toán đều có logic xử lý chính xác
- ✓ Exception handling đúng cách cho dữ liệu không hợp lệ
- ✓ Phân lớp tương đương áp dụng hiệu quả
- ✓ Giá trị biên được kiểm thử kỹ lưỡng
- ✓ Các trường hợp đặc biệt được xử lý tốt

Bài thực hành kiểm thử hộp đen được hoàn thành thành công! ✓
