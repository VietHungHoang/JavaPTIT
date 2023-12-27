import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

class Athlete implements Comparable<Athlete>{
    private String id, name, totalTime, lastTime, priorityTime;
    private int age, time, rank;

    public Athlete(int id, String name, String dob, String startTime, String endTime) {
        this.id = String.format("VDV%02d", id);
        this.name = name;
        this.age = 2021 - Integer.parseInt(dob.substring(6));
        solveTime(startTime, endTime);
    }

    public String getId() {
        return id;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public int getTime() {
        return time;
    }

    public void solveTime(String startTime, String endTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime start = LocalTime.parse(startTime, formatter);
        LocalTime end = LocalTime.parse(endTime, formatter);
        this.time = (int)Duration.between(start, end).getSeconds();
        LocalTime totalTime = convertSecondsToLocalTime(this.time);
        this.totalTime = formatter.format(totalTime);
        this.time -= getPriority();

        LocalTime lastTime = convertSecondsToLocalTime(this.time);
        this.lastTime = formatter.format(lastTime);

        this.priorityTime = formatter.format(LocalTime.of(0, 0, getPriority()));

    }

    public LocalTime convertSecondsToLocalTime(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        return LocalTime.of(hours, minutes, remainingSeconds);
    }

    public int getPriority(){
        if(this.age >= 32) return 3;
        else if(this.age >= 25) return 2;
        else if(this.age >= 18) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + totalTime + " " + priorityTime + " " + lastTime + " " + rank;
    }

    @Override
    public int compareTo(Athlete o) {
        return this.time - o.time;
    }
}


public class J05055_XepHangVanDongVien1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Athlete[] a = new Athlete[n];
        Athlete[] b = new Athlete[n];
        for(int i = 0; i < n; i++){
            a[i] = new Athlete(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            b[i] = a[i];
        }
        Arrays.sort(b);
        
        b[0].setRank(1);
        for(int i = 1; i < n; i++)
            if(b[i].getTime() == b[i - 1].getTime()) b[i].setRank(b[i - 1].getRank());
            else b[i].setRank(i + 1);
        for(int i = 0; i < n; i++){
            int idx = Integer.parseInt(b[i].getId().substring(3)) - 1;
            a[idx].setRank(b[i].getRank());
        }
        for (Athlete athlete : a) System.out.println(athlete);
    }    
}