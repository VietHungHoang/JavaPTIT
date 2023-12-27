import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.io.File;
import java.text.SimpleDateFormat;

class Customer implements Comparable<Customer>{
    private String id, name, dob, sex, address;

    public Customer(int id, String name, String sex, String dob, String address) {
        this.id = String.format("KH%03d", id);
        this.name = stdName(name);
        this.sex = sex;
        this.dob = stdDate(dob);
        this.address = address;
    }

    public String stdName(String name){
        String[] arr = name.toLowerCase().trim().split("\\s+");
        String res = "";
        for(String x : arr){
            StringBuilder sb = new StringBuilder(x);
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            res += sb.toString() + " ";
        }
        return res.trim();
    }

    public String stdDate(String date){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            return sdf.format(sdf.parse(date));
        }
        catch(Exception e){
            return date;
        }
    }

    @Override
    public String toString(){
        return id + " " + name + " " + sex + " " + address + " " + dob;
    }

    @Override
    public int compareTo(Customer o) {
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date d1 = sdf.parse(this.dob);
            Date d2 = sdf.parse(o.dob);
            return d1.compareTo(d2);
        }
        catch(Exception e){
            return 0;
        }
    }

    
}

public class J07025_DanhSachKhachHangTrongFile{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        Customer[] arr = new Customer[n];
        for(int i = 0; i < n; i++){
            arr[i] = new Customer(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(arr);
        for(Customer x : arr) System.out.println(x);
    }
}
