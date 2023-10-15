import java.util.Scanner;

public class J03032_DaoTu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        while(t-- > 0){
            String[] arr = sc.nextLine().split("\\s+");
            for(String x : arr){
                System.out.print(new StringBuilder(x).reverse() + " ");
            }
            System.out.println();
        }
    }    
} 