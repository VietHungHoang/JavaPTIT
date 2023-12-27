import java.util.Scanner;
// Bài toán tính tiền thì số tiền phải làm tròn lên
class Order{
    private String id, name, no;
    private int sale, price;

    public Order(String name, String id, int cost, int quantity) {
        this.id = id;
        this.name = name;
        this.no = this.id.substring(1, 4);
        this.sale = getSale(cost, quantity);
        this.price = cost * quantity - sale;
    }

    public int getSale(int cost, int quantity) {
        if(this.id.endsWith("1")) return (int)Math.ceil(0.5 * cost * quantity);
        else return (int)Math.ceil(0.3 * cost * quantity);
    }

    @Override
    public String toString() {
        return name + " " + id + " " + no + " " + sale + " " + price;
    }
}

public class J05052_TraCuuDonHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i  = 0; i < n; i++){
            sc.nextLine();
            System.out.println(new Order(sc.nextLine(), sc.next(), sc.nextInt(), sc.nextInt()));
        }
    }
}
