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

    public String getId(){
        return id;
    }

    public String getClassName(){
        return className;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + email;
    }
}

public class J05024_LietKeSinhVienTheoNganh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Student[] a = new Student[n];
        for(int i = 0; i < n; i++)
            a[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        int q = sc.nextInt(); sc.nextLine();
        while(q-- > 0){
            String s = sc.nextLine();
            String tmp = "";
            if(s.equals("Ke toan")) tmp = "DCKT";
            if(s.equals("Cong nghe thong tin")) tmp = "DCCN";
            if(s.equals("An toan thong tin")) tmp = "DCAT";
            if(s.equals("Vien thong")) tmp = "DCVT";
            if(s.equals("Dien tu")) tmp = "DCDT";
            System.out.println("DANH SACH SINH VIEN NGANH " + s.toUpperCase() + ":");
            for(Student x : a){
                if(tmp.equals("DCCN") || tmp.equals("DCAT")){
                    if(x.getId().contains(tmp) && !x.getClassName().startsWith("E")) System.out.println(x);
                }
                else if(x.getId().contains(tmp)) System.out.println(x);
            }
        }
    }
}
