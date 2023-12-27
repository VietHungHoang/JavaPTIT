import java.util.Arrays;
import java.util.Scanner;

class Product implements Comparable<Product>{
    private String id;
    private int quantityIn, quantityOut, price, tax, money;

    public Product(String id, int quantityIn) {
        this.id = id;
        this.quantityIn = quantityIn;
        this.quantityOut = getQuantityOut();
        this.price = getPrice();
        money = this.quantityOut * this.price;
        this.tax = getTax();

    }

    public int getQuantityOut(){
        if(this.id.startsWith("A")) return (int)Math.round(this.quantityIn * 0.6);
        else return (int)Math.round(this.quantityIn * 0.7);
    }

    public int getPrice(){
        if(this.id.endsWith("Y")) return 110000;
        else return 135000;
    }

    public int getTax(){
        if(this.id.startsWith("A") && this.id.endsWith("Y")) return (int)Math.round(0.08 * this.money);
        else if(this.id.startsWith("A") && this.id.endsWith("N")) return (int)Math.round(0.11 * this.money);
        else if(this.id.startsWith("B") && this.id.endsWith("Y")) return (int)Math.round(0.17 * this.money);
        else return (int)Math.round(0.22 * this.money);
    }

    public String getId(){
        return id;
    }

    @Override
    public String toString() {
        return id + " " + quantityIn + " " + quantityOut + " " + price + " " + money + " " + tax;
    }

    @Override
    public int compareTo(Product o) {
        return o.tax - this.tax;
    }


}

public class J05049_LietKeNhapXuatHangTheoNhom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Product[] a = new Product[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            a[i] = new Product(sc.nextLine(), sc.nextInt());
        }
        Arrays.sort(a);
        sc.nextLine();
        String s = sc.nextLine();
        for(Product x : a){
            if(x.getId().startsWith(s)) System.out.println(x);
        }
    }
}
