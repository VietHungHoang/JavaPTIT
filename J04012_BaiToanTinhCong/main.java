package J04012_BaiToanTinhCong;

import java.util.Scanner;

/**
 *
 * @author VietHungHoang
 */

class Agent{
    private String agentId = "NV01", name, post;
    private int workday, basicSalary;

    public Agent(String name, int basicSalary, int workday, String post) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.workday = workday;
        this.post = post;
    }
    
    public int sumSalary(){
        return basicSalary * workday;
    }

    public int bonus(){
        if(workday >= 25) return sumSalary() / 5;
        else if (workday >= 22) return sumSalary() / 10;
        else return 0;
    }
    
    public int allowance(){
        if(this.post.equals("GD")) return 250000;
        else if(this.post.equals("PGD")) return 200000;
        else if(this.post.equals("TP")) return 180000;
        else return 150000;
    }
    
    public int salary(){
        return sumSalary() + bonus() + allowance();
    }
    
    public String toString(){
        return agentId + " " + name + " " + sumSalary() + " " + bonus() + " " + allowance() + " " + salary();
    }
}
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new Agent(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine()));
    }
    
}
