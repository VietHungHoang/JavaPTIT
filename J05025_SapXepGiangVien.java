import java.util.Arrays;
import java.util.Scanner;

class Lecturer implements Comparable<Lecturer>{
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

    @Override
    public String toString() {
        return id + " " + name + " " + section;
    }

    @Override
    public int compareTo(Lecturer o) {
        String[] tmp1 = this.name.split("\\s+");
        String[] tmp2 = o.name.split("\\s+");
        if(tmp1[tmp1.length - 1].equals(tmp2[tmp2.length - 1])) return this.id.compareTo(o.id);
        else return tmp1[tmp1.length - 1].compareTo(tmp2[tmp2.length - 1]);
    }
}

public class J05025_SapXepGiangVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Lecturer[] a = new Lecturer[n];
        for(int i = 0; i < n; i++)
            a[i] = new Lecturer(i + 1, sc.nextLine(), sc.nextLine());
        Arrays.sort(a);
        for(Lecturer x : a) System.out.println(x);
    }
}
