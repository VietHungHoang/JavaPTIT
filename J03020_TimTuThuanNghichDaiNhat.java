import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class J03020_TimTuThuanNghichDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> res = new ArrayList<>();
        int maxLength = 0;
        while(sc.hasNext()){
            String s = sc.next();
            StringBuilder sb = new StringBuilder(s);
            if(s.equals(sb.reverse().toString())){
                res.add(s);
                maxLength = Math.max(maxLength, s.length());
            }
        }
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for(String i : res){
            if(i.length() == maxLength){
                if(map.containsKey(i)) map.put(i, map.get(i) + 1);
                else map.put(i, 1);
            }
        }
        for(String i : map.keySet()){
            System.out.println(i + " " + map.get(i));
        }

    }
}
