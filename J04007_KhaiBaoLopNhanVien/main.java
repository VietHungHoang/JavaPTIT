package J04007_KhaiBaoLopNhanVien;

import java.util.Scanner;

/**
 *
 * @author VietHungHoang
 */
class Agent{
    private String agentCode, name, sex, birth, address, taxCode, contractDate;

    public Agent(String name, String sex, String birth, String address, String taxCode, String contractDate) {
        this.agentCode = "00001";
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.address = address;
        this.taxCode = taxCode;
        this.contractDate = contractDate;
    }
    
    public String toString() {
        return agentCode + " " + name + " " + sex + " " + birth + " " + address + " " + taxCode + " " + contractDate;
    }
    
    
}
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agent at = new Agent(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        System.out.println(at);
    }
}
