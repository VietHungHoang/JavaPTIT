import java.util.Scanner;

public class J03026_XauKhacNhauDaiNhat {

    public static int solve(String a, String b){
        if(a.equals(b)) return -1;
        return Math.max(a.length(), b.length());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        while(t-- > 0){
            System.out.println(solve(sc.nextLine(), sc.nextLine()));
        }
    }    
} 