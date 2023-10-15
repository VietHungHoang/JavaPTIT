package J04013_BaiToanTuyenSinh;

import java.util.Scanner;

/**
 *
 * @author VietHungHoang
 */

class Student{
    private String studentId, name;
    private double m1, m2, m3;

    public Student(String studentId, String name, double m1, double m2, double m3) {
        this.studentId = studentId;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    
    public double priority(){
        if(this.studentId.charAt(2) == '1') return 0.5;
        else if(this.studentId.charAt(2) == '2') return 1.0;
        else return 2.5;
    }
    
    public double totalGrade(){
        return m1 * 2 + m2 + m3;
    }
    
    public String result(){
        if(totalGrade() + priority() >= 24.0) return "TRUNG TUYEN";
        return "TRUOT";
    }
    
    public String stdNumber(double x){
        if((int)(x * 10) % 10 == 0) return String.format("%.0f", x);
        else return String.format("%.1f", x);
    }
    
    public String toString(){
        return studentId + " " + name + " " + stdNumber(priority()) + " " + stdNumber(totalGrade()) + " " + result();
    }
}
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new Student(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
    }
}
