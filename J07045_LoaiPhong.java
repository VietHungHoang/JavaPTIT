import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.IOException;
class LoaiPhong implements Comparable<LoaiPhong>{
    private String name, id, price, fee;

    public LoaiPhong(String info) {
        String[] arr = info.split("\\s+");
        this.name = arr[1];
        this.id = arr[0];
        this.price = arr[2];
        this.fee = arr[3];
    }
    


    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getId() {
        return id;
    }



    public void setId(String id) {
        this.id = id;
    }



    public String getPrice() {
        return price;
    }



    public void setPrice(String price) {
        this.price = price;
    }



    public String getFee() {
        return fee;
    }



    public void setFee(String fee) {
        this.fee = fee;
    }



    public int compareTo(LoaiPhong Other){
        return this.name.compareTo(Other.getName());
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price + " " + fee;
    }
}

public class J07045_LoaiPhong {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
