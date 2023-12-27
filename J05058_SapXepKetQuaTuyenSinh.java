import java.util.Arrays;
import java.util.Scanner;

class Candidate implements Comparable<Candidate>{
    private String id, name, result;
    private Float avg, priority;

    public Candidate(String id, String name, float math, float physics, float chemistry) {
        this.id = id;
        this.name = name;
        this.priority = getPriority();
        this.avg = math * 2 + physics + chemistry + getPriority();
        this.result = getResult();
    }

    public String getResult(){
        if(avg >= 24) return "TRUNG TUYEN";
        else return "TRUOT";
    }

    public float getPriority(){
        if(this.id.startsWith("KV1")) return 0.5f;
        else if(this.id.startsWith("KV2")) return 1;
        else return 2.5f;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + 
        (priority % 1 != 0 ? String.format("%.1f", priority) : String.format("%.0f", priority))
        + " " + (avg % 1 != 0 ? String.format("%.1f", avg) : String.format("%.0f", avg))
        + " " + result;
    }

    @Override
    public int compareTo(Candidate o) {
        if(this.avg.equals(o.avg)) return this.id.compareTo(o.id);
        else return o.avg.compareTo(this.avg);
    }
}

public class J05058_SapXepKetQuaTuyenSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Candidate[] a = new Candidate[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            a[i] = new Candidate(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        }
        Arrays.sort(a);
        for(Candidate i : a) System.out.println(i);
    }
}
