import java.util.Scanner;

public class J03036_XoayVongKiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n];
        for(int i = 0; i < n; i++) a[i] = sc.next();
        String s = a[0];
        int res = 0;
        for(int i = 0; i < n - 1; i++){
            s = s.substring(1) + s.charAt(0);
            int cnt = 0;
            for(int j = 0; j < n; j++){
                String tmp = a[j];
                while(!tmp.equals(s)){
                    tmp = tmp.substring(1) + tmp.charAt(0);
                    cnt++;
                }

        }
    }
}
