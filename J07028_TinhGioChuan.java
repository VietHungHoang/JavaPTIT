    import java.io.File;
    import java.io.FileNotFoundException;
    import java.util.*;

    class Lecture{
        private String id, name;
        private float totalTime;

        public Lecture(String inp) {
            String[] arr = inp.trim().split("\\s+");
            this.id = arr[0];
            this.name = inp.trim().substring(arr[0].length());
            this.totalTime = 0f;
        }
        public String getId() {
            return id;
        }
        public float getTotalTime() {
            return totalTime;
        }
        public void setTotalTime(float totalTime){
            this.totalTime = totalTime;
        }
        @Override
        public String toString(){
            return name + " " + String.format("%.2f", totalTime);
        }
    }
    public class J07028_TinhGioChuan {
        public static void main(String[] args) throws FileNotFoundException {

            Scanner sc1 = new Scanner(new File("MONHOC.in"));
            while(sc1.hasNextLine()) sc1.nextLine();

            Scanner sc2 = new Scanner(new File("SINHVIEN.in"));
            LinkedHashMap<String, Lecture> lectures = new LinkedHashMap<>();
            int n = Integer.parseInt(sc2.nextLine());
            for(int i = 0; i < n; i++){
                Lecture tmp = new Lecture(sc2.nextLine());
                lectures.put(tmp.getId(), tmp);
            }
            Scanner sc3 = new Scanner(new File("BANGDIEM.in"));
            int k = Integer.parseInt(sc3.nextLine());
            for(int i = 0; i < k ;i++){
                String a = sc3.next(), b = sc3.next();
                float c = Float.parseFloat(sc3.next());
                lectures.get(a).setTotalTime(lectures.get(a).getTotalTime() + c);
            }
            for(Map.Entry<String, Lecture> entry : lectures.entrySet())
                System.out.println(entry.getValue());
        }
    }
