
import java.util.Scanner;


public class J01010_CatDoi {
    public static long solve(String s){
         StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == '8' || sb.charAt(i) == '9') sb.setCharAt(i, '0');
            else if(sb.charAt(i) != '0' && sb.charAt(i) != '1') return 0;
        }
        return Long.parseLong(sb.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            long res = solve(sc.nextLine());
            if(res == 0) System.out.println("INVALID");
            else System.out.println(res);
        }
    }
}
