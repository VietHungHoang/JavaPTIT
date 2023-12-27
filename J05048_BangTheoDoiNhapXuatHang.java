import java.util.Scanner;

class Product{
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

    @Override
    public String toString() {
        return id + " " + quantityIn + " " + quantityOut + " " + price + " " + money + " " + tax;
    }


}

public class J05048_BangTheoDoiNhapXuatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println(new Product(sc.nextLine(), sc.nextInt()));
        }
    }
}
