import java.util.Scanner;

public class J02037_DayUuThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        while(t-- > 0){
            int cntOdd = 0, cntEven = 0;
            String[] arr = sc.nextLine().split("\\s+");
            for(String x : arr)
                if(Integer.parseInt(x) % 2 == 0) cntEven++;
                else cntOdd++;
            int n = cntEven + cntOdd;
            if((n % 2 == 0 && cntEven > cntOdd) || (n% 2 == 1 && cntOdd > cntEven))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
