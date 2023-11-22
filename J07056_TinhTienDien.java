import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class Customer implements Comparable<Customer>{
    private String id, name, type;
    private int start, end, vat;
    public Customer(int id, String name, String type, int start, int end) {
        this.id = String.format("KH%02d", id);

        String[] arr = name.toLowerCase().trim().split("\\s+");
        String tmp = "";
        for(String x : arr){
            StringBuilder sb = new StringBuilder(x);
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            tmp += sb.toString() + " ";
        }
        this.name = tmp.trim();
        this.type = type;
        this.start = start;
        this.end = end;
        this.vat = (int)(0.05 * moneyOut());
    }

    public int moneyIn(){
        int limit = 0;
        if(this.type.equals("A")) limit = 100;
        else if (this.type.equals("B")) limit = 500;
        else limit = 200;
        if(this.end - this.start < limit) return 450 * (this.end - this.start);
        else return limit * 450;
    }
    public int moneyOut(){
        int limit = 0;
        if(this.type.equals("A")) limit = 100;
        else if (this.type.equals("B")) limit = 500;
        else limit = 200;
        if(this.end - this.start > limit) return 1000 * (this.end - this.start - limit);
        else return 0;
    }

    public int total(){
        return moneyIn() + moneyOut() + vat;
    }

    public String toString(){
        return id + " " + name + " " + moneyIn() + " " + moneyOut() + " " + vat + " " + total();
    }

    public int compareTo(Customer other){
        return other.total() - this.total();
    }
    
}

public class J07056_TinhTienDien {
    public static void main(String[] args) throws FileNotFoundException{
        // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();
        Customer[] a = new Customer[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            a[i] = new Customer(i + 1, sc.nextLine(), sc.next(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(a);
        for(Customer x : a) System.out.println(x);

    }
}
