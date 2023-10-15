import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07006_SoKhacNhauTrongFile3 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) ois.readObject();
        int[] cnt = new int[1001];
        for (Integer i : arr) cnt[i]++;
        for (int i = 0; i < 1000; i++)
            if (cnt[i] > 0) System.out.println(i + " " + cnt[i]);
    }
}