import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J07029_SoNguyenToLonNhatTrongFile {

    public static boolean[] prime = new boolean[1000001];

    public static void sieve(){
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for(int i = 2; i <= Math.sqrt(1000000); i++)
            if(prime[i])
                for(int j = i * i; j <= 1000000; j += i)
                    prime[j] = false;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Scanner sc = new Scanner(System.in);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();
        sieve();
        int[] cnt = new int[1000001];
        for(Integer x : a) cnt[x]++;
        int count = 0;
        for(int i = 1000000; i >= 2; i--){
            if(cnt[i] > 0 && prime[i]){
                System.out.println(i + " " + cnt[i]);
                count++;
            }
            if(count == 10) break;
        }
    }
}