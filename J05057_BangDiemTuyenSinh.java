import java.util.Scanner;

class Candidate{
    private String id, name, result;
    private float avg, priority;

    public Candidate(String id, String name, float math, float physics, float chemistry) {
        this.id = id;
        this.name = name;
        this.priority = getPriority();
        this.avg = math * 2 + physics + chemistry;
        this.result = getResult();
    }

    public String getResult(){
        if(avg + getPriority() >= 24) return "TRUNG TUYEN";
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
        (priority % 1 != 0 ? String.format("%.1f", priority) : (int)priority)
        + " " + (avg % 1 != 0 ? String.format("%.1f", avg) : (int)avg)
        + " " + result;
    }
}

public class J05057_BangDiemTuyenSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            System.out.println(new Candidate(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat()));
        }
    }
}
