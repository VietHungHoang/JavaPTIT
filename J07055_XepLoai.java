import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student>{
    private String id, name, target;
    private double avg;
    public Student(int id, String name, double mark1, double mark2, double mark3) {
        this.id = String.format("SV%02d", id);

        String tmp = "";
        String[] arr = name.trim().toLowerCase().split("\\s+");
        for(String x : arr){
            StringBuilder sb = new StringBuilder(x);
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            tmp += sb.toString() + " ";
        }
        this.name = tmp.trim();
        this.avg = mark1 * 0.25 + mark2 * 0.35 + mark3 * 0.4;
        
        if(this.avg >= 8) this.target = "GIOI";
        else if (this.avg >= 6.5) this.target = "KHA";
        else if (this.avg >= 5) this.target = "TRUNG BINH";
        else this.target = "KEM";
    }

    
    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double getAvg() {
        return avg;
    }


    public void setAvg(double avg) {
        this.avg = avg;
    }

    public int compareTo(Student other){
        if(this.avg == other.avg) return 0;
        else if(this.avg > other.avg) return -1;
        else return 1;
    }

    public String toString(){
        return id + " " + name + " " + String.format("%.2f", this.avg) + " " + target;
    }
}

public class J07055_XepLoai {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = sc.nextInt();
        Student[] arr = new Student[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            arr[i] = new Student(i + 1, sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(arr);
        for(Student x : arr) System.out.println(x);
    }
}