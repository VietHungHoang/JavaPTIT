import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class J08010_TimTuThuanNghichDaiNhat {

    public static boolean check(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        int max_length = 0;
        while(sc.hasNext()){
            String s = sc.next();
            if(check(s)){
                max_length = Math.max(max_length, s.length());
                arr.add(s);
            }
        }
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for(String s : arr){
            if(s.length() == max_length){
                if(map.containsKey(s)) map.put(s, map.get(s) + 1);
                else map.put(s, 1);
            }
        }
        for(String s : map.keySet()) System.out.println(s + " " + map.get(s));
    }    
}