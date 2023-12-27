import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Scanner;

class Subject{
    private String id, name, format;

    public Subject(String id, String name, String format) {
        this.id = id;
        this.name = name;
        this.format = format;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}

class Session{
    private String id, date, time, room;

    public Session(int id, String date, String time, String room) {
        this.id = String.format("C%03d", id);
        this.date = date;
        this.time = time;
        this.room = room;
    }

    public String getId() {
        return id;
    }
    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getRoom() {
        return room;
    }


    
}



class Exam implements Comparable<Exam>{
    private Subject s;
    private Session ss;
    private String groupId, nos, dateTime;

    public Exam(Session ss, Subject s, String groupId, String nos) {
        this.s = s;
        this.ss = ss;
        this.groupId = groupId;
        this.nos = nos;
        this.dateTime = ss.getDate() + " " + ss.getTime();
    }

    public int compareTo(Exam o) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        try{
            Date d1 = sdf.parse(this.dateTime);
            Date d2 = sdf.parse(o.dateTime);
            if(d1.equals(d2)) return this.ss.getId().compareTo(o.ss.getId());
            else return d1.compareTo(d2);
        }
        catch(Exception e){
            return 0;
        }
    }

    public String toString(){
        return dateTime + " " + ss.getRoom() + " " + s.getName() + " " + groupId + " " + nos;
    }

    
}
public class J07076_SapXepLichThi {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(new File("MONTHI.in"));
        Scanner sc2 = new Scanner(new File("CATHI.in"));
        Scanner sc3 = new Scanner(new File("LICHTHI.in"));
        int n = sc1.nextInt(); sc1.nextLine();
        int m = sc2.nextInt(); sc2.nextLine();
        int k = sc3.nextInt(); sc3.nextLine();
        HashMap<String, Subject> subjects = new HashMap<>();
        HashMap<String, Session> sessions = new HashMap<>();
        Exam[] exams = new Exam[k];
        for(int i = 0; i < n; i++){
            Subject s = new Subject(sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            subjects.put(s.getId(), s);
        }
        for(int i = 0; i < m; i++){
            Session ss = new Session(i + 1, sc2.nextLine(), sc2.nextLine(), sc2.nextLine());
            sessions.put(ss.getId(), ss);
        }
        
        for(int i = 0; i < k; i++){
            String[] tmp = sc3.nextLine().split("\\s+");
            exams[i] = new Exam(sessions.get(tmp[0]), subjects.get(tmp[1]), tmp[2], tmp[3]);
        }

        Arrays.sort(exams);
        for(Exam e: exams) System.out.println(e);

    }
}
