import java.util.Scanner;
// Đồ thị là hình sao khi trong danh sách kề, chỉ có 1 đỉnh kề với n - 1 cạnh còn lại. Còn n - 1 đỉnh còn lại có duy nhất 1 đỉnh kề
public class J08012_HinhSao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] adj = new int[n + 1];
        for(int i = 1; i < n; i++){
            adj[sc.nextInt()]++;
            adj[sc.nextInt()]++;
        }
        for(int i = 1; i <= n; i++)
            if(adj[i] != 1 && adj[i] != n - 1){
                System.out.println("No");
                return;
            }
        System.out.println("Yes");
    }
}