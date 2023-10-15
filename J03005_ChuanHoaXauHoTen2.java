import java.util.Scanner;

public class J03005_ChuanHoaXauHoTen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        while(t-- > 0){
            String[] arr = sc.nextLine().trim().toLowerCase().split("\\s+");
            int n = arr.length;
            for(int i = 1; i < n; i++){
                StringBuilder sb = new StringBuilder(arr[i]);
                sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
                System.out.print(sb);
                System.out.print(i < n - 1 ? " " : ", ");
            }
            System.out.println(arr[0].toUpperCase());
        }
    }    
}
