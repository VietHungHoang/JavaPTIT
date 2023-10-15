import java.util.Scanner;

public class J02022_SoXaCach {
    public static int n;
    public static int[] x = new int[10];
    public static boolean[] used = new boolean[10];

    public static boolean check(){
        for(int i = 1; i < n; i++)
            if(Math.abs(x[i] - x[i + 1]) == 1) return false;
        return true;
    }
    public static void Try(int i){
        for(int j = 1; j <= n; j++)
            if(!used[j]){
                used[j] = true;
                x[i] = j;
                if(i == n){
                    if(check()){
                        for(int k = 1; k <= n; k++)
                            System.out.print(x[k]);
                        System.out.println();
                    }
                }
                else Try(i + 1);
                used[j] = false;
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            Try(1);
            System.out.println();
        }        
    }
}
