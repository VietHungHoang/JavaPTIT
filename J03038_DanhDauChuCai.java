import java.util.HashSet;
import java.util.Scanner;

public class J03038_DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet st = new HashSet<>();
        for(int i = 0;i < s.length(); i++)
            st.add(s.charAt(i));
        System.out.println(st.size());
    }
}
