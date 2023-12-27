import java.text.DecimalFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

class RainTable{
    private String id, name;
    private int time, rainfall;

    public RainTable(int id, String name, String start, String end, int rain) {
        this.id = String.format("T%02d", id);
        this.name = name;
        this.time = calTime(start, end);
        this.rainfall = rain;
    }

    public int calTime(String start, String end){
        try{
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime s = LocalTime.parse(start, dtf);
            LocalTime e = LocalTime.parse(end, dtf);
            return (int)(Duration.between(s, e).getSeconds());
        }
        catch (Exception e){
            return 0;
        }
    }

    public void addTime(String start, String end){
        this.time += calTime(start, end);
    }

    public void addRainfall(int rainfall){
        this.rainfall += rainfall;
    }

    public String toString(){
        return id + " " + name + " " + String.format("%.2f",((float)(rainfall * 3600) / time));
    }
}

public class J05019_LuongMuaTrungBinh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        int idx = 1;
        LinkedHashMap<String, RainTable> rainTables = new LinkedHashMap<>();
        for(int i = 0; i < n; i++){
            String name = sc.nextLine();
            String start = sc.nextLine();
            String end = sc.nextLine();
            int rainfall = Integer.parseInt(sc.nextLine());
            if(rainTables.containsKey(name)){
                rainTables.get(name).addTime(start, end);
                rainTables.get(name).addRainfall(rainfall);
            }
            else rainTables.put(name, new RainTable(idx++, name, start, end, rainfall));
        }
        for(Map.Entry<String, RainTable> entry : rainTables.entrySet())
            System.out.println(entry.getValue());

    }
}