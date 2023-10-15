import java.util.HashSet;
import java.util.Scanner;

public class J03009_TapTuRiengCuaHaiXau {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        while (t-- > 0) {
            String[] a = sc.nextLine().split("\\s+");
            String b = sc.nextLine();
            HashSet<String> c = new HashSet<>();
            for (String i : a)
                if (!b.contains(i)) c.add(i);
            for (String i : c) System.out.print(i + " ");
        System.out.println();
        }
    }
}
