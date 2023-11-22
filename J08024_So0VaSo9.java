import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J08024_So0VaSo9 {
    
    public static ArrayList<Long> a = new ArrayList<>();
    public static void generate(){
        Queue<String> q = new LinkedList<>();
        q.add("9");
        a.add(9l);
        while(a.size() < 10000){
            String tmp = q.peek(); q.remove();
            a.add(Long.valueOf(tmp + "0"));
            a.add(Long.valueOf(tmp + "9"));
            q.add(tmp + "0");
            q.add(tmp + "9");  
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        generate();
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            for(int i = 0; i < 10000; i++)
                   if(a.get(i) % n == 0){
                       System.out.println(a.get(i));
                       break;
                   }  
        }
        
    }
}
