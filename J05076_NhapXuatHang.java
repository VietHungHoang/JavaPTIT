
import java.util.*;
// Thứ tự nhập theo đề bài là thứ tự nhập kho, không phải thứ tự nhập sản phẩm
class Product{
    private String id, type, name;
    private long  totalIn, totalOut;

    public Product(String id, String name, String type) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.totalIn = 0;
        this.totalOut = 0;
    }

    public String getId() {
        return id;
    }

    public void cal(long quantityIn, long price, long quantityOut) {
        this.totalIn = quantityIn * price;
        float tmp;
        if (type.equals("A")) tmp = 0.08f;
        else if (type.equals("B")) tmp = 0.05f;
        else tmp = 0.02f;
        this.totalOut = (long) ((tmp + 1) * (quantityOut * price));
    }

    public String toString(){
        return id + " " + name + " " + totalIn + " " + totalOut;
    }
}

public class J05076_NhapXuatHang{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Product> map = new LinkedHashMap<>();
        int n = sc.nextInt(); sc.nextLine();
        for(int i = 0; i < n; i++){
            Product tmp = new Product(sc.nextLine(), sc.nextLine(), sc.nextLine());
            map.put(tmp.getId(), tmp);
        }
        int m = sc.nextInt(); sc.nextLine();
        for(int i = 0; i < m; i++){
            String id = sc.next();
            map.get(id).cal(sc.nextLong(), sc.nextLong(), sc.nextLong());
            System.out.println(map.get(id));
        }
    }
}