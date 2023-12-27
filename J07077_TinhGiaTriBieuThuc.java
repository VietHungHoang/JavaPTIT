import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class J07077_TinhGiaTriBieuThuc {
    public static int priority(char c){
        if(c == '(' || c == ')') return 0;
        if(c == '+' || c == '-') return 1;
        else return 2;
    }

    public static Long cal(Long a, Long b, char opr){
        if(opr == '+') return a + b;
        else if(opr == '-') return a - b;
        else if(opr == '*') return a * b;
        else return (Long)(a / b);
    }

    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("BIEUTHUC.in"));
        int t = sc.nextInt(); sc.nextLine();
        while(t-- > 0){
            Stack<Long> st1 = new Stack<>();
            Stack<Character> st2 = new Stack();
            String s = sc.nextLine();
            for(int i = 0; i < s.length(); i++){
                if(Character.isDigit(s.charAt(i))){
                    String tmp = "";
                    while(i < s.length() && Character.isDigit(s.charAt(i)))
                        tmp += s.charAt(i++) + "";
                    i--;
                    st1.push(Long.parseLong(tmp));
                }
                else{
                    char c = s.charAt(i);
                    if(c == '(') st2.push(c);
                    else if(c == ')'){
                        while(st2.peek() != '(') {
                            Long a = st1.pop();
                            Long b = st1.pop();
                            st1.push(cal(b, a, st2.pop()));
                        }
                        st2.pop();
                    }
                    else {
                        while(!st2.empty() && priority(st2.peek()) >= priority(c)){
                            Long a = st1.pop();
                            Long b = st1.pop();
                            st1.push(cal(b, a, st2.pop()));
                        }
                        st2.push(c);
                    }
                }
            }
            while(!st2.empty()){
                Long a = st1.pop();
                Long b = st1.pop();
                st1.push(cal(b, a, st2.pop()));
            }
            System.out.println(st1.peek());
        }
    }
}