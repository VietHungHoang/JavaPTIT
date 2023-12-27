import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Customer implements Comparable<Customer>{
    private String id, sex, name, dob, address;

    public Customer(int id, String name, String sex, String dob, String address) {
        this.id = String.format("KH%03d", id);
        this.sex = sex;
        this.name = stdName(name);
        this.dob = stdDob(dob);
        this.address = address;
    }
    public String stdName(String name){
        String[] tmp = name.trim().toLowerCase().split("\\s+");
        String res = "";
        for(String x : tmp){
            StringBuilder sb = new StringBuilder(x);
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            res += sb.toString() + " ";
        }
        return res.trim();
    }

    public String stdDob(String dob){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            return sdf.format(sdf.parse(dob));
        }
        catch (Exception e){
        }
        return "";
    }

    public String toString(){
        return id + " " + name + " " + sex + " " + address + " " + dob;
    }

    public int compareTo(Customer o){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(this.dob, dtf).compareTo(LocalDate.parse(o.dob, dtf));
    }
}
public class J05082_DanhSachKhachHang{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Customer[] customers = new Customer[n];
        for(int i = 0; i < n; i++)
            customers[i] = new Customer(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        Arrays.sort(customers);
        for(Customer x : customers) System.out.println(x);

    }
}