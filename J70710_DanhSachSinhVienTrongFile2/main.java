package J70710_DanhSachSinhVienTrongFile2;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class Student{
    public static int numberOfStudent = 1;
    private String id, name, birth, classroom, gpa;

    public Student(String name, String classroom, String birth, String gpa) throws ParseException{
        this.id = "B20DCCN" + String.format("%03d", numberOfStudent++);
        this.name = name;
        this.classroom = classroom;
        this.gpa = String.format("%.2f", Float.parseFloat(gpa));

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.birth = sdf.format(sdf.parse(birth));
    }

    public String toString(){
        return id + " " + name + " " + classroom + " " + birth + " " + gpa;
    }

}

public class main {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner(new File("SV.in"));
        int t = sc.nextInt(); sc.nextLine();
        while(t-- > 0){
            Student st = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            System.out.println(st);
        }
    }
}
