import java.util.ArrayList;
import java.util.Scanner;

public class J02017_ThuGonDaySo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            a.add(x);
        }

        for(int i = 0; i < a.size() - 1; i++)
            if((a.get(i) + a.get(i + 1)) % 2 == 0){
                a.remove(i + 1); a.remove(i);
                if(i == 0) i--;
                else i -= 2;
            }
        System.out.println(a.size()); 
        
    }
}