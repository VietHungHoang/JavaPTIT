import java.util.ArrayList;
import java.util.Scanner;

public class J03022_XuLyVanBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        while(sc.hasNext()){
            arr.add(sc.next().toLowerCase());
        }
        String res = "";
        for(String x : arr)
            if(x.endsWith(".") || x.endsWith("?") || x.endsWith("!")){
                res += x.substring(0, x.length() - 1);
                StringBuilder sb = new StringBuilder(res);
                sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
                System.out.println(sb.toString());
                res = "";
            }
            else res += x + " ";
    }    
}