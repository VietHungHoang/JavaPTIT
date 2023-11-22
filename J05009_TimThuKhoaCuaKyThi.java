import java.util.Scanner;

class Candidate{
    private int id;
    private String name, dob;
    private float mark;
    
    public Candidate(int id, String name, String dob, float mark1, float mark2, float mark3) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.mark = mark1 + mark2 + mark3;
    }

    public float getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + dob + " " + String.format("%.1f", mark);
    }
}

public class J05009_TimThuKhoaCuaKyThi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Candidate[] a = new Candidate[n];
        float maxMark = 0;
        for(int i = 0; i < n; i++){
            sc.nextLine();
            a[i] = new Candidate(i + 1, sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
            maxMark = Math.max(maxMark, a[i].getMark());
        }
        for(Candidate i : a)
            if(i.getMark() == maxMark) System.out.println(i);
    }
}
