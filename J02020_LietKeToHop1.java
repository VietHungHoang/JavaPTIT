import java.util.Scanner;

public class J02020_LietKeToHop1 {
    public static int[] x = new int[10];
    public static int n, k, cnt = 0;

    public static void Try(int i){
        for(int j = x[i - 1] + 1; j <= n - k + i; j++){
            x[i] = j;
            if(i == k){
                cnt++;
                for(int r = 1; r <= k; r++) System.out.print(x[r] + " ");
                System.out.println();
            }
            else Try(i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt(); 
        Try(1);
        System.out.println("Tong cong co " + cnt + " to hop");
        
    }
}
