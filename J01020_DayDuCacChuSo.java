import java.util.Scanner;

public class J01020_DayDuCacChuSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long m = n;
            if(n == 0) System.out.println("Impossible");
            else{
                int[] a = new int[10];
                int cnt = 0;
                int k = 2;
                while(cnt < 10){
                    String s = String.valueOf(m);
                    for(int i = 0; i < s.length(); i++){
                        a[s.charAt(i) - '0'] = 1;
                    }
                    cnt = 0;
                    for(int i = 0; i < 10; i++) cnt += a[i];
                    if(cnt == 10) break;
                    else m = n * k++;
                    
                }
                System.out.println(m);
            }
        }
    }
}
