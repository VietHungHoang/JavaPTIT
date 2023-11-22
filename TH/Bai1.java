import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Scanner;

public class Bai1{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        BigInteger a = sc.nextBigInteger();
        BigInteger min = a;
        BigInteger max = a;
        BigInteger sum = a;
        Collections.max();
        for(int i = 1; i < n; i++){
            a = sc.nextBigInteger();
            sum = sum.add(a);
            if (min.compareTo(a) > 0) min = a;
            else if(max.compareTo(a) < 0) max = a;
        }
        System.out.println(min + "\n" + max + "\n" + sum);
    }
}