package J07033_DanhSachSinhVienTrongFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt(); sc.nextLine();
        Student[] st = new Student[n];
        for(int i = 0; i < n; i++) st[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        Arrays.sort(st);
        for(Student x : st) System.out.println(x);
    }
}
