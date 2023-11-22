import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Product implements Comparable<Product>{
    private String id, name, type;
    private float cost, price, profit;
    public Product(int id, String name, String type, float cost, float price) {
        this.id = String.format("MH%02d", id);
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.price = price;
        this.profit = price - cost;
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
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public float getProfit() {
        return profit;
    }
    public void setProfit(float profit) {
        this.profit = profit;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + type + " " + String.format("%.2f", profit);
    }

    public int compareTo(Product other){
        if (this.profit < other.getProfit()) return 1;
        else if (this.profit > other.getProfit()) return -1;
        else return 0;
    }
    
}
public class J07050_SapXepMatHang {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = sc.nextInt(); sc.nextLine();
        Product[] a = new Product[n];
        for(int i = 0; i < n; i++)
            a[i] = new Product(i + 1, sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
        Arrays.sort(a);
        for(Product x : a) System.out.println(x);
    }    
}
