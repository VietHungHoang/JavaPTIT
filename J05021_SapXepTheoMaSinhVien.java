import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        return this.id.compareTo(o.id);
    }
    
}

public class J05021_SapXepTheoMaSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> a = new ArrayList<>();
        while(sc.hasNext())
            a.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        Collections.sort(a);
        for(Student x : a) System.out.println(x);
    }
}
