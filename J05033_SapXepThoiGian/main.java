package J05033_SapXepThoiGian;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author VietHungHoang
 */

class Time{
    private int hour, minute, second;

    public Time() {
        
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return hour + " " + minute + " " + second;
    }
    
}
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Time[] arr = new Time[n];
        for(int i = 0; i < n; i++) arr[i] = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
        Arrays.sort(arr, new Comparator<Time>(){
            public int compare(Time t1, Time t2){
                int a = t1.getHour() * 3600 + t1.getMinute() * 60 + t1.getSecond();
                int b = t2.getHour() * 3600 + t2.getMinute() * 60 + t2.getSecond();
                return a - b;
            }
        });
        for(int i = 0; i < n; i++) System.out.println(arr[i]);
    }
}
