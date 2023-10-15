
import java.util.Scanner;

public class J01012_UocSoChiaHetCho2 {
    public static int solve(int n){
        int res = 0;
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(i % 2 == 0) res++;
                if((n / i) % 2 == 0 && i != n / i) res ++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println(solve(sc.nextInt()));
        }
    }
}
