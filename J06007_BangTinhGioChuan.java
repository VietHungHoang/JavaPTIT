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

    public class J06007_BangTinhGioChuan {
        public static void main(String[] args) throws FileNotFoundException {

            Scanner sc = new Scanner(System.in);
            int n = Integer.parseInt(sc.nextLine());
            for(int i = 0; i < n; i++) sc.nextLine();
            LinkedHashMap<String, Lecture> lectures = new LinkedHashMap<>();
            int m = Integer.parseInt(sc.nextLine());
            for(int i = 0; i < m; i++){
                Lecture tmp = new Lecture(sc.nextLine());
                lectures.put(tmp.getId(), tmp);
            }
            int k = Integer.parseInt(sc.nextLine());
            for(int i = 0; i < k ;i++){
                String a = sc.next(), b = sc.next();
                float c = Float.parseFloat(sc.next());
                lectures.get(a).setTotalTime(lectures.get(a).getTotalTime() + c);
            }
            for(Map.Entry<String, Lecture> entry : lectures.entrySet())
                System.out.println(entry.getValue());
        }
    }