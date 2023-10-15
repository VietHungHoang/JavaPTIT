import java.util.Scanner;

public class J02034_BoSungDaySo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ok = false;
        int[] cnt = new int[201];
        for(int i = 0; i < n - 1; i++) cnt[sc.nextInt()]++;
        int max = sc.nextInt();
        for(int i = 1; i < max; i++){
            if(cnt[i] == 0){
                ok = true;
                System.out.println(i);
            }
        }
        if(!ok) System.out.println("Excellent!");

    }
}
