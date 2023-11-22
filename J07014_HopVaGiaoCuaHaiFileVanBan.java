import java.io.*;
import java.util.*;


class WordSet{
    private ArrayList<String> words = new ArrayList<>();
    public WordSet(String filename) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(filename));
        // while(sc.hasNext()) words.add(sc.next().toLowerCase());
        // sc.close();
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            String[] arr = s.split("\\s+");
            for(String x : arr) words.add(x.toLowerCase());
        }
    }

    public void setWords(String x) {
        this.words.add(x);
    }
    public String union(WordSet s){
        TreeMap<String, Integer> map = new TreeMap<>();
        for(String word : words) map.put(word, 1);
        for(String word : s.words)
            if(map.containsKey(word)) map.put(word, 2);
            else map.put(word, 1);
        String res = "";
        for(String word : map.keySet())
            res += word + " ";
        return res.trim();
    }
    public String intersection(WordSet s){
        TreeMap<String, Integer> map = new TreeMap<>();
        for(String word : words) map.put(word, 1);
        for(String word : s.words)
            if(map.containsKey(word)) map.put(word, 2);
            else map.put(word, 1);
        String res = "";
        for(String word : map.keySet())
            if(map.get(word) == 2) res += word + " ";
        return res.trim();
    }
}
public class J07014_HopVaGiaoCuaHaiFileVanBan {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
