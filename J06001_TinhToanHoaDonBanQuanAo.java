import java.util.*;

class Product{
    private String id, name;
    private int price1, price2;

    public Product(String id, String name, int price1, int price2) {
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

    public int getPrice1() {
        return price1;
    }

    public int getPrice2() {
        return price2;
    }
}

class Order{
    private String id;
    private int quantity, totalPrice, discount;
    private Product product;

    public Order(int cnt, String id, int quantity ) {
        this.id = id + String.format("-%03d", cnt);
        this.quantity = quantity;
    }

    public void calTotalPriceAndDiscount(){
        int price;
        if(id.charAt(2) == '1') price = product.getPrice1();
        else price = product.getPrice2();
        totalPrice = price * quantity;
        if(quantity >= 150) discount = (int)(totalPrice / 2);
        else if(quantity >= 100) discount = (int)(totalPrice * 0.3);
        else if(quantity >= 50) discount = (int)(totalPrice * 0.15);
        else discount = 0;
        totalPrice -= discount;
    }

    public String getId() {
        return id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String toString(){
        return id + " " + product.getName() + " " + discount + " " + totalPrice;
    }
}
public class J06001_TinhToanHoaDonBanQuanAo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        HashMap<String, Product> products = new HashMap<>();
        for(int i = 0; i < n; i++){
            Product tmp = new Product(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            products.put(tmp.getId(), tmp);
        }
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < m; i++){
            Order tmp = new Order(i + 1, sc.next(), Integer.parseInt(sc.next()));
            tmp.setProduct(products.get(tmp.getId().substring(0, 2)));
            tmp.calTotalPriceAndDiscount();
            System.out.println(tmp);
        }
    }
}
