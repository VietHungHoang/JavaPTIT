import java.math.BigInteger;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while(s.length() > 1){
            int n = s.length() / 2;
            BigInteger a = new BigInteger(s.substring(0, n));
            BigInteger b = new BigInteger(s.substring(n));
            s = a.add(b).toString();
            System.out.println(s);
        }
    }
}
