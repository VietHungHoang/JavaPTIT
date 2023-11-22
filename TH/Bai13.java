import java.util.Scanner;

public class Bai13 {
    public static int[] x = new int[15];
    public static int[] a = {2, 3, 5, 7};
    public static int n;

    public static void Try(int i){
        for(int j = 0; j < 4; j++){
            x[i] = a[j];
            if(i == n){
                if(x[n] != 2){
                    int[] cnt = new int[10];
                    for(int k = 1; k <= n; k++)
                        cnt[x[k]]++;
                    if(cnt[2] > 0 && cnt[3] > 0 && cnt[5] > 0 && cnt[7] > 0){
                        for(int k = 1; k <= n; k++)
                            System.out.print(x[k]);
                        System.out.println();
                    }
                }
            }
            else Try(i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
            for(int i = 4; i <= s; i++){
            n = i;
            Try(1);
        }
    }
}
