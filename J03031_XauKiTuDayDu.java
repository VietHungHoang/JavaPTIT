import java.util.Scanner;

public class J03031_XauKiTuDayDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int k = sc.nextInt();
            int[] a = new int[26];
            for(int i = 0; i < s.length(); i++){
                a[s.charAt(i) - 'a'] = 1;
            }
            int res = 0;
            for(int x : a) res += x;
            if(s.length() >= 26 && 26 - res <= k) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
