import java.util.Arrays;
import java.util.Scanner;

public class J02033_DaoDau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[n];
        int cnt = 0;
        for(int i = 0;i < n; i++){
            a[i] = sc.nextInt();
            if(a[i] < 0) cnt++;
        }
        Arrays.sort(a);
        if(cnt >= k){ // Không thể biến hết tất cả số âm thành số dương
            long res = 0;
            for(int i = 0; i < n; i++)
                if(i < k) res += -a[i];
                else res += a[i];
            System.out.println(res);
        }
        else{
            long res = 0;
            int min = 1000000000;
            for(int i = 0;i < n; i++){
                if(a[i] < 0) res += -a[i];
                else res += a[i];
                min = Math.min(min, Math.abs(a[i]));
            }
            k -= cnt;
            if(k % 2 == 0) System.out.println(res);
            else System.out.println(res - min * 2);
        }
    }
}
