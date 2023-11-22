import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) throws Exception{
        Scanner nhap = new Scanner(new File("DANHSACH.in"));
        while(nhap.hasNextLine()){
            String s = nhap.nextLine();
            System.out.println(stdName(s));
        }
        
        nhap.close();

    }
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
}
