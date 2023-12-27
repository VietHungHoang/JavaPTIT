import java.util.Scanner;

public class J03017_LoaiBo100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            while(s.contains("100")){
                for(int i = 0; i < s.length() - 3; i++)
                    if(s.charAt(i) == '1' && s.charAt(i + 1) == '0' && s.charAt(i + 2) == '0'){
                        s = s.substring(0, i) + s.substring(i + 3);
                        break;
                    }
            }
        }   
    }
}
