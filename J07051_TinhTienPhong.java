import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class Customer implements Comparable<Customer>{
    private String id, name, roomNumber, checkinDate, checkoutDate;
    private int incurred, totalDate, totalPrice;
    public Customer(int id, String name, String roomNumber, String checkinDate, String checkoutDate, int incurred) throws ParseException{
        this.id = String.format("KH%02d", id);
        this.name = stdName(name);
        this.roomNumber = roomNumber;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
        this.incurred = incurred;

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date start = dateFormat.parse(checkinDate);
        Date end = dateFormat.parse(checkoutDate);
        this.totalDate = (int)((end.getTime() - start.getTime()) / 86400000) + 1;

        int price = 0;
        if(roomNumber.charAt(0) == '1') price = 25;
        else if (roomNumber.charAt(0) == '2') price = 34;
        else if (roomNumber.charAt(0) == '3') price = 50;
        else if (roomNumber.charAt(0) == '4') price = 80;
        this.totalPrice = price * totalDate + incurred;
   
    }

    public String stdName(String s){
        String[] a = s.toLowerCase().trim().split("\\s+");
        String res = "";
        for(String x : a){
            StringBuilder sb = new StringBuilder(x);
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            res += sb.toString() + " ";
        }
        return res.trim();
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
    public String getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    public String getCheckinDate() {
        return checkinDate;
    }
    public void setCheckinDate(String checkinDate) {
        this.checkinDate = checkinDate;
    }
    public String getCheckoutDate() {
        return checkoutDate;
    }
    public void setCheckoutDate(String checkoutDate) {
        this.checkoutDate = checkoutDate;
    }
    public int getIncurred() {
        return incurred;
    }
    public void setIncurred(int incurred) {
        this.incurred = incurred;
    }

    @Override
    public String toString() {
            return id + " " + name + " " + roomNumber + " " + totalDate + " " + totalPrice;
    }

    public int compareTo(Customer other){
        return other.totalPrice - this.totalPrice;
    }
}

public class J07051_TinhTienPhong{
    public static void main(String[] args) throws ParseException, FileNotFoundException{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt(); sc.nextLine();
        Customer[] a = new Customer[n];
        for(int i = 0; i < n; i++) a[i] = new Customer(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
        Arrays.sort(a);
        for(Customer x : a) System.out.println(x);
    }
}