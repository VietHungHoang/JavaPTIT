import java.util.Scanner;

public class J03008_SoDep3 {

    public static boolean isRevered(String s) {
        int l = s.length();
        for (int i = 0; i < l / 2; i++) 
            if (s.charAt(i) != s.charAt(l - i - 1)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(s.matches("[^014689]+") && isRevered(s) ? "YES" : "NO");
        }
    }
}
