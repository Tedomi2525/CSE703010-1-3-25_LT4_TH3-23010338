# BÀI THỰC HÀNH 3 — KIỂM THỬ HỘP ĐEN (BLACK BOX TESTING)

**Lớp:** CSE703010-1-3-25-LT4  
**MSSV:** 23010338  
**Ngôn ngữ:** Python

---

## Mô tả ngắn

Kho bài tập này chứa 8 bài toán đã được cài đặt bằng Python và bộ test kiểm thử hộp đen tương ứng. Mục tiêu: thiết kế test cases dựa trên Equivalence Partitioning, Boundary Value Analysis và kiểm thử dữ liệu hợp lệ/không hợp lệ.

## Cấu trúc repo

```
.
├── BLACK_BOX_TESTING_DOCUMENTATION.md
├── DETAILED_BLACK_BOX_TESTING_ANALYSIS.md
├── README.md
├── TEST_RESULTS.md
├── TestCases.py
└── problems.py
```

- `problems.py`: Mã nguồn chứa các hàm/giải pháp cho 8 bài toán.
- `TestCases.py`: Tập lệnh chạy các test case/do kiểm thử (chạy trực tiếp bằng Python).
- `BLACK_BOX_TESTING_DOCUMENTATION.md`: Tài liệu tổng hợp test cases (phân lớp, giá trị biên).
- `DETAILED_BLACK_BOX_TESTING_ANALYSIS.md`: Phân tích chi tiết kỹ thuật kiểm thử áp dụng.
- `TEST_RESULTS.md`: Kết quả thực thi các test case.

## Chạy thử (local)

Yêu cầu: Python 3.x

Mở terminal và chạy:

```powershell
python -m pip install pytest
python -m pytest CSE703010-1-3-25_LT4_TH3-23010338\TestCases.py
```

Kết quả sẽ hiển thị trên terminal và/hoặc ghi vào `TEST_RESULTS.md` tùy vào cách `TestCases.py` được cài đặt.

## Nội dung tóm tắt

- Tổng số bài: 8
- Mỗi bài gồm test hợp lệ và không hợp lệ (ít nhất 1 test không hợp lệ mỗi bài).
- Kỹ thuật áp dụng: Equivalence Partitioning, Boundary Value Analysis, Error Guessing.

## Ghi chú & nhất quán

- README này đã được cập nhật để phản ánh chính xác mã nguồn Python hiện có trong repo.
- Nếu bạn muốn thêm hướng dẫn chạy chi tiết hơn (ví dụ: sử dụng `pytest`), tôi có thể bổ sung hướng dẫn và file cấu hình tương ứng.

## Liên hệ

Nếu có câu hỏi, mở issue trên GitHub hoặc liên hệ tác giả.

---
## ✅ Checklist Hoàn Thành
### Yêu Cầu Chức Năng:
- [x] 8 chương trình Python được xây dựng
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
- [x] README.md ở repo root để hiển thị tài liệu chính
- [x] Mã nguồn trên GitHub (trong thư mục CSE703010-1-3-25_LT4_TH3-23010338)
- [x] Tài liệu đầy đủ
- [x] Kết quả test trên GitHub

### Yêu Cầu Nộp:
- [x] Link GitHub repo: https://github.com/Tedomi2525/CSE703010-1-3-25_LT4_TH3-23010338
- [x] Mã nguồn chương trình: ✓ problems.py, TestCases.py
- [x] Danh sách test case: ✓ BLACK_BOX_TESTING_DOCUMENTATION.md
- [x] Kết quả chạy kiểm thử: ✓ TEST_RESULTS.md
- [x] Mô tả cách áp dụng kiểm thử hộp đen: ✓ DETAILED_BLACK_BOX_TESTING_ANALYSIS.md

---
