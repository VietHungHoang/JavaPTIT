import java.util.Scanner;

public class J03006_SoDep1 {

    public static boolean isValid(String s) {
        int l = s.length();
        for (int i = 0; i <= l / 2; i++)
            if (s.charAt(i) != s.charAt(l - i - 1) || (s.charAt(i) - '0') % 2 == 1)
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println(isValid(sc.next()) ? "YES" : "NO");
        }
    }
}
