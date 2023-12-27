import java.io.File;
    import java.io.FileNotFoundException;
    import java.util.Arrays;
    import java.util.HashMap;
    import java.util.Scanner;

    class Subject{
        private String id, name;
        private int credit;

        public Subject(String id, String name, int credit) {
            this.id = id;
            this.name = name;
            this.credit = credit;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    class Student{
        private String id, name, className, email;

        public Student(String id, String name, String className, String email) {
            this.id = id;
            this.name = stdName(name);
            this.className = className;
            this.email = email;
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

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getClassName() {
            return className;
        }

    }

    class ScoreBroad implements Comparable<ScoreBroad>{
        private Student student;
        private Subject subject;
        private String mark;

        public ScoreBroad(Student student, Subject subject, String mark) {
            this.student = student;
            this.subject = subject;
            this.mark = mark;
        }

        public Student getStudent() {
            return student;
        }

        @Override
        public int compareTo(ScoreBroad o){
            if(this.subject.getId().equals(o.subject.getId())) return this.student.getId().compareTo(o.student.getId());
            else return this.subject.getId().compareTo(o.subject.getId());
        }
        @Override
        public String toString(){
            return student.getId() + " " + student.getName() + " " + subject.getId() + " " + subject.getName() + " " + mark;
        }
    }

    public class J07036_BangDiemTheoLop {
        public static void main(String[] args) throws FileNotFoundException {
            Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
            HashMap<String, Student> students = new HashMap<>();
            int n = Integer.parseInt(sc1.nextLine());
            for(int i = 0; i < n; i++){
                Student tmp = new Student(sc1.nextLine(), sc1.nextLine().trim(), sc1.nextLine(), sc1.nextLine());
                students.put(tmp.getId(), tmp);
            }

            Scanner sc2 = new Scanner(new File("MONHOC.in"));
            HashMap<String, Subject> subjects = new HashMap<>();
            int m = Integer.parseInt(sc2.nextLine());
            for(int i = 0; i < m; i++){
                Subject tmp = new Subject(sc2.nextLine(), sc2.nextLine(), Integer.parseInt(sc2.nextLine()));
                subjects.put(tmp.getId(), tmp);
            }

            Scanner sc3 = new Scanner(new File("BANGDIEM.in"));
            int k = Integer.parseInt(sc3.nextLine());
            ScoreBroad[] arr = new ScoreBroad[k];
            for(int i = 0; i < k ;i++)
                arr[i] = new ScoreBroad(students.get(sc3.next()), subjects.get(sc3.next()), sc3.next());
            Arrays.sort(arr);
            int q = Integer.parseInt(sc3.next());
            while(q-- > 0){
                String className = sc3.next();
                System.out.println("BANG DIEM lop " + className + ":");
                for(ScoreBroad x : arr)
                    if(x.getStudent().getClassName().equals(className)) System.out.println(x);
            }
        }
    }