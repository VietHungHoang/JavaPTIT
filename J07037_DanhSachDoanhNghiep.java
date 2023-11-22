import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;
class Company implements Comparable<Company>{
    private String name, id;
    private int numOfSudent;

    public Company(String id, String name, int numOfSudent) {
        this.name = name;
        this.id = id;
        this.numOfSudent = numOfSudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumOfStudent() {
        return numOfSudent;
    }

    public void setNumOfStudent(int numOfSudent) {
        this.numOfSudent = numOfSudent;
    }

    public int compareTo(Company Other){
        return this.id.compareTo(Other.getId());
    }

    @Override
    public String toString() {
        return id + " " + name + " " + numOfSudent;
    }
}

public class J07037_DanhSachDoanhNghiep {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DN.in"));
        int n = sc.nextInt(); sc.nextLine();
        Company[] a = new Company[n];
        for(int i = 0; i < n; i++) a[i] = new Company(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
        Arrays.sort(a);
        for(Company x : a) System.out.println(x);
    }
}
