import java.util.Arrays;
import java.util.Scanner;
//Sử dụng upper_bound và lower_bound để tìm các phần tử > a[i] và a[j] = k - a[i]
public class J08015_CapSoCoTongBangK {

    public static int upper_bound(long[] a, long n, int i){
        int l = i, r = a.length - 1;
        int res = -1;
        while(l <= r){
            int m = (l + r) / 2;
            if(a[m] == n){
                res = m;
                l = m + 1;
            }
            else if (a[m] < n) l = m + 1;
            else r = m - 1;
        }
        return res;
    }

    public static int lower_bound(long[] a, long n, int i){
        int l = i, r = a.length - 1;
        int res = -1;
        while(l <= r){
            int m = (l + r) / 2;
            if(a[m] == n){
                res = m;
                r = m - 1;
            }
            else if (a[m] < n) l = m + 1;
            else r = m - 1;
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(), k = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextLong();
            Arrays.sort(a);
            long res = 0;
            for(int i = 0;i < n; i++){
                int down = lower_bound(a, k - a[i], i + 1);
                int up = upper_bound(a, k - a[i], i + 1);
                if(down != -1 && up != -1)
                    res += up - down + 1;
            }
            System.out.println(res);

        }
    }
}
