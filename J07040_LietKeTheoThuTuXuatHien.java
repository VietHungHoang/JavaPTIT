import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class J07040_LietKeTheoThuTuXuatHien {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        HashSet<String> set1 = new HashSet<>();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> arr = (ArrayList<String>) ois.readObject();
        for(String x : arr){
            for(String y : x.toLowerCase().split("\\s+"))
                set1.add(y);
        }
        Scanner sc = new Scanner(new File("VANBAN.in"));
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        while(sc.hasNext()) set2.add(sc.next().toLowerCase());
        for(String x : set2)
            if(set1.contains(x)) System.out.println(x);


    }
}
