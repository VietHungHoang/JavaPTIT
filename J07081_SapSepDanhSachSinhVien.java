import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student>{
    private String id, name, phoneNumber, email;
    public Student(String id, String name, String phoneNumber, String email){
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + phoneNumber + " " + email;
    }
    
    public int compareTo(Student o){
        String[] arr1 = this.name.split("\\s+");
        String[] arr2 = o.name.split("\\s+");
        if(arr1[arr1.length - 1].equals(arr2[arr2.length - 1])){
            if(this.name.equals(o.name)) return this.id.compareTo(o.id);
            return this.name.compareTo(o.name);
        }
        return arr1[arr1.length - 1].compareTo(arr2[arr2.length - 1]);
    }
}

public class J07081_SapSepDanhSachSinhVien {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt(); sc.nextLine();
        Student[] arr = new Student[n];
        for(int i = 0; i < n; i++)
            arr[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        Arrays.sort(arr);
        for(Student i : arr) System.out.println(i);
    }
}
