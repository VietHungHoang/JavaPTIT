import java.util.Scanner;
import java.util.Stack;

public class J08023_HinhChuNhatLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] a = new long[n + 1];
            a[0] = -1;
            for(int i = 1; i <= n; i++) a[i] = sc.nextLong();
            Stack<Integer> st = new Stack<>();
            long res = 0;
            int i = 0;
            while(i <= n)
                if(st.isEmpty() || a[i] >= a[st.peek()]) st.push(i++);
                else res = Math.max(res, a[st.pop()] * (i - st.peek() - 1));
            while(st.size() > 1) res = Math.max(res, a[st.pop()] * (i - st.peek() - 1));
            System.out.println(res);
        }
    }
}
