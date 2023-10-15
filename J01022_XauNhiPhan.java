import java.util.Scanner;

public class J01022_XauNhiPhan {

    public static long f[] = new long[100];

    public static void fibo(){
        f[1] = 1;
        for(int i = 2; i <= 93; i++) f[i] = f[i - 1] + f[i - 2];
    }
    public static int solve(int n, long k){
        if(n == 1) return 0;
        if(n == 2) return 1;
        if(k <= f[n - 2]) return solve(n - 2, k);
        return solve(n - 1, k - f[n - 2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fibo();
        int t = sc.nextInt();
        while(t-- > 0) System.out.println(solve(sc.nextInt(), sc.nextLong()));
    }
}