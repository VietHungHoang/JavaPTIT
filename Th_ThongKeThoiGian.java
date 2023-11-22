import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

// Giống bài J07084 - THỜI GIAN ONLINE LIÊN TỤC

class Student implements Comparable<Student>{
    private String name, startTime, endTime;
    private long duringTime;
    public Student(String name, String startTime, String endTime){
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.duringTime = getTime();
    }

    public long getDuringTime(){
        return duringTime;
    }

    public long getTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime start = LocalDateTime.parse(startTime, dtf);
        LocalDateTime end = LocalDateTime.parse(endTime, dtf);
        Duration d = Duration.between(start, end);
        return d.toMinutes();
    }

    @Override
    public String toString(){
        return name + " " + duringTime;
    }

    public int compareTo(Student o){
        if(this.duringTime == o.duringTime) return this.name.compareTo(o.name);
        return (int)(o.duringTime - this.duringTime);
    }
}

public class Th_ThongKeThoiGian {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n = Integer.parseInt(sc.nextLine());
        Student[] arr = new Student[n];
        for(int i = 0; i < n; i++)
            arr[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine());
        Arrays.sort(arr);
        for(Student i : arr) System.out.println(i);
    }
}
