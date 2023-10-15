import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07015_SoNguyenToTrongFileNhiPhan {

    public static boolean prime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0) return false;
        return n > 1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) ois.readObject();
        int[] cnt = new int[10001];
        for(Integer x : arr)
            if(prime(x)) cnt[x]++;
        for(int i = 2; i < 10000; i++)
            if(cnt[i] > 0) System.out.println(i + " " + cnt[i]);
    }
}
