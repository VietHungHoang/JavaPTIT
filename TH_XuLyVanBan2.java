import java.io.*;
import java.util.*;

public class TH_XuLyVanBan2 {
    public static boolean check(String s){
        boolean ok = false;
        for(int i = 0;i < s.length(); i++)
            if(s.charAt(i) == '.' || s.charAt(i) == ',' || s.charAt(i) == '?' || s.charAt(i) == '!' || s.charAt(i) == ':') return false;
            else if(Character.isDigit(s.charAt(i))) ok = true;
        return ok;
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> ts = new TreeSet<>();
        while(sc.hasNext()){
            String s = sc.next();
            if(check(s)) ts.add(s);
        }
        for(String x : ts) System.out.println(x);
    }
}