import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Student implements Comparable<Student>{
    private String id, name;
    private float mark;
    private int rank;

    public Student(int id, String name, float mark) {
        this.id = String.format("HS%02d", id)   ;
        this.name = name.trim();
        this.mark = mark;
    }

    public String getPerfomance(){
        if(mark >= 9) return "Gioi";
        else if (mark >= 7) return "Kha";
        else if (mark >= 5) return "Trung Binh";
        else return "Yeu";
    }

    public String getId(){
        return id;
    }

    public void setRank(int rank){
        this.rank = rank;
    }

    public int getRank(){
        return rank;
    }

    public float getMark(){
        return mark;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.1f", mark) + " " + getPerfomance() + " " + rank;
    }

    @Override
    public int compareTo(Student o) {
        if(this.mark >= o.mark) return -1;
        else return 1;
    }
}

public class J05054_XepHangHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] a = new Student[n];
        LinkedHashMap<String, Student> students = new LinkedHashMap<>();
        for(int i = 0; i < n; i++){
            sc.nextLine();
            a[i] = new Student(i + 1, sc.nextLine(), sc.nextFloat());
            students.put(a[i].getId(), a[i]);
        }
        Arrays.sort(a);
        a[0].setRank(1);
        students.get(a[0].getId()).setRank(1);
        for(int i = 1; i < n; i++) {
            if (a[i].getMark() == a[i - 1].getMark()) a[i].setRank(a[i - 1].getRank());
            else a[i].setRank(i + 1);
            students.get(a[i].getId()).setRank(a[i].getRank());
        }
        for(Map.Entry<String, Student> entry : students.entrySet())
            System.out.println(entry.getValue());
    }
}