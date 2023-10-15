import java.util.Scanner;

public class J02103_TichMaTranVoiChuyenViCuaNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int r = 1; r <= t; r++){
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] a = new int[n][m];
            int[][] b = new int[n][n];
            for(int i = 0; i < n; i++)
                for(int j = 0; j < m; j++) a[i][j] = sc.nextInt();
            for(int i = 0; i < n; i++)
                for(int j = 0; j < n; j++)
                    for(int k = 0; k < m; k++)
                        b[i][j] += a[i][k] * a[j][k];
            System.out.printf("Test %d:\n", r);
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++)
                    System.out.print(b[i][j] + " ");
                System.out.println();
            }
        }

    }
}