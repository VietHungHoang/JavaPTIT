    import java.io.File;
    import java.io.FileNotFoundException;
    import java.util.*;

    class Exercise{
        private int id;
        private String name;

        public Exercise(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    class Student implements Comparable<Student>{
        private String id, name, phoneNumber;
        private Exercise exercise;

        public Student(String id, String name, String phoneNumber) {
            this.id = id;
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public String getId() {
            return id;
        }

        public void setExercise(Exercise exercise) {
            this.exercise = exercise;
        }

        @Override
        public int compareTo(Student o){
            return this.id.compareTo(o.id);
        }

        @Override
        public String toString(){
            return id + " " + name + " " + phoneNumber + " " + exercise.getId() + " " + exercise.getName();
        }


    }
    public class J07027_QuanLiBaiTapNhom {
        public static void main(String[] args) throws FileNotFoundException {

            Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
            int n = Integer.parseInt(sc1.nextLine());
            Student[] students = new Student[n];
            for(int i = 0; i < n; i++)
                students[i] = new Student(sc1.nextLine(), sc1.nextLine(), sc1.nextLine());

            Scanner sc2 = new Scanner(new File("BAITAP.in"));
            int m = Integer.parseInt(sc2.nextLine());
            HashMap<Integer, Exercise> exercises = new HashMap<>();
            for(int i = 0; i < m; i++){
                Exercise a = new Exercise(i + 1, sc2.nextLine());
                exercises.put(a.getId(), a);
            }

            Scanner sc3 = new Scanner(new File("NHOM.in"));
            HashMap<String, Exercise> groups = new HashMap<>();
            while(sc3.hasNext()){
                String id = sc3.next();
                int idE = Integer.parseInt(sc3.next());
                groups.put(id, exercises.get(idE));
            }
            for(Student x : students) x.setExercise(groups.get(x.getId()));
            Arrays.sort(students);
            for (Student x : students) System.out.println(x);

        }
    }
