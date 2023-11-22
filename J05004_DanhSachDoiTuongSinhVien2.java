    import java.text.ParseException;
    import java.text.SimpleDateFormat;
    import java.util.Scanner;

    class Student {

        public String id, name, classs, dob, gpa;

        public Student(){
            this.id = "";
            this.name = "";
            this.classs = "";
            this.dob = "";
            this.gpa = "";
        }

        public void setId(int n){
            this.id = String.format("B20DCCN%03d", n);
        }

        public void setName(String s){          
            String tmp = "";
                String[] arr = s.toLowerCase().split("\\s+");
                for(String x : arr){
                    tmp += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
                }
                this.name = tmp.trim();
        }

        public void setClasss(String classs){
            this.classs = classs;
        }

        public void setDob(String s) throws ParseException {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            this.dob = sdf.format(sdf.parse(s));
        }

        public void setGpa(float gpa){
            this.gpa = String.format("%.2f", gpa);
        }

        public String toString(){
            return id + " " + name + " " + classs + " " + dob + " " + gpa;
        }
    }

    public class J05004_DanhSachDoiTuongSinhVien2 {

        public static void main(String[] args) throws ParseException{
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(); sc.nextLine();
            for(int i = 0; i < n; i++){
                Student st = new Student();
                st.setId(i + 1);
                String name = sc.nextLine();
                st.setName(name);
                st.setClasss(sc.nextLine());
                st.setDob(sc.nextLine());
                st.setGpa(Float.parseFloat(sc.nextLine()));
                System.out.println(st);
            }
        }
    }