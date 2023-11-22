import java.util.Scanner;

class Employee{
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
}

public class J05006_DanhSachDoiTuongNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        for(int i = 0; i < n; i++)
            System.out.println(new Employee(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
    }
}
