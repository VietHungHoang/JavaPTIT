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

public class J05028_DanhSachDoanhNghiepNhanSinhVienThucTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Company[] a = new Company[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            a[i] = new Company(sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        Arrays.sort(a);
        for(Company x : a) System.out.println(x);
        
    }
}
