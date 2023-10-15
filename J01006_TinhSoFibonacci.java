
import java.util.Scanner;

public class J01006_TinhSoFibonacci {
    public static long[] fibo = new long[100];
    public static void perFibo() {
        fibo[1] = fibo[2] = 1;
        for (int i = 3; i <= 92; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        perFibo();
        int t = sc.nextInt();
        while(t-- > 0) System.out.println(fibo[sc.nextInt()]);
    }
}
