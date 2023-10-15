import java.util.Scanner;

public class J03007_SoDep2 {

    public static boolean isValid(String s){
        int sum = 0;
        for (int i = 0; i < s.length(); i++)
            sum += s.charAt(i) - '0';
        return sum % 10 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            StringBuilder sb = new StringBuilder(sc.next());
            System.out.println(sb.toString().matches("^8.*8$") && sb.equals(sb.reverse()) && isValid(sb.toString()) ? "YES" : "NO");
        }
    }
}
