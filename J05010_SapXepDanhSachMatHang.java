import java.util.Arrays;
import java.util.Scanner;

class Product implements Comparable<Product>{
    private int id;
    private String name, group;
    private float cost, price, profit;

    public Product(int id, String name, String group, float cost, float price) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.cost = cost;
        this.price = price;
        this.profit = price - cost;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + group + " " + String.format("%.2f", profit);
    }

    public int compareTo(Product o){
        if(this.profit > o.profit) return -1;
        else return 1;
    }
}

public class J05010_SapXepDanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Product[] a = new Product[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            a[i] = new Product(i + 1, sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat());
        }
        Arrays.sort(a);
        for(Product x : a) System.out.println(x);
        
    }
}
