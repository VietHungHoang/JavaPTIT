import java.io.*;
import java.util.*;

public class TH_LietKeVaDem {
    public static boolean check(String s){
        for(int i = 0;i < s.length() - 1; i++)
            if(s.charAt(i + 1) < s.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(System.in);
        LinkedHashMap <String, Integer> map = new LinkedHashMap<>();
        while(sc.hasNext()){
            String s = sc.next();
            if(check(s)) map.put(s, map.getOrDefault(s, 0) + 1);
        }
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
                return o2.getValue() - o1.getValue();
            }
        });
        for(Map.Entry<String, Integer> i : list)
            System.out.println(i.getKey() + " " + i.getValue());
    }
}