import java.util.*;

class Student{
    private String id, name, phoneNumber;
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
        return id + " " + name + " " + phoneNumber;
    }
}
public class J06003_QuanLiBaiTapNhom1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(); sc.nextLine();
        Student[] students = new Student[n];
        for(int i = 0; i < n; i++)
            students[i] = new Student(sc.nextLin    e(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
        HashMap<Integer, String> map = new HashMap<>();
        for(int i = 0; i < m; i++)
            map.put(i + 1, sc.nextLine());
        int q = sc.nextInt();
        while(q-- > 0){
            int id = sc.nextInt();
            System.out.println("DANH SACH NHOM " + id + ":");
            for(Student x : students)
                if(x.getGroupId() == id)
                    System.out.println(x);
            System.out.println("Bai tap dang ky: " + map.get(id));
        }
    }
}