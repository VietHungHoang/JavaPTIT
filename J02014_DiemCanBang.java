import java.util.Scanner;

public class J02014_DiemCanBang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                sum += a[i];
            }
            boolean ok = false;
            int cnt = a[0];
            int i;
            for(i = 1; i < n - 1; i++){
                if(sum - a[i] - cnt == cnt){
                    System.out.println(i + 1);
                    ok = true;
                    break;
                }
                else cnt += a[i];
            }
            if(!ok || cnt == sum) System.out.println(-1);
        }
    }
}
