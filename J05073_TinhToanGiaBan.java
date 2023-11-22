import java.util.Scanner;

class Product{
    private String id, price;
    private int cost, quantity;

    public Product(String id, int cost, int quantity) {
        this.id = id;
        this.cost = cost;
        this.quantity = quantity;
        this.price = calPrice();

    }

    public String calPrice(){
        char type = this.id.charAt(0);
        double tax, tranfer;
        if(type == 'T'){
            tax = 0.29;
            tranfer = 0.04;
        }
        else if(type == 'C'){
            tax = 0.1;
            tranfer = 0.03;
        }
        else if(type == 'D'){
            tax = 0.08;
            tranfer = 0.025;
        }
        else{
            tax = 0.02;
            tranfer = 0.005;
        }
        if(this.id.endsWith("C")) tax *= 0.95;
        double res = this.cost * (1 + tax + tranfer) * 1.2;
        return String.format("%.2f", res);
    }

    @Override
    public String toString() {
        return this.id + " " + this.price;
    }
}

public class J05073_TinhToanGiaBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
            System.out.println(new Product(sc.next(), Integer.parseInt(sc.next()), Integer.parseInt(sc.next())));
    }
}
