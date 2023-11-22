import java.util.Scanner;
import java.util.Stack;

public class J08021_DayNgoacDungDaiNhat {

    public static int find(String s) {
    Stack<Integer> stack = new Stack<>();
    int start = -1; 
    int res = 0;
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '('){
            stack.push(i);
            if (start == -1) start = i;
        }
        else {
            if(!stack.isEmpty()) {
                stack.pop();
                if (stack.isEmpty()) res = Math.max(res, i - start + 1);
                else res = Math.max(res, i - stack.peek());
            }
            else start = -1; 
        }
    }
    return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            String s = sc.next(); 
            int result = find(s);
            System.out.println(result);
        }
    }

 
}
