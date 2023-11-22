import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.util.ArrayList;

public class J07085_TongChuSo {

    public static int sumDigit(String s){
        int res = 0;
        for(int i = 0; i < s.length(); i++)
            res += s.charAt(i) - '0';
        return res;
    }

    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> arr = (ArrayList<String>) ois.readObject();
        for(String x : arr){
            String tmp = "";
            for(int i = 0; i < x.length(); i++)
                if(x.charAt(i) >= '0' && x.charAt(i) <= '9') tmp += x.charAt(i);
            BigInteger a = new BigInteger(tmp);
            System.out.print(a + " ");
            System.out.println(sumDigit(a.toString()));
        }
    }
}
