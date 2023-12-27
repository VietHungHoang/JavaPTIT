import java.util.*;

class Subject{
    private String id, name;
    public Subject(String inp) {
        String[] arr = inp.trim().split("\\s+");
        this.id = arr[0];
        this.name = String.join(" ", Arrays.copyOfRange(arr, 1, arr.length));
        this.name = this.name.trim();
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}

class Lecture{
    private String id, name;
    public Lecture(String inp) {
        String[] arr = inp.trim().split("\\s+");
        this.id = arr[0];
        this.name = String.join(" ", Arrays.copyOfRange(arr, 1, arr.length));
        this.name = this.name.trim();
    }
    public String getId() {
        return id;
    }
    @Override
    public String toString(){
        return "Giang vien: " + name;
    }
}

class Table{
    private Lecture lecture;
    private Subject subject;
    private float time;

    public Table(Lecture lecture, Subject subject, float time) {
        this.lecture = lecture;
        this.subject = subject;
        this.time = time;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public float getTime() {
        return time;
    }

    public String toString(){
        return subject.getName() + " " + time;
    }
}

public class J06008_TinhGioChuanChoTungGiaoVien {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Subject> subjects = new HashMap<>();
        for(int i = 0; i < n; i++){
            Subject tmp = new Subject(sc.nextLine());
            subjects.put(tmp.getId(), tmp);
        }

        HashMap<String, Lecture> lectures = new HashMap<>();
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < m; i++){
            Lecture tmp = new Lecture(sc.nextLine());
            lectures.put(tmp.getId(), tmp);
        }

        int k = Integer.parseInt(sc.nextLine());
        Table[] tables = new Table[k];
        for(int i = 0; i < k ;i++)
            tables[i] = new Table(lectures.get(sc.next()), subjects.get(sc.next()), Float.parseFloat(sc.next()));
        String lecture = sc.next();
        System.out.println(lectures.get(lecture));
        float total = 0f;
        for(Table x : tables)
            if(x.getLecture().getId().equals(lecture)){
                System.out.println(x);
                total += x.getTime();
            }
        System.out.println("Tong: " + String.format("%.2f", total));
    }
}