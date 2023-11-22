import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student>{
    private String id, name;
    private float avg;
    private int rank;
    public Student(int id, String name, float mark1, float mark2, float mark3) {
        this.id = String.format("SV%02d", id);

        String tmp = "";
        String[] arr = name.trim().toLowerCase().split("\\s+");
        for(String x : arr){
            StringBuilder sb = new StringBuilder(x);
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            tmp += sb.toString() + " ";
        }
        this.name = tmp.trim();
        this.avg = (mark1 * 3 + mark2 * 3 + mark3 * 2) / 8;
        this.avg = Float.parseFloat(String.format("%.2f", this.avg));
        this.rank = id;
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


    public float getAvg() {
        return avg;
    }


    public void setAvg(float avg) {
        this.avg = avg;
    }


    public int getRank() {
        return rank;
    }


    public void setRank(int rank) {
        this.rank = rank;
    }


    public int compareTo(Student other){
        if(this.avg == other.avg) return this.id.compareTo(other.id);
        else if(this.avg > other.avg) return -1;
        else return 1;
    }

    public String toString(){
        return id + " " + name + " " + String.format("%.2f", this.avg) + " " + rank;
    }
}

public class J07054_TinhDiemTrungBinh {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = sc.nextInt();
        Student[] arr = new Student[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            arr[i] = new Student(i + 1, sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        }
        Arrays.sort(arr);
        for(int i = 0; i < n; i++)
            arr[i].setRank(i + 1);
        for(int i = 0; i < n - 1; i++)
            if(arr[i].getAvg() == arr[i + 1].getAvg()) arr[i + 1].setRank(arr[i].getRank());
        
        for(Student x : arr) System.out.println(x);
    }
}