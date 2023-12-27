import java.util.*;
// Số tiền phải làm tròn bằng round
class Customer implements Comparable<Customer>{
    private String id, name;
    private int price;

    public Customer(int id, String name, int in, int out) {
        this.id = String.format("KH%02d", id);
        this.name = name;
        this.price = calPrice(in, out);
    }
    public int calPrice(int in, int out){
        int num = out - in;
        if(num > 100) return (int)Math.round(((200 * (num - 100) + 150 * 50 + 100 * 50) * 1.05));
        else if (num > 50) return (int)Math.round((150 * (num - 50) + 100 * 50) * 1.03);
        else return (int)Math.round((100 * num) * 1.02);
    }
    public String toString(){
        return id + " " + name + " " + price;
    }

    public int compareTo(Customer o){
        return o.price - this.price;
    }
}

public class J05017_HoaDonTienNuoc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Customer[] customers = new Customer[n];
        for(int i = 0; i < n; i++)
            customers[i] = new Customer(i + 1, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
        Arrays.sort(customers);
        for(Customer x : customers) System.out.println(x);

    }
}