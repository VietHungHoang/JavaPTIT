import java.io.File;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Room{
    private String id, name;
    private int price;
    private float fee;

    public Room(String id, String name, int price, float fee) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.fee = fee;
    }

    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public float getFee() {
        return fee;
    }


}

class Customer implements  Comparable<Customer>{
    private String id, name, roomId;
    private float totalPrice;
    private Room room;
    private int dayStay;

    public Customer(int id, String name, String roomId, String dateIn, String dateOut, Room room) {
        this.id = String.format("KH%02d", id);
        this.name = name;
        this.roomId = roomId;
        this.room = room;
        this.dayStay = calDayStay(dateIn, dateOut);
        this.totalPrice = calTotalPrice();
    }

    public int calDayStay(String dateIn, String dateOut){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate din = LocalDate.parse(dateIn, dateTimeFormatter);
        LocalDate dout = LocalDate.parse(dateOut, dateTimeFormatter);
        int d = (int)ChronoUnit.DAYS.between(din, dout);
        if(d == 0) d += 1;
        return d;
    }

    public float calTotalPrice(){
         int d = this.dayStay;
         float tmp = (d * room.getPrice()) * (1 + room.getFee());
         if(d >= 30) return tmp * 0.94f;
         else if(d >=20) return tmp * 0.96f;
         else if(d >= 10) return tmp * 0.98f;
         else return tmp;
    }
    public String getRoomId() {
        return roomId;
    }

    public int compareTo(Customer o){
        return o.dayStay - this.dayStay;
    }

    public String toString(){
        return  id + " " + name + " " + roomId + " " +  dayStay + " " + String.format("%.2f", this.totalPrice);
    }
}

public class J07047_QuanLiKhachSan {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(); sc.nextLine();
        HashMap<String, Room> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            Room h = new Room(sc.next(), sc.next(), Integer.parseInt(sc.next()), Float.parseFloat(sc.next()));
            map.put(h.getId(), h);
        }
        int m = sc.nextInt(); sc.nextLine();
        Customer[] a = new Customer[m];
        for(int i = 0;i < m; i++){
            String name = sc.nextLine();
            String roomId = sc.nextLine();
            String dateIn = sc.nextLine();
            String dateOut = sc.nextLine();
            a[i] = new Customer(i + 1, name, roomId, dateIn, dateOut, map.get(roomId.charAt(2) + ""));
        }
        Arrays.sort(a);
        for(Customer x : a) System.out.println(x);
    }
}
