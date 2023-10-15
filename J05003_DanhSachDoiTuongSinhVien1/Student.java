package J05003_DanhSachDoiTuongSinhVien1;

public class Student {

    public String id, name, classs, dateOfBirth;
    public float gpa;

    public Student(int num, String name, String classs, String dateOfBirth, float gpa) {
        this.id = String.format("B20DCCN%03d", num);
        this.name = name;
        this.classs = classs;
        this.dateOfBirth = dateOfBirth;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + classs + " " + dateOfBirth + " " + String.format("%.2f", gpa);
    }
}
