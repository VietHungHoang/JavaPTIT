import java.util.Scanner;

public class J02004_MangDoiXung {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            boolean ok = true;
            for (int i = 0; i < n / 2; i++)
                if (a[i] != a[n - i - 1]) ok = false;
            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}