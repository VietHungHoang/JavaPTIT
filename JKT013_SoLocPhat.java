import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JKT013_SoLocPhat {
    
    public static ArrayList<String> a = new ArrayList<>();
    public static void generate(){
        Queue<String> q = new LinkedList<>();
        q.add("6");
        q.add("8");
        a.add("6");
        a.add("8");
        while(q.peek().length() < 15){
            String tmp = q.peek(); q.remove();
            a.add(tmp + "6");
            a.add(tmp + "8");
            q.add(tmp + "6");
            q.add(tmp + "8");  
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        generate();
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = a.size() - 1; i >= 0; i--){
                if(a.get(i).length() <= n){
                    if(!check){
                        System.out.println(i + 1);
                        check = true;
                    }
                    System.out.print(a.get(i) + " ");
                }
            }  
            System.out.println();
        }
        
    }
    }