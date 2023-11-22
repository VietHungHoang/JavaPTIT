import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;

class City{
    private String id, name;
    private int price;

    public City(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId(){
        return id;
    }

    public int getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

}

class PhoneCall{
    private String phoneNumber, city;
    private int totalTime, price;

    public PhoneCall(String inp){
        String[] tmp = inp.split("\\s+");
        this.phoneNumber = tmp[0];
        this.totalTime = calTime(tmp[1], tmp[2]);
        this.price = 0;
        this.city = "";
    }

    public int calTime(String in, String out){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime inTime = LocalTime.parse(in, dtf);
        LocalTime outTime = LocalTime.parse(out, dtf);
        Duration d = Duration.between(inTime, outTime);
        int x = (int) d.toMinutes();
        if(!phoneNumber.startsWith("0"))
            x = (int) Math.ceil((double) x / 3);
        return x;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public String getCityId(){
        return phoneNumber.substring(1, 3);
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    @Override
    public String toString(){
        return phoneNumber + " " + city + " " + totalTime + " " + (totalTime * price);
    }
}


public class J05071_TinhCuocDienThoaiCoDinh1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, City> map = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            City c = new City(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            map.put(c.getId(), c);
        }
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < m; i++){
            PhoneCall p = new PhoneCall(sc.nextLine());
            if(p.getPhoneNumber().startsWith("0")){
                p.setCity(map.get(p.getCityId()).getName());
                p.setPrice(map.get(p.getCityId()).getPrice());
            }
            else{
                p.setCity("Noi mang");
                p.setPrice(800);
            }
            System.out.println(p);
        }
    }
}
