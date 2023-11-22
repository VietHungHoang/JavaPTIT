import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

class Employee implements Comparable<Employee>{
    String id, name, sex, dob, address, taxCode, contractDate;

    public Employee(int id, String name, String sex, String dob, String address, String taxCode,
            String contractDate) {
        this.id = String.format("%05d", id);
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.address = address;
        this.taxCode = taxCode;
        this.contractDate = contractDate;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + sex + " " + dob + " " + address + " " + taxCode + " " + contractDate;
    }

    public int compareTo(Employee o){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d1 = LocalDate.parse(this.dob, dtf);
        LocalDate d2 = LocalDate.parse(o.dob, dtf);
        return d1.compareTo(d2);
    }
}

public class J05007_SapXepDanhSachDoiTuongNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Employee[] a = new Employee[n];
        for(int i = 0; i < n; i++)
            a[i] = new Employee(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        Arrays.sort(a);
        for(Employee i : a) System.out.println(i);
    }
}
