
import java.util.Scanner;

public class J01002_TinhTongNSoNguyenDuongDauTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextInt();
            System.out.println((a * (a + 1) / 2));
        }
    }
}
