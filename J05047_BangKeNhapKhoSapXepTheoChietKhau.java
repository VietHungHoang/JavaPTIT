import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Product implements Comparable<Product>{
    private String id, name;
    private int quantity, totalCost, discount;

    public Product(String name, int quantity, int cost){
        this.id = "";
        this.name = name;
        String[] tmp = name.toUpperCase().split("\\s+");
        this.id += tmp[0].charAt(0);
        this.id += tmp[1].charAt(0);
        this.quantity = quantity;
        this.totalCost = quantity * cost;
        this.discount = getDiscount();
    }

    public int getDiscount(){
        float tmp;
        if(quantity > 10) tmp = 0.05f;
        else if(quantity >= 8) tmp = 0.02f;
        else if(quantity >= 5) tmp = 0.01f;
        else tmp = 0;
        return (int)Math.round(tmp * totalCost);
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id += id;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + discount + " " + (totalCost - discount);
    }

    @Override
    public int compareTo(Product o) {
        return o.discount - this.discount;
    }
}

public class J05047_BangKeNhapKhoSapXepTheoChietKhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        Product[] a = new Product[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            Product p = new Product(sc.nextLine(), sc.nextInt(), sc.nextInt());
            if(map.containsKey(p.getId())){
                map.put(p.getId(), map.get(p.getId()) + 1);
                p.setId(String.format("%02d", map.get(p.getId())));
            }
            else{
                map.put(p.getId(), 1);
                p.setId("01");
            }
            a[i] = p;
        }
        Arrays.sort(a);
        for(Product x : a) System.out.println(x);

    }
}
