import java.util.Arrays;
import java.util.Scanner;
// Điểm số phải làm tròn 1 số sau dấu phẩy
class Student implements Comparable<Student> {

    public String id, name;
    public float avg;

    public Student(int id, String name, float[] p) {
        this.id = String.format("HS%02d", id);
        this.name = name;
        this.avg = 0f;
        for (int i = 0; i < 10; i++)
            avg += p[i] * ((i == 0 || i == 1) ? 2 : 1);
        this.avg /= 12f;
        this.avg = Math.round(avg * 10f) / 10f;
    }

    private String getRank() {
        if (avg >= 9) return "XUAT SAC";
        if (avg >= 8) return "GIOI";
        if (avg >= 7) return "KHA";
        if (avg >= 5) return "TB";
        return "YEU";
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.1f", avg) + " " + getRank();
    }

    @Override
    public int compareTo(Student o) {
        if (this.avg > o.avg) return -1;
        if (this.avg < o.avg) return 1;
        return this.id.compareTo(o.id);
    }
}

public class J05018_BangDiemHocSinh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] a = new Student[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            float[] p = new float[10];
            for (int j = 0; j < 10; j++)
                p[j] = sc.nextFloat();
            a[i] = new Student(i + 1, name, p);
        }
        Arrays.sort(a);
        for (Student x : a) System.out.println(x);
    }
}
