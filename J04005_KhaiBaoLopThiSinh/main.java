
package J04005_KhaiBaoLopThiSinh;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
class Student {
    private String name, birth;
    private float p1, p2, p3;

    public Student(String name, String birth, float p1, float p2, float p3) {
        this.name = name;
        this.birth = birth;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    public float sumMark(){
        return p1 + p2 + p3;
    }
    
    public String toString(){
        return name + " " + birth + " " + String.format("%.1f", sumMark());
    }
};

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st = new Student(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        System.out.println(st);
    }
}
