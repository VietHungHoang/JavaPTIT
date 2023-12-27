import java.util.*;

class Customer{
    private String id, name, sex, dob, add;

    public Customer(int id, String name, String sex, String dob, String add) {
        this.id = String.format("KH%03d", id);
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.add = add;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAdd() {
        return add;
    }
}

class Product{
    private String id, name, unit;
    private int cost, price;

    public Product(int id, String name, String unit, int cost, int price) {
        this.id = String.format("MH%03d", id);
        this.name = name;
        this.unit = unit;
        this.cost = cost;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public int getCost() {
        return cost;
    }

    public int getPrice() {
        return price;
    }
}

class Order implements Comparable<Order>{
    private String id;
    private Customer customer;
    private Product product;
    private int quantity, totalPrice, benefit;

    public Order(int id, Customer customer, Product product, int quantity) {
        this.id = String.format("HD%03d", id);
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = quantity * product.getPrice();
        this.benefit = totalPrice - quantity * product.getCost();
    }

    public String toString(){
        return id + " "
                + customer.getName() + " "
                + customer.getAdd() + " "
                + product.getName() + " "
                + quantity + " "
                + totalPrice + " "
                + benefit;
    }

    public int compareTo(Order o){
        return o.benefit - this.benefit;
    }
}
public class J06006_QuanLiBanHang2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        HashMap<String, Customer> customers = new HashMap<>();
        for(int i = 0; i < n; i++){
            Customer tmp = new Customer(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            customers.put(tmp.getId(), tmp);
        }
        int m = Integer.parseInt(sc.nextLine());
        HashMap<String, Product> products = new HashMap<>();
        for(int i = 0; i < m; i++){
            Product tmp = new Product(i + 1, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            products.put(tmp.getId(), tmp);
        }
        int k = Integer.parseInt(sc.nextLine());
        Order[] orders = new Order[k];
        for(int i = 0; i < k; i++)
            orders[i] = new Order(i + 1, customers.get(sc.next()), products.get(sc.next()), Integer.parseInt(sc.next()));
        Arrays.sort(orders);
        for(Order x : orders) System.out.println(x);
    }
}