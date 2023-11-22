import java.util.Arrays;
import java.util.Scanner;

class Employee implements Comparable<Employee>{
    public static int countGD = 0;
    public static int countTP = 0;
    public static int countPP = 0;
    private String id, name;

    public Employee(String inp) {
        String[] tmp = inp.split("\\s+");
        this.id = updateId(tmp[0]);
        this.name = "";
        for(int i = 1; i < tmp.length; i++)
            this.name += tmp[i] + " ";
        this.name = this.name.trim();
    }

    public String updateId(String id){
        if(id.startsWith("GD")){
            if(countGD == 0){
                countGD++;
                return id;
            }
            else return "NV" + id.substring(2);
        }
        else if(id.startsWith("TP")){
            if(countTP <= 3){
                countTP++;
                return id;
            }
            else return "NV" + id.substring(2);
        }
        else if(id.startsWith("PP")){
            if(countPP <= 3){
                countPP++;
                return id;
            }
            else return "NV" + id.substring(2);
        }
        else return id;
    }
    public String getPosition(){
        return id.substring(0, 2);
    }

    public String getRankSalary(){
        return id.substring(2, 4);
    }

    public String getEmployeeId(){
        return id.substring(4);
    }

    public int compareTo(Employee e){
        if(this.getRankSalary().compareTo(e.getRankSalary()) == 0){
            return Integer.parseInt(this.getEmployeeId()) - Integer.parseInt(e.getEmployeeId());
        }
        else return e.getRankSalary().compareTo(this.getRankSalary());
    }

    @Override
    public String toString() {
        return name + " " + id.substring(0, 2) + " " + getEmployeeId() + " " + getRankSalary();
    }
}

public class J05065_LietKeNhanVienTheoNhom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Employee[] arr = new Employee[n];
        for(int i = 0; i < n; i++)
            arr[i] = new Employee(sc.nextLine());
        Arrays.sort(arr);
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < m; i++){
            String s = sc.nextLine();
            for(Employee e : arr)
                if(e.getPosition().equals(s.toUpperCase()))
                    System.out.println(e);
            System.out.println();
        }

    }
}
