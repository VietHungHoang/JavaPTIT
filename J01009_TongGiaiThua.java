
import java.util.Scanner;


public class J01009_TongGiaiThua {
    public static long factorial(int n){
        if(n == 1) return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long res = 0;
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++)
            res += factorial(i);
        System.out.println(res);
    }
}
