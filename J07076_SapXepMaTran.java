import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class J07076_SapXepMaTran {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(), m = sc.nextInt(), i = sc.nextInt();
            int a[][] = new int[n][m];
            int[] b = new int[n];
            for (int j = 0; j < n; j++) 
                for (int k = 0; k < m; k++){
                    a[j][k] = sc.nextInt();
                    if(k == i - 1) b[j] = a[j][k];
                }
            Arrays.sort(b);
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++){
                    if(k == i - 1) System.out.print(b[j] + " ");
                    else System.out.print(a[j][k] + " ");
                }
                System.out.println();
         }
        }
                
        
    }
}
