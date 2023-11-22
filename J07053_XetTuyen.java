import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Candidate{
    private String id, name, target;
    private long mark;
    private int age;
    public Candidate(int id, String name, String dob, float mark1, float mark2) {
        this.id = String.format("PH%02d", id);
        
        String[] arr = name.trim().toLowerCase().split("\\s+");
        String tmp = "";
        for(String x : arr){
            StringBuilder sb = new StringBuilder(x);
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            tmp += sb.toString() + " ";
        } 
        this.name = tmp.trim();
        
        String[] a = dob.split("/");
        this.age = 2021 - Integer.parseInt(a[2]);
        if(mark1 >= 8 && mark2 >= 8) this.mark = Math.round((mark1 + mark2) / 2 + 1);
        else if (mark1 >= 7.5 && mark2 >= 7.5) this.mark = Math.round((mark1 + mark2) / 2 + 0.5);
        else this.mark = Math.round((mark1 + mark2) / 2);
        if(this.mark > 10) this.mark = 10;

        if (this.mark >= 9) this.target = "Xuat sac";
        else if(this.mark >= 8) this.target = "Gioi";
        else if(this.mark >= 7) this.target = "Kha";
        else if(this.mark >= 5) this.target = "Trung binh";
        else this.target = "Truot";
    }

    public String toString(){
        return id + " " + name + " " + age + " " + mark + " " + target;
    }

}

public class J07053_XetTuyen {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = sc.nextInt(); sc.nextLine();
        for(int i = 0;i < n; i++)
            System.out.println(new Candidate(i + 1, sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine())));
    }

}
