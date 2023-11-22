import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

class Gamer implements Comparable<Gamer>{
    private String id, name;
    private int totalTime;

    public Gamer(String id, String name, String timeIn, String timeOut) {
        this.id = id;
        this.name = name;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime d1 = LocalTime.parse(timeIn, dtf);
        LocalTime d2 = LocalTime.parse(timeOut, dtf);
        Duration duration = Duration.between(d1, d2);
        this.totalTime = (int)duration.toMinutes();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + (totalTime / 60) + " gio " + (totalTime % 60) + " phut";
    }

    public int compareTo(Gamer o){
        return o.totalTime - this.totalTime;
    }
}

public class J05011_TinhGio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Gamer[] a = new Gamer[n];
        for(int i = 0; i < n; i++)
            a[i] = new Gamer(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        Arrays.sort(a);
        for(Gamer x : a) System.out.println(x);
    }
}
