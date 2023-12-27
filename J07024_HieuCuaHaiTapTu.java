import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

class WordSet{
    private TreeSet<String> set = new TreeSet<>();
    public WordSet(String filename) throws IOException{
        Scanner sc = new Scanner(new File(filename));
        while(sc.hasNext()) set.add(sc.next().toLowerCase());
    }
    public String difference(WordSet other){
        String res = "";
        for(String x : this.set)
            if(!other.set.contains(x)) res += x + " ";
        return res;
    }
}

public class J07024_HieuCuaHaiTapTu {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}
