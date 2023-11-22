import java.util.Scanner;

class Product{
    private String id, name, unit;
    private int price, cost, freightCost, quantity;

    public Product(int id, String name, String unit, int price, int quantity){
        this.id = "MH" + String.format("%02d", id);
        this.name = name;
        this.unit = unit;
        this.quantity = quantity;
        this.freightCost = (int)Math.round(price * quantity * 0.05);   
        this.cost = price * quantity + freightCost;
        this.price = (int)Math.round(cost*1.02);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + unit + " " + freightCost + " " + cost + " " + price;
    }
}
public class J05036_TinhGiaBan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println(new Product(i + 1, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
    }    
}