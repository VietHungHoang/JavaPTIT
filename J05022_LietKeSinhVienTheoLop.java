import java.util.Arrays;
import java.util.Scanner;

class Student{
    private String id, name, className, email;

    public Student(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }

    public String getClassName(){
        return className;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + email;
    }
}

public class J05022_LietKeSinhVienTheoLop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Student[] a = new Student[n];
        for(int i = 0; i < n; i++)
            a[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        int q = sc.nextInt(); sc.nextLine();
        while(q-- > 0){
            String s = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + s + ":");
            for(Student x : a)
                if(x.getClassName().equals(s)) System.out.println(x);
        }
    }
}
