import java.util.Scanner;
import java.util.Stack;

public class J08020_KiemTraDayNgoacDung {

    public static String check(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') st.push(s.charAt(i));
            else if(!st.empty()){
                if (s.charAt(i) == ')' && st.peek() == '(') st.pop();
                else if (s.charAt(i) == ']' && st.peek() == '[') st.pop();
                else if (s.charAt(i) == '}' && st.peek() == '{') st.pop();
                else return "NO";
            }
        }
        return st.empty() ? "YES" : "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println(check(sc.next()));
        }
    }
}
