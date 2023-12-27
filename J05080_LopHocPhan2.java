import java.util.*;

class Classroom implements Comparable<Classroom>{
    private String id, name, group, lecture;
    public Classroom(String id, String name, String group, String lecture) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.lecture = lecture;
    }

    public String getLecture() {
        return lecture;
    }

    public String toString(){
        return id + " " + name + " " + group;
    }

    public int compareTo(Classroom o){
        if(this.id.equals(o.id))
            return Integer.parseInt(this.group) - Integer.parseInt(o.group);
        else return this.id.compareTo(o.id);
    }
}
public class J05080_LopHocPhan2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Classroom[] classrooms = new Classroom[n];
        for(int i = 0; i < n; i++)
            classrooms[i] = new Classroom(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        Arrays.sort(classrooms);
        int q = sc.nextInt(); sc.nextLine();
        while(q-- > 0){
            boolean ok = false;
            String lecture = sc.nextLine();
            for(Classroom x : classrooms)
                if(x.getLecture().equals(lecture)){
                    if(!ok){
                        System.out.println("Danh sach cho giang vien " + x.getLecture() + ":");
                        ok = true;
                    }
                    System.out.println(x);
                }
        }
    }
}