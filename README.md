# BÀI THỰC HÀNH 3: KIỂM THỬ HỘP ĐEN (BLACK BOX TESTING)

**Lớp:** CSE703010-1-3-25-LT4  
**Bài tập:** Bài thực hành 3  
**MSSV:** 23010338  
**Ngôn ngữ:** Python

---

## 📋 Mô Tả Bài Thực Hành

Bài thực hành này yêu cầu thiết kế và xây dựng 8 bài toán, sau đó thực hiện kiểm thử hộp đen (Black-box Testing) toàn diện cho từng chương trình.

### 8 Bài Toán:
1. ✓ Tính chu vi hình chữ nhật
2. ✓ Tính diện tích hình chữ nhật
3. ✓ Giải phương trình bậc 2
4. ✓ Tính số ngày của một tháng
5. ✓ Kiểm tra số nguyên tố
6. ✓ Tính tổng S = 1 - 2 + 3 - 4 + ... + n
7. ✓ Tìm ƯCLN của a và b
8. ✓ Tính tổng S = 1! + 2! + 3! + ... + n!

---

## 🎯 Yêu Cầu Bài Tập

### Phần Lập Trình:
- [x] Xây dựng mã nguồn cho 8 bài toán
- [x] Thiết kế test case dựa trên kỹ thuật hộp đen
- [x] Đảm bảo các test case cover dữ liệu hợp lệ và không hợp lệ
- [x] Tối thiểu 1 tình huống dữ liệu sai/không hợp lệ cho mỗi bài

### Kỹ Thuật Kiểm Thử:
- [x] Phân lớp tương đương (Equivalence Partitioning)
- [x] Phân tích giá trị biên (Boundary Value Analysis)
- [x] Kiểm thử dữ liệu hợp lệ
- [x] Kiểm thử dữ liệu không hợp lệ

### Công Việc GitHub:
- [x] **Issue #1:** Thiết kế test case cho dữ liệu hợp lệ → **Commit 1**
- [x] **Issue #2:** Thiết kế test case cho dữ liệu không hợp lệ, biên, ngoại lệ → **Commit 2**
- [x] Cả 2 Issue đều đã được giải quyết

---

## 📁 Cấu Trúc Dự Án

```
CSE703010-1-3-25_LT4_TH3-23010328/
├── .gitignore                               # Git ignore configuration
├── README.md                                # Tài liệu chính (repo root)
└── CSE703010-1-3-25_LT4_TH3-23010328/
    ├── MathFunctions.kt                     # 8 hàm toán học chính
    ├── TestCases.kt                         # Các test case chi tiết (56 test cases)
    ├── TestCases.jar                        # File JAR biên dịch (IGNORED)
    ├── BLACK_BOX_TESTING_DOCUMENTATION.md   # Tài liệu kiểm thử (8 bài toán)
    ├── DETAILED_BLACK_BOX_TESTING_ANALYSIS.md # Phân tích chi tiết
    └── TEST_RESULTS.md                      # Kết quả chạy test (56/56 PASS)

```

### Giải Thích Cấu Trúc:
- **Repository Root (`/`):**
  - `.gitignore` - Cấu hình để bỏ qua file JAR
  - `README.md` - Tài liệu chính hiển thị trên GitHub
  
- **Project Folder (`CSE703010-1-3-25_LT4_TH3-23010328/`):**
  - `MathFunctions.kt` - Chứa 8 hàm toán học + input validation + exception handling
  - `TestCases.kt` - Chứa 56 test case chi tiết với output kiểm tra từng case
  - `TestCases.jar` - File JAR compiled (được ignore, không push lên GitHub)
  - `BLACK_BOX_TESTING_DOCUMENTATION.md` - Phân lớp tương đương + giá trị biên cho 8 bài
  - `DETAILED_BLACK_BOX_TESTING_ANALYSIS.md` - Phân tích chi tiết về các kỹ thuật kiểm thử
  - `TEST_RESULTS.md` - Kết quả chạy tất cả 56 test case

---

## 📊 Kết Quả Kiểm Thử

### Thống Kê Chung:
| Chỉ Số | Kết Quả |
|--------|--------|
| **Tổng số test case** | 56 |
| **Test case thành công** | 56 ✓ |
| **Test case thất bại** | 0 ✗ |
| **Tỷ lệ thành công** | **100%** |
| **Test case dữ liệu hợp lệ** | 38 |
| **Test case dữ liệu không hợp lệ/biên** | 18 |

### Chi Tiết Từng Bài:

| Bài | Hàm | Test Case | Valid | Invalid | Status |
|-----|-----|-----------|-------|---------|--------|
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

