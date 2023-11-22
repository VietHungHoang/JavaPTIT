import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07016_SoNguyenToTrongHaiFileNhiPhan {

    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0) return false;
        return n > 1;
    }
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) ois2.readObject();
        int[] cnt1 = new int[10001];
        int[] cnt2 = new int[10001];
        for(int x : a) if(isPrime(x)) cnt1[x]++;
        for(int x : b) if(isPrime(x)) cnt2[x]++;
        for(int i = 0; i < 10001; i++)
            if(cnt1[i] > 0 && cnt2[i] > 0)
                System.out.println(i + " " + cnt1[i] + " " + cnt2[i]);
    }
}
