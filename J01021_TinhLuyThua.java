import java.util.Scanner;

public class J01021_TinhLuyThua {

    public static final int MOD = (int)1e9 + 7;

    public static long binPow(long a, long b){
        if(b == 0) return 1;
        if(b == 1) return a;
        long x = binPow(a, b / 2) % MOD;
        if(b % 2 == 0) return x * x % MOD;
        else return ((x * x) % MOD * a) % MOD;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            long a = sc.nextLong(), b = sc.nextLong();
            if(a == 0 && b == 0) break;
            System.out.println(binPow(a, b));
        }
    }
}