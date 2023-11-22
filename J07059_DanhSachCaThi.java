import java.util.Date;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

class Exam implements Comparable<Exam>{
    private String id, date, time, room;
    public Exam(int id, String date, String time, String room){
        this.id = String.format("C%03d", id);
        this.date = date;
        this.time = time;
        this.room = room;
    }
    public String toString(){
        return id + " " + date + " " + time + " " + room;
    }
    public int compareTo(Exam e){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            Date date1 = sdf.parse(this.date + " " + this.time);
            Date date2 = sdf.parse(e.date + " " + e.time);
            if(date1.compareTo(date2) != 0) return date1.compareTo(date2);
            else return this.id.compareTo(e.id);
        }
        catch(Exception ex){
            return 0;
        }
    }
}

public class J07059_DanhSachCaThi {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = sc.nextInt(); sc.nextLine();
        Exam[] e = new Exam[n];
        for(int i = 0; i < n; i++)
            e[i] = new Exam(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine());
        Arrays.sort(e);
        for(Exam i : e)
            System.out.println(i);

    }
}
