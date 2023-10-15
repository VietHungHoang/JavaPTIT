import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n= sc.nextInt(); sc.nextLine();
        Subject[] st = new Subject[n];
        for(int i = 0; i < n; i++) st[i] = new Subject(sc.nextLine(), sc.nextLine(), sc.nextLine());
        Arrays.sort(st);
        for(Subject x : st) System.out.println(x);
    }
}