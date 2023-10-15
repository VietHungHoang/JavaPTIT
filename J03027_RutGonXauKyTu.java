import java.util.Scanner;

public class J03027_RutGonXauKyTu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        boolean hasDel = true;
        while(hasDel){
            hasDel = false;
            for(int i = 0; i < sb.length() - 1; i++)
                if(sb.charAt(i) == sb.charAt(i + 1)){
                    sb.delete(i, i + 2);
                    i--;
                    hasDel = true;
                }
        }
        if(sb.length() == 0) System.out.println("Empty String");
        else System.out.println(sb);
    }    
} 