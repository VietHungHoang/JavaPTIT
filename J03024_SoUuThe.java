import java.util.Scanner;

public class J03024_SoUuThe {

    public static int check(String s){
        int cntEven = 0, cntOdd = 0, n = s.length();
        for(int i = 0; i < n; i++)
            if(Character.isDigit(s.charAt(i))){
                if(s.charAt(i) % 2 == 0) cntEven++;
                else cntOdd++;
            }
            else return -1;
        if((n % 2 == 0 && cntEven > cntOdd) || (n % 2 != 0 && cntEven < cntOdd)) return 1;
        return 0;
    }
    public static void J03024_SoUuThe(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        while(t-- > 0){
            int tmp = check(sc.nextLine());
            if(tmp == -1) System.out.println("INVALID");
            else if (tmp == 0) System.out.println("NO");
            else System.out.println("YES");
        }
    }    
} 