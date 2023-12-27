import java.util.Arrays;
import java.util.Scanner;

public class J02102_MaTranXoanOcTangDan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n * n];
        for(int i = 0; i < n * n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        int b[][] = new int[n][n];
        int r1 = 0, r2 = n - 1, c1 = 0, c2 = n - 1;
        int cnt = 0;
        while(r1 <= r2 && c1 <= c2){
            for(int j = c1; j <= c2; j++)
                b[r1][j] = a[cnt++];
            r1++;
            if(c1 <= c2)
                for(int i = r1; i <= r2; i++)
                    b[i][c2] = a[cnt++];
            c2--;
            if(r1 <= r2)
                for(int j = c2; j >= c1; j--)
                    b[r2][j] = a[cnt++];
            r2--;
            for(int i = r2; i >= r1; i--)
                b[i][c1] = a[cnt++];
            c1++;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                System.out.print(b[i][j] + " ");
            System.out.println();
        }
    }
}