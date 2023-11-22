import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;
class Subject implements Comparable<Subject>{
    private String name, id;
    private int credits;

    public Subject(String id, String name, int credits) {
        this.name = name;
        this.id = id;
        this.credits = credits;
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

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int compareTo(Subject Other){
        return this.name.compareTo(Other.getName());
    }

    @Override
    public String toString() {
        return id + " " + name + " " + credits;
    }
}

public class J07034_DanhSachMonHoc {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt(); sc.nextLine();
        Subject[] a = new Subject[n];
        for(int i = 0; i < n; i++) a[i] = new Subject(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
        Arrays.sort(a);
        for(Subject x : a) System.out.println(x);
    }
}
