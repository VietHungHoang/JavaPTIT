import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class J08022_PhanTuBenPhaiDauTienLonHon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            Arrays.fill(b, -1);
            for(int i = 0;i < n; i++) a[i] = sc.nextInt();
            Stack<Integer> st = new Stack<>();
            for(int i = 0; i < n; i++){
                if(!st.empty())
                    while(st.size() > 0 && a[st.peek()] < a[i]){
                        b[st.peek()] = a[i];
                        st.pop();
                    }
                st.push(i);
            }
            for(int x : b) System.out.print(x + " ");
            System.out.println();
        }
    }
}