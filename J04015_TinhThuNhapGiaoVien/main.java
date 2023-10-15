/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04015_TinhThuNhapGiaoVien;

import java.util.Scanner;

/**
 *
 * @author VietHungHoang
 */
class Teacher {
    private String qoutaCode, name;
    private int salaryScale, allowance, basicSalary, salary;

    Teacher(String qouteCode, String name, int basicSalary){
        this.qoutaCode = qouteCode;
        this.name = name;
        this.basicSalary = basicSalary;
        String title = this.qoutaCode.substring(0, 2);
        if(title.equals("HT")) this.allowance = 2000000;
        else if(title.equals("HP")) this.allowance = 900000;
        else this.allowance = 500000;
        this.salaryScale = Integer.parseInt(this.qoutaCode.substring(2));
        this.salary = basicSalary * salaryScale + allowance;
    }

    public String toString(){
        return qoutaCode + " " + name + " " + salaryScale + " " + allowance + " " + salary;
    }
}

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teacher t = new Teacher(sc.nextLine(), sc.nextLine(), sc.nextInt());
        System.out.println(t);
    }
}
