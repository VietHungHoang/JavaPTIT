import java.util.Arrays;
import java.util.Scanner;

class Company implements Comparable<Company>{
    private String id, name;
    private int quantity;

    public Company(String id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + quantity;
    }

    @Override
    public int compareTo(Company o) {
        if(this.quantity == o.quantity) return this.id.compareTo(o.id);
        else return o.quantity - this.quantity;
    }
}

public class J05029_DanhSachDoanhNghiepNhanSinhVienThucTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Company[] arr = new Company[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            arr[i] = new Company(sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        Arrays.sort(arr);
        int q = sc.nextInt();
        while(q-- > 0){
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            for(Company x : arr)
                if(x.getQuantity() >= a && x.getQuantity() <= b) System.out.println(x);
        }
        
    }
}
