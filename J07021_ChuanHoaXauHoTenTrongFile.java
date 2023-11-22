import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07021_ChuanHoaXauHoTenTrongFile {

    public static String stdName(String s){
        s = s.toLowerCase();
        String[] arr = s.trim().split("\\s+");
        String res = "";
        for(String x : arr){
            StringBuilder sb = new StringBuilder(x);
            sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
            res += sb.toString() + " ";
        }
        return res;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(true){
            String s = sc.nextLine();
            if(s.equals("END")) break;
            else System.out.println(stdName(s));
        }
    }
}
