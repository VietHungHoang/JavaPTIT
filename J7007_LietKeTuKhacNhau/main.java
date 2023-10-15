package J7007_LietKeTuKhacNhau;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

class WordSet{
    private TreeSet<String> set;

    public WordSet(String fileName) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(fileName));
        set = new TreeSet<>();
        while(sc.hasNext())
            set.add(sc.next().toLowerCase());
    }

    public String toString(){
        String tmp = "";
        for(String x : set) tmp += x + "\n";
        return tmp;
    }
}

public class main {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
