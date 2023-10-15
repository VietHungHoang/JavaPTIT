import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J07008_DayConTangDan {

    public static ArrayList<String> arr = new ArrayList<>();
    public static int[] x = new int[25];
    public static int[] a = new int[25];
    public static int n;

    public static void saveResult(){
        ArrayList<Integer> tmp = new ArrayList<>();
        for(int i = 0; i < n; i++)
            if(x[i] == 1) tmp.add(a[i]);
        if(tmp.size() < 2) return;
        for(int i = 1; i < tmp.size(); i++)
            if(tmp.get(i) <= tmp.get(i - 1)) return;
        String res = "";
        for(int i = 0; i < tmp.size(); i++) res += tmp.get(i).toString() + " ";
        arr.add(res);
    }

    public static void Try(int i){
        for(int j = 0; j <= 1; j++){
            x[i] = j;
            if(i == n - 1) saveResult();
            else Try(i + 1);
        }
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = sc.nextInt();
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        Try(0);
        arr.sort(new Comparator<String>() {
            @Override
            public int compare(String a, String b){
                return a.compareTo(b);
            }
        });

        for(String x : arr) System.out.println(x);

    }
}
