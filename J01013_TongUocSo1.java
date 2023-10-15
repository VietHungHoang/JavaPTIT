import java.util.Scanner;

public class J01013_TongUocSo1 {

    public static final int maxn = (int)2e6;
    public static int[] prime = new int[maxn + 1];

    public static void sieve(){
        for(int i = 1; i <= maxn; i++) prime[i] = i;
        for(int i = 2; i <= Math.sqrt(maxn); i++)
            if(prime[i] > 0)
                for(int j = i * i; j <= maxn; j += i)
                    if(prime[j] == j) prime[j] = i;
    }

    public static int sumDivisor(int n){
        int res = 0;
        while(n != 1){
            int tmp = prime[n];
            while(n % tmp == 0){
                res += tmp;
                n /= tmp;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sieve();
        int t = sc.nextInt();
        long res = 0;
        while(t-- > 0)  res += sumDivisor(sc.nextInt());
        System.out.println(res);
    }

}