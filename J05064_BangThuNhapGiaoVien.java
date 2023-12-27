import java.util.Scanner;

class Teacher{
    private String id, name;
    private int allowance, salary, rankSalary;

    public Teacher(String id, String name, int basicSalary) {
        this.id = id;
        this.name = name;
        this.allowance = getAllowance();
        this.rankSalary = getRankSalary();
        this.salary = basicSalary * rankSalary + allowance;
    }

    public int getAllowance() {
        if(id.startsWith("HT")) return 2000000;
        else if(id.startsWith("HP")) return 900000;
        else return 500000;
    }

    public int getRankSalary(){
        return Integer.parseInt(id.substring(2));
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + rankSalary + " " + allowance + " " + salary;
    }
}

public class J05064_BangThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cntHT = 0, cntHP = 0;
        for(int i = 0;i < n; i++){
            sc.nextLine();
            Teacher t = new Teacher(sc.nextLine(), sc.nextLine(), sc.nextInt());
            if(t.getId().startsWith("HT") && cntHT == 0){
                    cntHT++;
                    System.out.println(t);
            }
            else if(t.getId().startsWith("HP") && cntHP < 2){
                    cntHP++;
                    System.out.println(t);
            }
            else if(t.getId().startsWith("GV")) System.out.println(t);
        }
    }
}