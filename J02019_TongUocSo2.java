import java.util.Scanner;

public class J02019_TongUocSo2 {

    public static int[] prime;
    public static void solve(){
        prime = new int[1000005];
        for(int i = 1; i < 1000005; i++)
            prime[i] = i;
        for(int i = 2; i <= Math.sqrt(1000005); i++)
            if(prime[i] > 0)
                for(int j = i * i; j < 1000005; j += i)
                    if(prime[j] == j) prime[j] = i;
    }

    public static long count(int n){
        int res = 1;
        while(n != 1){
            int tmp = prime[n];
            int cnt = 0;
            while(n % tmp == 0){
                cnt += 1;
                n /= tmp;
            }
            res *= ((long)Math.pow(tmp, cnt + 1) - 1) / (tmp - 1);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve();
        int a = sc.nextInt(), b = sc.nextInt();
        int cnt = 0;
        for(int i = a; i <= b; i++)
            if(count(i) - i > i) cnt++;
        System.out.println(cnt);
    }
}