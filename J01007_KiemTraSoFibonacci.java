
import java.util.Scanner;

public class J01007_KiemTraSoFibonacci {
    public static long[] fibo = new long[100];
    public static void perFibo() {
        fibo[0] = 0;
        fibo[1] = fibo[2] = 1;
        for (int i = 3; i <= 92; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }
    public static boolean checkFibo(long n){
        for(int i = 0; i < 93; i++)
            if(fibo[i] == n) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        perFibo();
        int t = sc.nextInt();
        while(t-- > 0){
            if(checkFibo(sc.nextLong())) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
