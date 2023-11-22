import java.util.Scanner;

class Employee{
    private String id, name, position;
    private int workDay, salary, totalSalary;

    public Employee(int id, String name, int daySalary, int workDay, String position) {
        this.id = "NV" + String.format("%02d", id);
        this.name = name;
        this.position = position;
        this.workDay = workDay;
        this.salary = daySalary * workDay;
        this.totalSalary = this.salary + getAlowance() + getBonus();
    }  

    public int getAlowance(){
        if(position.equals("GD")) return 250000;
        else if(position.equals("PGD")) return 200000;
        else if(position.equals("TP")) return 180000;
        else return 150000;
    }

    public int getBonus(){
        if(workDay >= 25) return (int)(this.salary * 0.2);
        else if(workDay >= 22) return (int)(this.salary * 0.1);
        else return 0;
    }

    public int getTotalSalary(){
        return this.totalSalary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary + " " + getBonus() + " " + getAlowance() + " " + totalSalary;
    }
}

public class J05040_LapBangTinhCong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println(new Employee(i + 1, sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.next()));
        }
    }
}
