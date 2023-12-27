import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J07011_ThongKeTuKhacNhauTrongFileVanBan{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        HashMap<String, Integer> map = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String s = sc.nextLine().toLowerCase().trim();
            StringBuilder sb = new StringBuilder(s);
            for(int j = 0; j < s.length(); j++){
                if(!Character.isAlphabetic(sb.charAt(j)) && !Character.isDigit(sb.charAt(j))) sb.setCharAt(j, ' ');
            }
            String[] arr = sb.toString().trim().split("\\s+");
            for(String x : arr)
                if(map.containsKey(x)) map.put(x, map.get(x) + 1);
                else map.put(x, 1);
        }
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o1.getValue() == o2.getValue()) return o1.getKey().compareTo(o2.getKey());
                else return o2.getValue() - o1.getValue();
            }
        });
        for(Map.Entry<String, Integer> entry : list)
            System.out.println(entry.getKey() + " " + entry.getValue());

    }
}