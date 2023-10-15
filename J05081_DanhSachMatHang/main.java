package J05081_DanhSachMatHang;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Viet Hung Hoang
 */

class Product{
    private static int numberOfProduct = 1;
    private String id, name, unit;
    private int buy, sell, profits;

    public Product() {
    }

    public Product(String name, String unit, int buy, int sell) {
        this.id = "MH" + String.format("%03d", numberOfProduct++);
        this.name = name;
        this.unit = unit;
        this.buy = buy;
        this.sell = sell;
        this.profits = this.sell - this.buy;
    }

    public int getProfits() {
        return profits;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + unit + " " + buy + " " + sell + " " + profits;
    }
    
}
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Product[] arr = new Product[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            arr[i] = new Product(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(arr, new Comparator<Product>(){
            public int compare(Product a, Product b){
                return b.getProfits() - a.getProfits();
            }
        });
        for(int i = 0; i < n; i++) System.out.println(arr[i]);
    }
}
