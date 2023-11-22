import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

class Student{
    private String id, name, classroom, email, sdt, giangvien, doan;

    // public Student(String id, String name, String classroom, String email, String sdt) {
    //     this.id = id;
    //     this.name = name;
    //     this.classroom = classroom;
    //     this.email = email;
    //     this.sdt = "0" + sdt;
    // }



    public String getId() {
        return id;
    }

    public Student(String id, String name, String classroom, String email, String sdt) {
        this.id = id;
        this.name = name;
        this.classroom = classroom;
        this.email = email;
        this.sdt = "0" + sdt;
        this.giangvien = "";
        this.doan = "";
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getGiangvien() {
        return giangvien;
    }

    public void setGiangvien(String giangvien) {
        this.giangvien = giangvien;
    }

    public String getDoan() {
        return doan;
    }

    public void setDoan(String doan) {
        this.doan = doan;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + giangvien + " " + doan + sdt;
    }



}

public class Bai10{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc1 = new Scanner(new File("DANHSACH.in"));
        ArrayList<Student> arr = new ArrayList<>();
        while(sc1.hasNext()){
            arr.add(new Student(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }
        Scanner sc2 = new Scanner(new File("HUONGDAN.in"));
        int n = sc2.nextInt(); sc2.nextLine();
        for(int i = 0; i < n; i++){
            String name = sc2.nextLine();
            int num = name.charAt(name.length() - 1) - 48;
            name = name.substring(0, name.length() - 2);
            for(int j = 0; j < num; j++){
                String[] ar = sc2.nextLine().split("\\s+");
                String doan = "";
                for(int r = 1; r < ar.length; r++)
                    doan += ar[r] + " ";
//                doan.trim();
                for(Student x : arr)
                    if(x.getId().equals(ar[0])){
                        x.setGiangvien(name);
                        x.setDoan(doan);
                    }
            }
        }

        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                    return o1.getId().compareTo(o2.getId());
            }
        });

        for(Student x : arr) System.out.println(x);
        
        

    }
}