# ĐỀ BÀI MÔN LẬP TRÌNH HƯỚNG ĐỐI TƯỢNG PTIT
## LẬP TRÌNH JAVA CƠ BẢN
### CHELLO - Hello World
Viết chương trình in ra màn hình dòng chữ:

Hello PTIT.

**Input:**

Không có dữ liệu vào.

**Output:**

Hello PTIT.

### HELLOFILE - HELLO FILE

Dữ liệu văn bản chứa trong file Hello.txt

Yêu cầu đọc nội dung từ file văn bản Hello.txt và in kết quả ra màn hình.

**Input:**

Không có dữ liệu vào.

**Output:**

Nội dung trong file văn bản Hello.txt

### HELLOJAR - HỌC PHÍ

Học phí của Học viện được thu theo quy định và thay đổi theo từng thời điểm.

Hãy tính học phí của một sinh viên dựa vào dữ liệu đăng ký học và quy định thu học phí.

Dữ liệu vào cho thông tin về Mã sinh viên, Họ tên, số môn học, mã môn học, tên môn học, số tín chỉ, Số QĐ, Tên QĐ, Đơn giá thu học phí như ví dụ.

Cho file jar bao gồm các class như sau:

![image](https://github.com/VietHungHoang/JavaPTIT/assets/93313248/c09fb35b-d55b-47cc-8577-aec3ab1f5c12)

Nhiệm vụ của bạn là tính toán và in ra thông tin tiền học phí phải đóng như định dạng mẫu.

**Ví dụ:**

**Input**
```
B20DCCN001
Nguyễn Văn A
2
INT1155
Tin học cơ sở 2
2
INT1332
Lập trình hướng đối tượng
3
QD123
QD123 HP
550000
```
**Output**
```
Mã sinh viên: B20DCCN001
Họ tên: Nguyễn Văn A
Các môn học:
Tin học cơ sở 2
Lập trình hướng đối tượng
Học phí phải nộp là: 2750000.0
Theo QĐ: QD123
```
Bài tập này yêu cầu sử dụng hàm main cho sẵn như sau:

    public static void main(String[] args) {
        PaymentController pc = new PaymentController();
        //Output for test
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }

### J01001 - HÌNH CHỮ NHẬT

Cho độ dài hai cạnh của hình chữ nhật. Giá trị không quá 104.  

Viết chương trình tính chu vi và diện tích của hình chữ nhật đó. Nếu dữ liệu không hợp lệ (chiều dài hoặc chiều rộng ≤ 0 thì in ra số 0) 

**Input:**

Có duy nhất một dòng ghi hai số nguyên, cách nhau một khoảng trống.

**Output:**

In kết quả trên một dòng, chu vi rồi đến diện tích, cách nhau một khoảng trống.

**Ví dụ:**

**Input**
```
10 2
```
**Output**
```
24 20
```

### J01002 - TÍNH TỔNG N SỐ NGUYÊN DƯƠNG ĐẦU TIÊN

Cho số nguyên dương N. 

Hãy tính S = 1 + 2 + ... + N

**Input:**

* Dòng đầu ghi số bộ test, không quá 10
* Mỗi dòng ghi một số nguyên dương N, không quá 10^9

**Output:**

Với mỗi test, ghi kết quả trên một dòng.

**Ví dụ:**

**Input**
```
2
10
20
```
**Output**
```
55
210
```

### J01003 - GIẢI PHƯƠNG TRÌNH BẬC NHẤT

Phương trình bậc nhất là phương trình dạng ax + b = 0.

Viết chương trình nhập vào hệ số a,b là các số thực và thực hiện giải phương trình bậc nhất.

* Nếu phương trình vô nghiệm thì in ra VN.
* Nếu phương trình có vô số nghiệm thì in ra VSN.
* Nếu phương trình có nghiệm duy nhất thì in ra với định dạng luôn 2 chữ số thập phân. 

**Input:**

Chỉ có hai số thực a và b. 

**Output:**

Ghi ra kết quả theo yêu cầu. 

**Ví dụ:**

**Input**
```
2 -1
```
**Output**
```
0.50
```

### J01004 - SỐ NGUYÊN TỐ

Viết chương trình kiểm tra một số nguyên dương có phải **số nguyên tố** hay không. Dòng đầu của dữ liệu vào ghi số bộ test. Mỗi dòng tiếp theo có một nguyên dương không quá 9 chữ số. Kết quả in ra YES nếu đó là số nguyên tố, in ra NO nếu ngược lại.

**Ví dụ:**

**Input**
```
3
123456
997
111111111
```
**Output**
```
NO
YES
NO
```

### J01005 - CHIA TAM GIÁC

Cho một tam giác cân có độ dài đáy bằng 1 và chiều cao bằng H. Bạn cần chia tam giác này thành N phần có diện tích bằng nhau và song song với đáy.

![image](https://github.com/VietHungHoang/JavaPTIT/assets/93313248/a96ed9eb-7cf4-43f8-8305-223a2e6e66f5)

Hãy in ra N-1 số là khoảng cách từ lát cắt thứ i tới đỉnh của tam giác.

**Input:**

Dòng đầu tiên là số lượng bộ test T (T ≤ 100).

Mỗi test gồm 2 số nguyên N và H (2 ≤ ≤ N ≤ 1000, 1 ≤ H ≤ 100 000).

**Output:**

Với mỗi test, in ra đáp án tìm được trên một dòng với 6 chữ số sau dấu phẩy.

**Ví dụ:**

**Input**
```
2
3 2
2 100000
```
**Output**
```
1.154701 1.632993
70710.678119
```

### J01006 - TÍNH SỐ FIBONACCI

Dãy số Fibonacci được định nghĩa theo công thức như sau:

F1 = 1

F2 = 1

Fn = Fn-1 + Fn-2 với n>2

Viết chương trình tính số Fibonacci thứ n (với n không quá 92).

**Input:**

Dòng đầu ghi số bộ test. Mỗi bộ test là một số nguyên n.

**Output:**

Với mỗi bộ test, ghi ra số Fibonacci thứ n trên một dòng.

**Ví dụ:**

**Input**
```
3
2
5
20
```
**Output**
```
1
5
6765
```









