
import java.util.*;

public class J01004_SoNguyenTo {
    public static boolean prime(int n){
    for(int i = 2; i <= Math.sqrt(n); i++)
        if(n % i == 0) return false;
    return n > 1;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            if(prime(sc.nextInt())) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
