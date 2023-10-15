package J05003_DanhSachDoiTuongSinhVien1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        int n = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String classs = sc.nextLine();
            String dateOfBirth = sdf.format(sdf.parse(sc.nextLine()));
            float gpa = Float.parseFloat(sc.nextLine());
            Student st = new Student(i + 1, name, classs, dateOfBirth, gpa);
            System.out.println(st);
        }
    }
}
