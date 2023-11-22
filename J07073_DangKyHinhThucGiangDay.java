import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

class Subject implements Comparable<Subject>{
    private String id, name, credits, theoryTeaching, praticeTeaching;
    
    public Subject(String id, String name, String credits, String theoryTeaching, String praticeTeaching) {
        this.id = id;
        this.name = name;
        this.credits = credits;
        this.theoryTeaching = theoryTeaching;
        this.praticeTeaching = praticeTeaching;
    }

    public String getPraticeTeaching(){
        return this.praticeTeaching;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + credits + " " + theoryTeaching + " " + praticeTeaching;
    }

    public int compareTo(Subject other){
        return this.id.compareTo(other.id);
    }


}

public class J07073_DangKyHinhThucGiangDay {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt(); sc.nextLine();
        Subject[] a = new Subject[n];
        for(int i = 0; i < n; i++)
            a[i] = new Subject(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        Arrays.sort(a);
        for(Subject x : a){
            if(!x.getPraticeTeaching().equals("Truc tiep")) System.out.println(x);
        }    

    }
}
