import java.util.Scanner;
import java.util.Stack;

public class J08021_DayNgoacDungDaiNhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            Stack<Integer> st = new Stack<>();
            st.push(-1);
            int res = 0;
            for(int i = 0; i < s.length(); i++)
                if(s.charAt(i) == '(') st.push(i);
                else {
                    st.pop();
                    if (st.empty()) st.push(i);
                    else res = Math.max(res, i - st.peek());
                    }
            System.out.println(res);
        }

    }
}