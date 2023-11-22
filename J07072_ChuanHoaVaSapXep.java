import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J07072_ChuanHoaVaSapXep {

    public static String stdName(String s){
        String[] a = s.toLowerCase().trim().split("\\s+");
        String tmp = "";
        for(String x : a){
            StringBuilder sb = new StringBuilder(x);
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            tmp += sb.toString() + " ";
        }
        return tmp.trim();

    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<String> a = new ArrayList<>();
        while(sc.hasNext()) a.add(stdName(sc.nextLine()));
        a.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] a = o1.toLowerCase().trim().split("\\s+");
                String[] b = o2.toLowerCase().trim().split("\\s+");
                if(a[a.length - 1].equals(b[b.length - 1])) return o1.compareTo(o2);
                return a[a.length - 1].compareTo(b[b.length - 1]);
            }
        });
        for(String x : a) System.out.println(x);
    }
}
