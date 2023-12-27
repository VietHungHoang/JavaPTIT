import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Product{
    private String id, name;
    private long price1, price2;

    public Product(String id, String name, long price1, long price2) {
        this.id = id;
        this.name = name;
        this.price1 = price1;
        this.price2 = price2;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPrice1() {
        return price1;
    }

    public long getPrice2() {
        return price2;
    }
}

class Bill{
    private String id;
    private Product product;
    private long quantity, total, discount;
    public Bill(int idx, String id, long quantity) {
        this.id = id + String.format("-%03d", idx);
        this.quantity = quantity;
    }
    public void calTotal(){
        if(id.substring(2, 3).equals("1")) this.total = product.getPrice1() * quantity;
        else this.total = product.getPrice2() * quantity;
    }

    public void calDiscount(){
        if(quantity >= 150) this.discount = (long)(total * 0.5);
        else if(quantity >= 100) this.discount = (long)(total * 0.3);
        else if(quantity >= 50) this.discount = (long)(total * 0.15);
        else this.discount = 0;
        this.total -= this.discount;

    }
    public String getId() {
        return id;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    @Override
    public String toString(){
        return id + " " + product.getName() + " " + discount + " "  + total;
    }
}

    public class Main {
        public static void main(String[] args) throws FileNotFoundException {
            Scanner sc1 = new Scanner(new File("DATA1.in"));
            int n = Integer.parseInt(sc1.nextLine());
            HashMap<String, Product> products = new HashMap<>();
            for(int i = 0; i < n; i++){
                Product tmp = new Product(sc1.nextLine(), sc1.nextLine(), Long.parseLong(sc1.nextLine()), Long.parseLong(sc1.nextLine()));
                products.put(tmp.getId(), tmp);
            }
            Scanner sc2 = new Scanner(new File("DATA2.in"));
            int m = Integer.parseInt(sc2.nextLine());
            for(int i = 0; i < m; i++){
                Bill res = new Bill(i + 1, sc2.next(), Long.parseLong(sc2.next()));
                res.setProduct(products.get(res.getId().substring(0, 2)));
                res.calTotal();
                res.calDiscount();
                System.out.println(res);
            }
        }
    }