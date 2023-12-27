import java.util.*;

class Classroom implements Comparable<Classroom>{
    private String id, name, group, lecture;
    public Classroom(String id, String name, String group, String lecture) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.lecture = lecture;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return group + " " + lecture;
    }

    public int compareTo(Classroom o){
        return Integer.parseInt(this.group) - Integer.parseInt(o.group);
    }
}
public class J05079_LopHocPhan1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Classroom[] classrooms = new Classroom[n];
        for(int i = 0; i < n; i++)
            classrooms[i] = new Classroom(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        Arrays.sort(classrooms);
        int q = sc.nextInt();
        while(q-- > 0){
            boolean ok = false;
            String id = sc.next();
            for(Classroom x : classrooms)
                if(x.getId().equals(id)){
                    if(!ok){
                        System.out.println("Danh sach nhom lop mon " + x.getName() + ":");
                        ok = true;
                    }
                    System.out.println(x);
                }
        }
    }
}