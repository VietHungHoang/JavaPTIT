import java.util.Arrays;
import java.util.Scanner;

class Lecturer{
    String id, name, section;

    public Lecturer(int id, String name, String section) {
        this.id = String.format("GV%02d", id);
        this.name = name;
        this.section = stdSection(section);
    }

    public String stdSection(String section){
        String[] tmp = section.toUpperCase().split("\\s+");
        String res = "";
        for(String x : tmp) res += x.charAt(0);
        return res;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + section;
    }
}

public class J05027_TimKiemGiangVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Lecturer[] a = new Lecturer[n];
        for(int i = 0; i < n; i++)
            a[i] = new Lecturer(i + 1, sc.nextLine(), sc.nextLine());
        int q = sc.nextInt(); sc.nextLine();
        while(q-- > 0){
            String s = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ":");
            for(Lecturer x : a)
                if(x.getName().toLowerCase().contains(s.toLowerCase())) System.out.println(x);
        }
    }
}
