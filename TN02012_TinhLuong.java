import java.util.HashMap;
import java.util.Scanner;

class Department{
    private String id, name;
    public Department(String inp){
        String tmp[] = inp.split("\\s+");
        this.name = "";
        this.id = tmp[0];
        for(int i = 1; i < tmp.length; i++) this.name += tmp[i] + " ";
        this.name = this.name.trim();
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }
}

class Employee{
    private String id, name, department;
    private int salary;

    public Employee(String id, String name, int basicSalary, int workingDays){
        this.id = id;
        this.name = name;
        this.department = "";
        this.salary = basicSalary * workingDays * getMutilplicationFactor() * 1000;
    }

    private int getMutilplicationFactor(){
        int year = Integer.parseInt(this.id.substring(1, 3));
        int rank = this.id.charAt(0);
        if(year <= 3){
            if(rank == 'A' || rank == 'B') return 10;
            else if(rank == 'C') return 9;
            else return 8;
        }
        else if (year <= 8){
            if(rank == 'A') return 12;
            else if(rank == 'B') return 11;
            else if(rank == 'C') return 10;
            else return 9;
        }
        else if (year <= 15){
            if(rank == 'A') return 14;
            else if(rank == 'B') return 13;
            else if(rank == 'C') return 12;
            else return 11;
        }
        else {
            if(rank == 'A') return 20;
            else if(rank == 'B') return 16;
            else if(rank == 'C') return 14;
            else return 13;
        }
    }

    public String getDepartmentId(){
        return this.id.substring(3);
    }

    public void setDepartment(String s){
        this.department = s;
    }

    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.department + " " + this.salary;
    }

}

public class TN02012_TinhLuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Department> map = new HashMap<>();
        int n = sc.nextInt(); sc.nextLine();
        for(int i = 0; i < n; i++){
            Department tmp = new Department(sc.nextLine());
            map.put(tmp.getId(), tmp);
        }

        int m = sc.nextInt();
        for(int i = 0; i < m; i++){
            sc.nextLine();
            Employee e = new Employee(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            e.setDepartment(map.get(e.getDepartmentId()).getName());
            System.out.println(e);

        }

    }
}
