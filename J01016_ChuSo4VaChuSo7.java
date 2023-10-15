import java.util.Scanner;

public class J01016_ChuSo4VaChuSo7 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        int cnt4 = 0, cnt7 = 0;
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) == '4') cnt4++;
            else if(s.charAt(i) == '7') cnt7++;
        if(cnt4 + cnt7 == 4 || cnt4 + cnt7 == 7) System.out.println("YES");
        else System.out.println("NO");

    }
}
