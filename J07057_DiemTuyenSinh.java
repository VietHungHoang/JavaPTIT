import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student>{
    private String id, name, nation, area, target;
    private float mark;
    public Student(int id, String name,float mark, String nation, String area) {
        this.id = String.format("TS%02d", id);
        
        String[] arr = name.toLowerCase().trim().split("\\s+");
        String tmp = "";
        for(String x : arr){
            StringBuilder sb = new StringBuilder(x);
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            tmp += sb.toString() + " ";
        }
        this.name = tmp.trim();
        this.nation = nation;
        this.area = area;
        this.mark = mark;
        if(!this.nation.equals("Kinh")) this.mark += 1.5;
        if(this.area.equals("1")) this.mark += 1.5;
        else if(this.area.equals("2")) this.mark += 1;
        if(this.mark >= 20.5) this.target = "Do";
        else this.target = "Truot";
    }

    public int compareTo(Student other){
        if(this.mark == other.mark) return this.id.compareTo(other.id);
        else if(this.mark > other.mark) return -1;
        else return 1;
    }

    public String toString(){
        return id + " " + name + " " + mark + " " + target;
    }
}

public class J07057_DiemTuyenSinh {
    public static void main(String[] args) throws FileNotFoundException{
        // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = sc.nextInt(); sc.nextLine();
        Student[] a = new Student[n];
        for(int i = 0; i < n; i++)
            a[i] = new Student(i + 1, sc.nextLine(), Float.parseFloat(sc.nextLine()), sc.nextLine(), sc.nextLine());
        Arrays.sort(a);
        for(Student x : a) System.out.println(x);

    }
}
