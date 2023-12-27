import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student>{
    private String id, name;
    private float totalMark, priorityMark;
    public Student(String id, String name, float math, float physics, float chemistry) {
        this.id = id;

        String[] a = name.toLowerCase().trim().split("\\s+");
        String res = "";
        for(String x : a){
            StringBuilder sb = new StringBuilder(x);
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            res += sb.toString() + " ";
        }
        this.name = res.trim();

        if(id.charAt(2) == '1') this.priorityMark = 0.5f;
        else if(id.charAt(2) == '2') this.priorityMark = 1;
        else this.priorityMark = 2.5f;
        this.totalMark = math * 2 + physics + chemistry + priorityMark;

    }
    public String getId() {
        return id;
    }
    public float getTotalMark() {
        return totalMark;
    }
    @Override
    public String toString() {
        DecimalFormat decimalFormat1 = new DecimalFormat(priorityMark % 1 == 0 ? "0" : "0.0");
        DecimalFormat decimalFormat2 = new DecimalFormat(totalMark % 1 == 0 ? "0" : "0.0");
        return id + " " + name + " " + decimalFormat1.format(priorityMark) + " " + decimalFormat2.format(totalMark);
    }

    public int compareTo(Student other){
        if(this.totalMark == other.getTotalMark()) return this.id.compareTo(other.getId());
        else if (this.totalMark > other.getTotalMark()) return -1;
        else return 1;
    }

}

public class J05059_XacDinhDanhSachTrungTuyen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] a = new Student[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            a[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        }
        Arrays.sort(a);
        float target = a[sc.nextInt() - 1].getTotalMark();
        System.out.println(String.format("%.1f", target));
        for(Student x : a)
            if(x.getTotalMark() < target) System.out.println(x + " TRUOT");
            else System.out.println(x + " TRUNG TUYEN");
    }
}