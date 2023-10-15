import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003_TachDoiVaTinhTong {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        String n = sc.next();
        if (n.length() == 1) {
            System.out.println(n);
            return;
        }
        while(n.length() > 1){
            BigInteger a = new BigInteger(n.substring(0, n.length()/2));
            BigInteger b = new BigInteger(n.substring(n.length()/2));
            n = a.add(b).toString();
            System.out.println(n);
        }
    }
}
