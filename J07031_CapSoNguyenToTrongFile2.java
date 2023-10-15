import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class J07031_CapSoNguyenToTrongFile2 {

    public static boolean[] prime = new boolean[1000001];

    public static void sieve(){
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for(int i = 2; i <= Math.sqrt(1000001); i++)
            if(prime[i])
                for(int j = i * i; j <= 1000000; j += i)
                    prime[j] = false;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        sieve();
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) ois1.readObject();
        TreeSet<Integer> st1 = new TreeSet<>();
        for(Integer x : arr1)
            if(prime[x]) st1.add(x);

        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr2 = (ArrayList<Integer>) ois2.readObject();
        HashSet<Integer> st2 = new HashSet<>();
        for(Integer x : arr2)
            if(prime[x]) st2.add(x);
        
        for(Integer x : st1)
            for(Integer y : st1)
                if(x < y && x + y == 1000000 && !st2.contains(x) && !st2.contains(y) ) System.out.println(x + " " + y);
    }
}