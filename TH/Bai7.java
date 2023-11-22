import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Bai7{
    public static boolean isValid (int n){
        String s = n + "";
        for(int i = 1; i < s.length(); i++)
            if(s.charAt(i) < s.charAt(i - 1)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(isValid(n)){
                if(map.containsKey(n)) map.put(n, map.get(n) + 1);
                else map.put(n, 1);
            }
        }
            ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
            list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
            for(Map.Entry<Integer, Integer> entry : list)
                System.out.println(entry.getKey() + " " + entry.getValue());
    }
}