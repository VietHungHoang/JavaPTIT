import java.math.BigInteger;
import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t -- > 0) {
            int dem = 0;
            BigInteger n = sc.nextBigInteger();
            while (!n.mod(BigInteger.valueOf(13)).equals(BigInteger.ZERO) && dem < 1000) {
                n = n.add(reverseNumber(n));
                dem ++;
            }
            if (dem == 1000) System.out.println("-1");
            else System.out.println(n);
        }
    }
    public static BigInteger reverseNumber(BigInteger num) {
        String numStr = num.toString();
        String reverseStr = new StringBuilder(numStr).reverse().toString();
        return new BigInteger(reverseStr);
        
    }
}