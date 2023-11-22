import java.io.*;
import java.util.*;

/**
 * test
 */
public class test {
   public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        Stack<Integer> st = new Stack<>();
        int res = 0, cnt = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[') st.push(i);
            else if(s.charAt(i) == ')'){
                if(!st.empty()){
                   if(s.charAt(st.peek()) == '(') st.pop();
                   else{
                    res = Math.max(res, cnt);
                    cnt = 0;
                    st.clear();
                    }   
                }
                else{
                    res = Math.max(res, cnt);
                    cnt = 0;
                }
            }
            else if(s.charAt(i) == ']'){
                if(!st.empty()){
                   if(s.charAt(st.peek()) == '['){
                    st.pop();
                    cnt++;
                    res = Math.max(res, cnt);
                   }
                   else{
                    res = Math.max(res, cnt);
                    cnt = 0;
                    }   
                }
                else{
                    res = Math.max(res, cnt);
                    cnt = 0;
                }
            }
        }
        System.out.println(res);
   }
}