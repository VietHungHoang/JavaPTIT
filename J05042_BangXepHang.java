import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student>{
    private String name;
    private int submit, accepted;
    public Student(String name, int accepted, int submit) {
        this.name = name;
        this.submit = submit;
        this.accepted = accepted;
    }

    @Override
    public String toString(){
        return name + " " + accepted + " " + submit;
    }

    @Override
    public int compareTo(Student o){
        if(this.accepted == o.accepted) return this.submit - o.submit;
        else return o.accepted - this.accepted;
    }
}

public class J05042_BangXepHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] a = new Student[n];
        for(int i = 0; i < n; i++){
            sc.nextLine();
            a[i] = new Student(sc.nextLine(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(a);
        for(Student x : a) System.out.println(x);
    }
}
