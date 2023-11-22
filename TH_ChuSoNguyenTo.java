import java.io.*;
import java.util.*;

public class TH_ChuSoNguyenTo {

    public static int[] x = new int[15];
    public static int[] y = {2, 3, 5, 7};

    public static boolean check(int n){
        int cnt[] = new int[10];
        for(int i = 1;i <= n; i++)
            cnt[x[i]]++;
        return x[n] % 2 != 0 && cnt[2] > 0 && cnt[3] > 0 && cnt[5] > 0 && cnt[7] > 0;
    }
    public static void Try(int i, int n){
        for(int j = 0; j < 4; j++){
            x[i] = y[j];
            if(i == n){
                if(check(n)){
                    for(int k = 1; k <= n; k++)
                        System.out.print(x[k]);
                    System.out.println();
                }
            } else Try(i + 1, n);

        }
    }
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for(int i = 4; i <= n; i++)
            Try(1, i);
    }
}