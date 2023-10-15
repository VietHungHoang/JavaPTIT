import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002_TinhTong {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        long res = 0;
        while(sc.hasNext()){
            try{
                res += Integer.parseInt(sc.next());
            }
            catch(Exception e){ }
        }
        System.out.println(res);
    }
}
