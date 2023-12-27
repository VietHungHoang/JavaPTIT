
import java.util.*;

class Student implements Comparable<Student>{
    private String id, name, phoneNumber, groupName;
    private int groupId;

    public Student(String id, String name, String phoneNumber, int groupId) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.groupId = groupId;
    }

    public int getGroupId() {
        return groupId;
    }

    public String toString(){
        return id + " " + name + " " + phoneNumber + " " + groupId + " " +groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int compareTo(Student o){
        return this.id.compareTo(o.id);
    }
}
public class J06003_QuanLiBaiTapNhom2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(); sc.nextLine();
        Student[] students = new Student[n];
        for(int i = 0; i < n; i++)
            students[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
        HashMap<Integer, String> map = new HashMap<>();
        for(int i = 0; i < m; i++)
            map.put(i + 1, sc.nextLine());
        Arrays.sort(students);
        for(Student x : students){
            x.setGroupName(map.get(x.getGroupId()));
            System.out.println(x);
        }
    }
}