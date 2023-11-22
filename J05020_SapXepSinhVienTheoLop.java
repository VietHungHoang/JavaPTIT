import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student>{
    private String id, name, className, email;

    public Student(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + email;
    }

    public int compareTo(Student o){
        if(this.className.compareTo(o.className) == 0) return this.id.compareTo(o.id);
        else return this.className.compareTo(o.className);
    }
    
}

public class J05020_SapXepSinhVienTheoLop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Student[] a = new Student[n];
        for(int i = 0; i < n; i++)
            a[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        Arrays.sort(a);
        for(Student x : a) System.out.println(x);
    }
}
