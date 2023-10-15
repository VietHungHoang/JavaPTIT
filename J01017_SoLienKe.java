import java.util.Scanner;

public class J01017_SoLienKe {

    public static boolean check(String s){
        for(int i = 0; i < s.length() - 1; i++)
            if(Math.abs(s.charAt(i) - s.charAt(i + 1)) != 1) return false;
        return true;
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
