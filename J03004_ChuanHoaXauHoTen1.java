import java.util.Scanner;

public class J03004_ChuanHoaXauHoTen1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        while(t-- > 0){
            String[] arr = sc.nextLine().toLowerCase().split("\\s+");
            for(String x : arr){
                StringBuilder sb = new StringBuilder(x);
                sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
                System.out.print(sb + " ");
            }
            System.out.println();
        }
    }    
}
