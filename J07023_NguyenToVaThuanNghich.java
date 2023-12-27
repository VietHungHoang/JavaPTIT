import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;

class NumberSet{
    private TreeMap<Integer, Integer> map = new TreeMap<>();
    public NumberSet(String filename) throws IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(filename)));
        ArrayList<Integer> arr = (ArrayList<Integer>) ois.readObject();
        for(int x : arr)
            if(check(x)) map.put(x, (map.containsKey(x) ? map.get(x) : 0) + 1);
    }

    public boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0) return false;
        return n > 1;
    }

    public boolean check(int x){
        StringBuilder sb = new StringBuilder(x + "");
        return isPrime(x) && sb.toString().equals(sb.reverse().toString());
    }

    public void intersection(NumberSet other){
        ArrayList<Integer> res = new ArrayList<>();
        for (int x : map.keySet())
            if(other.map.containsKey(x)) System.out.println(x + " " + map.get(x) + " " +  other.map.get(x));
    }
}

public class J07023_NguyenToVaThuanNghich {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        NumberSet s1 = new NumberSet("DATA1.in");
        NumberSet s2 = new NumberSet("DATA2.in");
        s1.intersection(s2);        
    }
}
