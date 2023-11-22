import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07022_LoaiBoSoNguyen {

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
        ArrayList<String> arr = new ArrayList<>();
        while(sc.hasNext()){
            String s = sc.next();
            try{
                int n = Integer.valueOf(s);   
            }
            catch(Exception e){
                arr.add(s);
            }
        }
        Collections.sort(arr);
        for(String x : arr) System.out.print(x + " ");
    }
}
