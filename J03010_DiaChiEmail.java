import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J03010_DiaChiEmail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        ArrayList<String> a = new ArrayList<>();
        while (n-- > 0){
            String[] arr = sc.nextLine().trim().toLowerCase().split("\\s+");
            String s = arr[arr.length - 1];
            for (int i = 0; i < arr.length - 1; i++)
                s += arr[i].charAt(0);
            a.add(s);
            int cnt = Collections.frequency(a, s);
            s += (cnt == 1 ? "" : cnt) + "@ptit.edu.vn";
            System.out.println(s);
        }
    }
}
