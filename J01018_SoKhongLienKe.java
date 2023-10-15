import java.util.Scanner;

public class J01018_SoKhongLienKe {

    public static int sumDigit(String s){
        int res = 0;
        for(int i = 0; i < s.length(); i++)
            res += s.charAt(i) - 48;
        return res;
    }

    public static boolean check(String s){
        for(int i = 0; i < s.length() - 1; i++)
            if(Math.abs(s.charAt(i) - s.charAt(i + 1)) != 2) return false;
        return sumDigit(s) % 10 == 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        while(t-- > 0){
            if(check(sc.next())) System.out.println("YES");
            else System.out.println("NO");            
        }
    }
}
