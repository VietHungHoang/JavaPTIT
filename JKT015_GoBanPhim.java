import java.util.Scanner;
import java.util.Stack;

public class JKT015_GoBanPhim {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) == '<'){
                if(!st1.empty()){
                    st2.add(st1.peek());
                    st1.pop();
                }
            } else if (s.charAt(i) == '>'){
                if(!st2.empty()){
                    st1.push(st2.peek());
                    st2.pop();
                }
            } else if (s.charAt(i) == '-'){
                if(!st1.empty()) st1.pop();
            } else st1.push(s.charAt(i));
        while(!st1.empty()){
            st2.push(st1.peek());
            st1.pop();
        }
         while(!st2.empty()){
            System.out.print(st2.peek());
            st2.pop();
        }
    }
}
