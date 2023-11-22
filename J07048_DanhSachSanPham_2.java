import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Product implements Comparable<Product>{
    private String id, name, warranty;
     private int price;

    public Product(String id, String name, int price, String warranty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.warranty = warranty;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price + " " + warranty;
    }

    public int compareTo(Product other){
        if (this.price == other.getPrice()) return this.id.compareTo(other.getId());
        else return other.getPrice() - this.price;
    }
    
}

public class J07048_DanhSachSanPham_2{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = sc.nextInt(); sc.nextLine();
        Product[] a = new Product[n];
        for(int i = 0;i < n; i++) a[i] = new Product(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine());
        Arrays.sort(a);
        for(Product x : a) System.out.println(x);

    }
}