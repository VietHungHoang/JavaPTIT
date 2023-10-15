import java.util.Scanner;

public class J02012_SapXepChen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++){
            int idx = i;
            while (idx > 0 && a[idx] < a[idx - 1]) {
                int tmp = a[idx];
                a[idx] = a[idx - 1];
                a[idx - 1] = tmp;
                idx--;
            }
            System.out.printf("Buoc %d: ", i);
            for (int j = 0; j <= i; j++) System.out.print(a[j] + " ");
            System.out.println();
        }
    }
}