import java.io.*;
import java.util.*;

class Student{
    private String id, name, clasName, rank;
    private int mark;

    public Student(String id, String name, String clasName) {
        this.id = id;
        this.name = name;
        this.clasName = clasName;
        this.rank = "";
        this.mark = 10;
    }

    public String getId() {
        return id;
    }

    public String getClasName() {
        return clasName;
    }

    public void solve(String inp){
        for(int i = 0; i < inp.length(); i++)
            if(inp.charAt(i) == 'm') this.mark -= 1;
            else if(inp.charAt(i) == 'v') this.mark -= 2;
        if(mark <= 0){
            mark = 0;
            rank = "KDDK";
        }
    }
        public String toString(){
        return id + " " + name + " " + clasName + " " + mark + " " + rank;
    }
}

public class J05075_DiemDanh2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Student> map = new LinkedHashMap<>();
        int n = sc.nextInt(); sc.nextLine();
        for(int i = 0; i < n; i++){
            Student tmp = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine());
            map.put(tmp.getId(), tmp);
        }
        for(int i = 0; i < n; i++) map.get(sc.next()).solve(sc.next());
        String className = sc.next();
        for(Map.Entry<String, Student> entry : map.entrySet())
            if(entry.getValue().getClasName().equals(className))
                System.out.println(entry.getValue());
    }
}