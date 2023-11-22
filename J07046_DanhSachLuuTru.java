import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class Customer implements Comparable<Customer>{
    private String id, name, roomId, dateIn, dateOut;
    private int numOfStay;

    public Customer(int id, String name, String roomId, String dateIn, String dateOut) throws ParseException{
        this.id = String.format("KH%02d", id);
        this.name = name;
        this.roomId = roomId;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        Date start = dateFormat.parse(dateIn);
        Date end = dateFormat.parse(dateOut);
        long distance = end.getTime() - start.getTime();
        this.numOfStay = (int)(distance / 86400000);

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

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public String getDateOut() {
        return dateOut;
    }

    public void setDateOut(String dateOut) {
        this.dateOut = dateOut;
    }

    public int getNumOfStay() {
        return numOfStay;
    }

    public void setNumOfStay(int numOfStay) {
        this.numOfStay = numOfStay;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + roomId + " " + numOfStay;
    }
    
    public int compareTo(Customer other){
        return - (this.numOfStay - other.getNumOfStay());
    }

}

public class J07046_DanhSachLuuTru {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = sc.nextInt(); sc.nextLine();
        Customer[] a = new Customer[n];
        for(int i = 0; i < n; i++)
            a[i] = new Customer(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        Arrays.sort(a);
        for(Customer x : a) System.out.println(x);
    }
}
