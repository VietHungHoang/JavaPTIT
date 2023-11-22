import java.util.Scanner;
import java.io.File;
import java.text.SimpleDateFormat;

    class Student{
        private String id,name, classroom, dob, gpa;

        public Student(int id, String name, String classroom, String dob, float gpa) {
            this.id = String.format("B20DCCN%03d", id);
            this.name = stdName(name);
            this.classroom = classroom;
            this.dob = stdDate(dob);
            this.gpa = String.format("%.2f", gpa);
        }

        public String stdName(String name){
            String[] arr = name.toLowerCase().split("\\s+");
            String res = "";
            for(String x : arr){
                StringBuilder sb = new StringBuilder(x);
                sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
                res += sb.toString() + " ";
            }
            return res.trim();
        }

        public String stdDate(String date){
            try{
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                return sdf.format(sdf.parse(date));
            }
            catch(Exception e){
                return date;
            }
        }

        @Override
        public String toString() {
            return id + " " + name + " " + classroom + " " + dob + " " + gpa;
        }

    }

    public class J07018_ChuanHoaDanhSachSinhVien {
        public static void main(String[] args) throws Exception{
            Scanner sc = new Scanner(System.in);
            int t = Integer.parseInt(sc.nextLine());
            for(int i = 0; i < t; i++){
                System.out.println(new Student(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine())));
            }
        }
    }
