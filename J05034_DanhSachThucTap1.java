import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student>{
    private int no;
    private String id, name, className, email, company;

    public Student(int no, String id, String name, String className, String email, String company) {
        this.no = no;
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return no + " " + id + " " + name + " " + className + " " + email + " " + company;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}

public class J05034_DanhSachThucTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Student[] a = new Student[n];
        for(int i = 0; i < n; i++)
            a[i] = new Student(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        Arrays.sort(a);
        int q = sc.nextInt(); sc.nextLine();
        while(q-- > 0){
            String s = sc.nextLine();
            for(Student x : a)
                if(x.getCompany().equals(s))
                    System.out.println(x);
        }
    }
}
