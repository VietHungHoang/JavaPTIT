    import java.io.File;
    import java.io.FileNotFoundException;
    import java.util.*;

class Customer{
    private String id, name, sex, dob, address;

    public Customer(int id, String name, String sex, String dob, String address) {
        this.id = String.format("KH%03d", id);
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

class Product{
    private String id, name, unit;
    private int price, cost;

    public Product(int id, String name, String unit, int cost, int price) {
        this.id = String.format("MH%03d", id);
        this.name = name;
        this.unit = unit;
        this.price = price;
        this.cost = cost;
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

    public int getPrice() {
        return price;
    }

    public int getCost() {
        return cost;
    }
}

class Bill{
    private String id;
    private Product product;
    private Customer customer;
    private int quantity;

    public Bill(int id, Customer customer, Product product, int quantity) {
        this.id = String.format("HD%03d", id);
        this.product = product;
        this.customer = customer;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return id + " " + customer.getName() + " " + customer.getAddress() + " " + product.getName() + " " + product.getUnit() + " " + product.getCost() + " " + product.getPrice() + " " + quantity + " " + (quantity * product.getPrice());
    }
}
    public class J07020_HoaDon2 {
        public static void main(String[] args) throws FileNotFoundException {
            Scanner sc1 = new Scanner(new File("KH.in"));
            int n = Integer.parseInt(sc1.nextLine());
            HashMap<String, Customer> customers = new HashMap<>();
            for(int i = 0; i < n; i++){
                Customer tmp = new Customer(i + 1, sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
                customers.put(tmp.getId(), tmp);
            }

            Scanner sc2 = new Scanner(new File("MH.in"));
            int m = Integer.parseInt(sc2.nextLine());
            HashMap<String, Product> products = new HashMap<>();
            for(int i = 0; i < m; i++){
                Product tmp = new Product(i + 1, sc2.nextLine(), sc2.nextLine(), Integer.parseInt(sc2.nextLine()), Integer.parseInt(sc2.nextLine()));
                products.put(tmp.getId(), tmp);
            }

            Scanner sc3 = new Scanner(new File("HD.in"));
            int k = Integer.parseInt(sc3.nextLine());
            Bill[] bills = new Bill[k];
            for(int i = 0; i < k; i++){
                bills[i] = new Bill(i + 1, customers.get(sc3.next()), products.get(sc3.next()), Integer.parseInt(sc3.next()));
            }
            for(Bill x : bills) System.out.println(x);

        }
    }
