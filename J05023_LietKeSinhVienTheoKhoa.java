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

public class J05023_LietKeSinhVienTheoKhoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Student[] a = new Student[n];
        for(int i = 0; i < n; i++)
            a[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        int q = sc.nextInt(); sc.nextLine();
        while(q-- > 0){
            String s = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA " + s + ":");
            for(Student x : a){
                String tmp = x.getClassName().substring(1, 3);
                if(tmp.equals(s.substring(2))) System.out.println(x);
            }
        }
    }
}
