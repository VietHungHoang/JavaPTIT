package J07033_DanhSachSinhVienTrongFile;

public class Student implements Comparable<Student>{
    private String id, name, classroom, email;

    public Student(String id, String name, String classroom, String email){
        this.id = id;
        String tmp = "";
        String[] arr = name.trim().toLowerCase().split("\\s+");
        for(String x : arr){
            StringBuilder sb = new StringBuilder(x);
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            tmp += sb.toString() + " ";
        }
        this.name = tmp.trim();
        this.classroom = classroom;
        this.email = email;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + classroom + " " + email;
    }

    @Override
    public int compareTo(Student other){
        return this.id.compareTo(other.id);
    }
}
