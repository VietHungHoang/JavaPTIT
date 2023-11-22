import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student>{
    private String id, name, className;
    private float mark1, mark2, mark3;

    public Student(String id, String name,String className, float mark1, float mark2, float mark3) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + String.format("%.1f", mark1) + " " + String.format("%.1f", mark2) + " " + String.format("%.1f", mark3);
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}

public class J05030_BangDiemThanhPhan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] a = new Student[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            a[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        }
        Arrays.sort(a);
        for(int i = 0; i < a.length; i++)
            System.out.println((i + 1) + " " + a[i]);
    }
}
