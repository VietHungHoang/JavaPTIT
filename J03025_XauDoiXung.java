import java.util.Scanner;

public class J03025_XauDoiXung {

    public static boolean check(String s){
        int l = 0, r = s.length() - 1;
        int cnt = 0;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) cnt++;
            l++;
            r--;
        }
        return (cnt < 2 && s.length() % 2 == 1) || (cnt == 1 && s.length() % 2 == 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        while(t-- > 0){
            System.out.println(check(sc.nextLine()) ? "YES" : "NO");
        }
    }    
}