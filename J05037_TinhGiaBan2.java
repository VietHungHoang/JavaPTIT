import java.util.Arrays;
import java.util.Scanner;
// price phải làm tròn lên đến hàng trăm
class Product implements Comparable<Product>{
    private String id, name, unit;
    private int price, cost, freightCost, quantity;

    public Product(int id, String name, String unit, int price, int quantity){
        this.id = "MH" + String.format("%02d", id);
        this.name = name;
        this.unit = unit;
        this.quantity = quantity;
        this.freightCost = (int)Math.round(price * quantity * 0.05);   
        this.cost = price * quantity + freightCost;
        this.price = (int)Math.ceil(cost*1.02/(quantity * 100)) * 100;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + unit + " " + freightCost + " " + cost + " " + price;
    }

    @Override
    public int compareTo(Product o) {
        return o.price - this.price;
    }
}
public class J05037_TinhGiaBan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Product[] a = new Product[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            a[i] = new Product(i + 1, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(a);
        for(Product x : a) System.out.println(x);
    }    
}