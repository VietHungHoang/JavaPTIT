import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        while(t-- > 0){
            String[] arr = sc.nextLine().split("\\s+");
            for(int i = arr.length - 1; i >= 0; i--)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}
