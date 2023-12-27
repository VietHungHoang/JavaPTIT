import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Student implements Comparable<Student>{
    private String name, result;
    private float gpa;
    private int id, rl;

    public Student(int id, String name, float gpa, int rl) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.rl = rl;
        this.result = "KHONG";
    }

    public int getId() {
        return id;
    }

    public void setResult(){
        if(gpa >= 3.6 && rl >= 90) result = "XUATSAC";
        else if (gpa >= 3.2 && rl >= 80) result = "GIOI";
        else if (gpa >= 2.5 && rl >= 70) result = "KHA";
    }

    public float getGpa() {
        return gpa;
    }

    public String toString(){
        return name + ": " + result;
    }

    public int compareTo(Student o){
        Float a = this.gpa;
        Float b = o.gpa;
        return b.compareTo(a);
    }
}

public class J05062_HocBongSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        Student[] a = new Student[n];
        LinkedHashMap<Integer, Student> students = new LinkedHashMap<>();
        for(int i = 0; i < n; i++){
            sc.nextLine();
            a[i] = new Student(i, sc.nextLine(), sc.nextFloat(), sc.nextInt());
            students.put(i, a[i]);
        }
        Arrays.sort(a);
        float mark = -1f;
        for(Student x : a)
            if(m > 0){
                students.get(x.getId()).setResult();
                m--;
                if(m == 0) mark = x.getGpa();
            }
        for(Map.Entry<Integer, Student> entry : students.entrySet()){
            if(mark != -1 && entry.getValue().getGpa() == mark)
                entry.getValue().setResult();
            System.out.println(entry.getValue());
        }
    }
}