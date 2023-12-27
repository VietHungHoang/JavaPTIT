import java.util.Scanner;

public class J03035_DienChuSo {

    public static long solve(String a, String b){
        long res = 0;
        int cnt = 0;
        for(int i = 0; i < a.length(); i++)
            if(a.charAt(i) == '?') cnt++;
        for(int i = 0; i < a.length(); i++){
            if(Character.isDigit(a.charAt(i)) && Character.isDigit(b.charAt(i))){
                if(a.charAt(i) < b.charAt(i)) return res;
                else if(a.charAt(i) > b.charAt(i)){
                     res += (long)(Math.pow(10, cnt));
                     return res;
                }
            }
            else res += (9 - b.charAt(i) + 48) * (long)(Math.pow(10, --cnt));
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) System.out.println(solve(sc.next(), sc.next()));
    }
}
