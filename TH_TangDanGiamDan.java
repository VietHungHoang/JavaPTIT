import java.util.Scanner;

public class TH_TangDanGiamDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] cnt = new int[1001];
            for(int i = 0; i < n; i++) cnt[sc.nextInt()]++;
            for(int i = 0;i < 1001; i += 2)
                if(cnt[i] > 0) System.out.print(i + " ");
            System.out.println();
            for(int i = 999; i > 0; i -= 2)
                if(cnt[i] > 0) System.out.print(i + " ");
            System.out.println();
        }

    }
}