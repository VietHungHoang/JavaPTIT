package J04006_KhaiBaoLopSinhVien;

import java.util.Scanner;

/**
 *
 * @author VietHungHoang
 */
class Student{
    private String studentCode, name, classroom, birth;
    private float gpa;

    public Student() {
        this.studentCode = "";
        this.name = "";
        this.classroom = "";
        this.birth = "";
        this.gpa = 0;
    }

    public Student(String name, String classroom, String birth, float gpa) {
        this.studentCode = "B20DCCN001";
        this.name = name;
        this.classroom = classroom;
        this.birth = birth;
        this.gpa = gpa;
    }
    
    public void stdBirth(){
        StringBuilder sb = new StringBuilder(this.birth);
        if(sb.charAt(1) == '/') sb.insert(0, '0');
        if(sb.charAt(4) == '/') sb.insert(3, '0');
        this.birth = sb.toString();
    }
    
    public String toString(){
        return this.studentCode + " " + this.name + " " + this.classroom + " " + this.birth + " " + String.format("%.2f", this.gpa);
    }
}
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
        st.stdBirth();
        System.out.println(st);
    }
}
