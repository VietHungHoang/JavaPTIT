import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Product{
    private String id, name;
    private int price, warranty;

    public Product(String id, String name, int price, int warranty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.warranty = warranty;
    }

    public String getId() {
        return id;
    }

    public int getWarranty() {
        return warranty;
    }

    public int getPrice() {
        return price;
    }
}

class Customer implements  Comparable<Customer>{
    private String id, name, address, warrantyExpiry;
    private int quantity;
    private Product p;

    public Customer(int id, String name, String address, Product p, int quantity, String buyDate) {
        this.id = String.format("KH%02d", id);
        this.name = name;
        this.address = address;
        this.quantity = quantity;
        this.p = p;
        this.warrantyExpiry = solveWarrantyExpiry(buyDate);
    }

    public String solveWarrantyExpiry(String buyDate){
        int month = this.p.getWarranty();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(buyDate, dateTimeFormatter);
        return localDate.plusMonths(month).format(dateTimeFormatter);
    }

    public int compareTo(Customer o){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate1 = LocalDate.parse(this.warrantyExpiry, dateTimeFormatter);
        LocalDate localDate2 = LocalDate.parse(o.warrantyExpiry, dateTimeFormatter);
        if(localDate1.equals(localDate2)) return this.id.compareTo(o.id);
        else return localDate1.compareTo(localDate2);
    }

    public String toString(){
        return id + " " + name + " " + address + " " + p.getId() + " " + (p.getPrice() * quantity) + " " + warrantyExpiry;
    }


}

public class J07049_TinhNgayHetHanBaoHanh {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int n = sc.nextInt(); sc.nextLine();
        HashMap<String, Product> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            Product p = new Product(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            map.put(p.getId(), p);
        }
        int m = sc.nextInt(); sc.nextLine();
        Customer[] a = new Customer[m];
        for(int i = 0;i < m; i++)
            a[i] = new Customer(i + 1, sc.nextLine(), sc.nextLine(), map.get(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine());
        Arrays.sort(a);
        for(Customer x : a) System.out.println(x);
    }
}
