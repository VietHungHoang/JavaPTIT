import java.util.Scanner;

class Candidate{
    private String id, name;
    private int age, avg;

    public Candidate(int id, String name, String dob, float theory, float pratice) {
        this.id = String.format("PH%02d", id);
        this.name = name;
        this.age = 2021 - Integer.parseInt(dob.substring(6));
        this.avg = getAvg(theory, pratice);
    }

    public int getAvg(float theory, float pratice){
        float bonus;
        if(theory >= 8 && pratice >= 8) bonus = 1;
        else if(theory >= 7.5 && pratice >= 7.5) bonus = 0.5f;
        else bonus = 0;
        int n = (int)Math.round((theory + pratice) / 2 + bonus);
        return (n < 10 ? n : 10);
    }

    public String getRank(){
        if(avg >= 9) return "Xuat sac";
        else if(avg == 8) return "Gioi";
        else if(avg == 7) return "Kha";
        else if(avg >= 5) return "Trung binh";
        else return "Truot";
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + avg + " " + getRank();
    }

}

public class J05060_KetQuaXetTuyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println(new Candidate(i + 1, sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat()));
        }
    }
}
