import java.io.*;
import java.util.*;

public class J07012_ThongKeTuKhacNhauTrongFileNhiPhan{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) ois.readObject();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < a.size(); i++){
            String s = a.get(i).toLowerCase();
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