import java.io.File;
import java.util.Scanner;

public class J07078_TimViTriXauCon {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("STRING.in"));
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            String w = sc.next();
            for(int i = 0; i < s.length() - w.length() + 1; i++)
                if(s.substring(i, i + w.length()).equals(w))
                    System.out.print((i + 1) + " ");
            System.out.println();
            
        }
    }    
}