## 🔍 Kỹ Thuật Kiểm Thử Áp Dụng

### 1. Phân Lớp Tương Đương (Equivalence Partitioning)

Chia tập hợp đầu vào thành các lớp tương đương:

**Ví dụ:** Hàm `calculateRectanglePerimeter(length, width)`
```
EP1: length > 0, width > 0           → Hợp lệ
EP2: length ≤ 0 hoặc width ≤ 0      → Không hợp lệ
```

### 2. Phân Tích Giá Trị Biên (Boundary Value Analysis)

Kiểm thử tại các điểm ranh giới:

**Ví dụ:** Hàm `getDaysInMonth(month, year)`
```
Boundary: month = 0, 1, 12, 13
          year = -1, 0, 1
Special: Năm nhuận vs năm thường
```

### 3. Kiểm Thử Dữ Liệu Hợp Lệ

Test case với dữ liệu đúng theo yêu cầu:
```kotlin
// Hợp lệ
isPrime(2)   → true
isPrime(17)  → true
isPrime(97)  → true
```

### 4. Kiểm Thử Dữ Liệu Không Hợp Lệ

Test case với dữ liệu ngoài phạm vi → Mong đợi Exception:
```kotlin
// Không hợp lệ
calculateRectanglePerimeter(-5, 5)   → Exception
getDaysInMonth(13, 2024)              → Exception
calculateAlternatingSum(0)            → Exception
```

### 5. Kiểm Thử Trường Hợp Đặc Biệt

```kotlin
// Năm nhuận
getDaysInMonth(2, 2024)  → 29    // Nhuận
getDaysInMonth(2, 2023)  → 28    // Thường
getDaysInMonth(2, 1900)  → 28    // Chia 100, không chia 400
getDaysInMonth(2, 2000)  → 29    // Chia 400

// Phương trình bậc 2
solveQuadraticEquation(1, -2, 1)   → [1]        // Nghiệm kép
solveQuadraticEquation(1, 0, 1)    → []         // Vô nghiệm
solveQuadraticEquation(0, 2, 3)    → [-1.5]     // Bậc 1

// ƯCLN với số âm
findGCD(-12, 8)  → 4    // Sử dụng giá trị tuyệt đối
```

---

## 💻 Cách Chạy Chương Trình

### 1. Biên Dịch (Compile)
```bash
cd d:\Kotlin\ĐG&KTPM
kotlinc MathFunctions.kt TestCases.kt -include-runtime -d TestCases.jar
```

### 2. Chạy Test
```bash
java -jar TestCases.jar
```

### 3. Xem Kết Quả
Chương trình sẽ in ra từng test case với:
- Input
- Expected output
- Actual output
- Status (✓ PASS hoặc ✗ FAIL)

---

## 📝 Mô Tả Các File

### 0. **.gitignore** (Repository Root)
Git configuration file:
```
TestCases.jar
CSE703010-1-3-25_LT4_TH3-23010328/TestCases.jar
```
**Mục đích:** Bỏ qua file JAR compiled để tránh lỡ đẩy file lớn lên GitHub, người dùng có thể compile lại từ source.

### 1. **MathFunctions.kt** (170 dòng)
Chứa 8 hàm toán học chính:
- `calculateRectanglePerimeter()` - Chu vi hình chữ nhật
- `calculateRectangleArea()` - Diện tích hình chữ nhật
- `solveQuadraticEquation()` - Giải phương trình bậc 2
- `getDaysInMonth()` - Số ngày trong tháng
- `isPrime()` - Kiểm tra số nguyên tố
- `calculateAlternatingSum()` - Tổng luân phiên
- `findGCD()` - ƯCLN
- `calculateFactorialSum()` - Tổng giai thừa
- `factorial()` - Tính giai thừa

**Đặc điểm:**
- Input validation với exception handling
- Các trường hợp đặc biệt (năm nhuận, vô nghiệm, etc.)
- Xử lý số âm, số 0
- Tính toán chính xác

### 2. **TestCases.kt** (700+ dòng)
Chứa 8 hàm test với tổng cộng 56 test case:
- `testRectanglePerimeter()` - 8 test case
- `testRectangleArea()` - 5 test case
- `testQuadraticEquation()` - 6 test case
- `testDaysInMonth()` - 10 test case
- `testPrime()` - 9 test case
- `testAlternatingSum()` - 7 test case
- `testGCD()` - 7 test case
- `testFactorialSum()` - 7 test case

