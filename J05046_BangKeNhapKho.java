import java.util.HashMap;
import java.util.Scanner;

class Product{
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

    public String toString(){
        return id + " " + name + " " + discount + " " + (totalCost - discount);
    }
}

public class J05046_BangKeNhapKho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        int n = sc.nextInt();
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
            System.out.println(p);
        }

    }
}
