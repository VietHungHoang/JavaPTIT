import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Matrix{
    private int[][] a;
    private int n, m, r;
    public Matrix(int[] a, int n, int m, int r) {
        this.n = n;
        this.m = m;
        this.r = r;
        this.a = new int[this.n][this.m];
        int k = 0;
        for(int i = 0; i < this.n; i++)
            for(int j = 0;j < this.m; j++)
                this.a[i][j] = a[k++];
        sortMatrix();
    }
    
    public void sortMatrix(){
        int[] tmp = new int[n];
        for(int i = 0; i < n; i++)
            tmp[i] = a[i][r - 1];
        Arrays.sort(tmp);
        for(int i = 0; i < n; i++)
            a[i][r - 1] = tmp[i];
    }

    public int[][] getA() {
        return a;
    }
}

public class TH_SapXepMaTran {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt(); sc.nextLine();
        while(t-- > 0){
            int n = sc.nextInt(), m = sc.nextInt(), r = sc.nextInt(); sc.nextLine();
            int[] a = new int[n * m];
            for(int i = 0; i < n * m; i++) a[i] = sc.nextInt();
            Matrix matrix = new Matrix(a, n, m, r);
            for(int i = 0; i < n; i++){
                for(int j = 0;j < m; j++)
                    System.out.print(matrix.getA()[i][j] + " ");
                System.out.println();
            }
        }
        
        

    }
}