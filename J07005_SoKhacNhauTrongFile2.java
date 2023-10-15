import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class J07005_SoKhacNhauTrongFile2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] cnt = new int[1001];
        for (int i = 0; i < 100000; i++) cnt[dis.readInt()]++;
        for (int i = 0; i < 1000; i++)
            if (cnt[i] > 0) System.out.println(i + " " + cnt[i]);
    }
}