**Đặc điểm:**
- Output chi tiết (Input, Expected, Got, Status)
- Kiểm tra Exception handling
- Color/visual feedback (✓/✗)
- Tính toán manual để verify kết quả

### 3. **BLACK_BOX_TESTING_DOCUMENTATION.md**
Tài liệu kiểm thử toàn diện:
- Phân lớp tương đương cho mỗi bài
- Giá trị biên
- Test case summary tables
- Kỹ thuật kiểm thử

### 4. **DETAILED_BLACK_BOX_TESTING_ANALYSIS.md**
Phân tích chi tiết:
- Giải thích các kỹ thuật kiểm thử
- Ví dụ cụ thể
- Luật đặc biệt (năm nhuận, etc.)
- Tóm tắt kết quả
- Kết luận

### 5. **TEST_RESULTS.md**
Kết quả chạy test:
- Tất cả 56 test case output
- Status của từng test
- Thống kê tóm tắt

---

## 🔗 GitHub Repository

**URL:** https://github.com/AnhQuocs/CSE703010-1-3-25_LT4_TH3-23010328

### Commits:

**Commit 1:** `a3a8d24`
- **Message:** "Issue #1: Thiết kế và viết các ca kiểm thử hộp đen cho các trường hợp dữ liệu hợp lệ"
- **Files:** MathFunctions.kt, TestCases.kt, Documentation

**Commit 2:** `50a5735`
- **Message:** "Issue #2: Thiết kế và viết các ca kiểm thử hộp đen cho các trường hợp dữ liệu không hợp lệ, biên và ngoại lệ"
- **Files:** DETAILED_BLACK_BOX_TESTING_ANALYSIS.md

---

## ✅ Checklist Hoàn Thành

### Yêu Cầu Chức Năng:
- [x] 8 chương trình Kotlin được xây dựng
- [x] Tất cả hàm đều có input validation
- [x] Exception handling đúng cách
- [x] Xử lý trường hợp đặc biệt (năm nhuận, vô nghiệm, etc.)

### Yêu Cầu Kiểm Thử:
- [x] Phân lớp tương đương cho mỗi hàm
- [x] Giá trị biên được kiểm thử
- [x] Dữ liệu hợp lệ được kiểm thử
- [x] Dữ liệu không hợp lệ được kiểm thử (≥1 per function)
- [x] Tổng cộng 56 test case, 100% pass

### Yêu Cầu GitHub:
- [x] Tạo GitHub repo
- [x] Issue #1 - Valid data test cases
- [x] Issue #2 - Invalid/Boundary/Exception test cases
- [x] 2 commits tương ứng với 2 issues
- [x] .gitignore file để bỏ qua TestCases.jar
- [x] README.md ở repo root để hiển thị tài liệu chính
- [x] Mã nguồn trên GitHub (trong thư mục CSE703010-1-3-25_LT4_TH3-23010328)
- [x] Tài liệu đầy đủ
- [x] Kết quả test trên GitHub

### Yêu Cầu Nộp:
- [x] Link GitHub repo: https://github.com/AnhQuocs/CSE703010-1-3-25_LT4_TH3-23010328
- [x] Mã nguồn chương trình: ✓ MathFunctions.kt, TestCases.kt
- [x] Danh sách test case: ✓ BLACK_BOX_TESTING_DOCUMENTATION.md
- [x] Kết quả chạy kiểm thử: ✓ TEST_RESULTS.md
- [x] Mô tả cách áp dụng kiểm thử hộp đen: ✓ DETAILED_BLACK_BOX_TESTING_ANALYSIS.md

---

## 📚 Tài Liệu Tham Khảo

### Kỹ Thuật Kiểm Thử Hộp Đen:
1. **Equivalence Partitioning** - Chia input thành các lớp tương đương
2. **Boundary Value Analysis** - Kiểm thử ở ranh giới
3. **Error Guessing** - Dự đoán các lỗi có thể xảy ra

### Công Cụ Sử Dụng:
- **Ngôn ngữ:** Kotlin
- **Biên dịch:** kotlinc
- **Quản lý phiên bản:** Git
- **Repository:** GitHub

---

## 👤 Thông Tin Sinh Viên

- **MSSV:** 23010328  
- **Lớp:** CSE703010-1-3-25-LT4  
- **Email:** anhquocydkl@gmail.com
- **GitHub:** https://github.com/AnhQuocs

---

## 📞 Liên Hệ

Nếu có bất kỳ câu hỏi nào về bài thực hành này, vui lòng liên hệ qua GitHub issues hoặc email.

---

**Hoàn thành:** ✓ Toàn bộ yêu cầu bài tập đã được hoàn thành và nộp lên GitHub.
