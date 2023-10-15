import java.util.*;
public class J01011_BoiSoChung_UocSoChung {
    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println((1L * a * b / gcd(a, b)) + " " + gcd(a, b));
        }
    }
}
