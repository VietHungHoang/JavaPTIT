import java.util.Scanner;
import java.util.Stack;

public class J03019_XauConLonNhat {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(!st.empty()){
                while(!st.empty() && s.charAt(st.peek()) < s.charAt(i))
                    st.pop();
                st.push(i);
            }
            else st.push(i);
        }
        String res = "";
        while(!st.empty()){
            res = s.charAt(st.peek()) + res;
            st.pop();
        }
        System.out.println(res);
    }
}