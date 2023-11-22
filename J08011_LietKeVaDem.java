import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class J08011_LietKeVaDem {
    public static boolean check(int x){
        String s = String.valueOf(x);
        for(int i = 0; i < s.length() - 1; i++)
            if(s.charAt(i + 1) < s.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        while(sc.hasNext()){
            int x = sc.nextInt();
            if(check(x)){
                if(map.containsKey(x)) map.put(x, map.get(x) + 1);
                else map.put(x, 1);
            }
        }
        ArrayList<Map.Entry<Integer, Integer>> arr = new ArrayList<>(map.entrySet());
        arr.sort((a, b) -> {
            return b.getValue() - a.getValue();
        });
        for(Map.Entry<Integer, Integer> x : arr)
            System.out.println(x.getKey() + " " + x.getValue());
    }    
}