import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07032_SoThuanNghichTrongFile {

    public static boolean check(int n){
        String s = Integer.toString(n);
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) % 2 == 0) return false;
        return s.length() > 1 && s.length() % 2 == 1 && s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        int[] cnt = new int[1000001];
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) ois1.readObject();

        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr2 = (ArrayList<Integer>) ois2.readObject();
        for(Integer x : arr1)
            if(check(x) && arr2.contains(x)) cnt[x]++;
        for(Integer x : arr2)
            if(check(x) && cnt[x] > 0) cnt[x]++;
        int count = 0;
        for(int i = 100; i < 1000001; i++){
            if(cnt[i] > 0){
                System.out.println(i + " " + cnt[i]);
                count++;
            }
            if(count == 10) break;
        }
    }
}