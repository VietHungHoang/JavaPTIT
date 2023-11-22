import java.util.Scanner;

class Employee{
    private String id, name, position;
    private int salary, advance, allowance;

    public Employee(int id, String name, String position, int basicSalary, int wordDay){
        this.id = String.format("NV%02d", id);
        this.name = name;
        this.position = position;
        this.salary = basicSalary * wordDay;
        this.allowance = getAlowance();
        this.advance = getAdvance();
    }

    public int getAlowance(){
        if(this.position.equals("GD")) return 500;
        else if(this.position.equals("PGD")) return 400;
        else if(this.position.equals("TP")) return 300;
        else if(this.position.equals("KT")) return 250;
        else return 100;
    }

    public int getAdvance(){
        Float tmp = (getAlowance() + salary) * 2f / 3;
        if(tmp < 25000) return (int)Math.round(tmp / 1000) * 1000;
        else return 25000;
    }

    public String getPosition(){
        return position;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + allowance + " " + salary + " " + advance + " " + (salary + allowance - advance);
    }
}

public class J05043_TinhThuNhapChoNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println(new Employee(i + 1, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
    }
}