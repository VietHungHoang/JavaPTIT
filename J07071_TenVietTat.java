import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Name implements Comparable<Name>{
    private String name;
    private ArrayList<String> a;

    public Name(String name) {
        this.name = name;
        getShortName();
    }

    public void getShortName(){
        a = new ArrayList<>();
        String[] arr = name.toUpperCase().trim().split("\\s+");
        for(String x : arr) x = String.valueOf(x.charAt(0));
        
        for(int i = 0; i < arr.length; i++){
            String tmp = "";
            for(int j = 0; j < arr.length; j++){
                if(i != j) tmp += arr[j].charAt(0) + ".";
                else tmp += "*.";
            }
            a.add(tmp.substring(0, tmp.length() - 1));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getArr() {
        return a;
    }

    public int compareTo(Name other){
        String[] arr1 = name.toUpperCase().trim().split("\\s+");
        String[] arr2 = other.name.toUpperCase().trim().split("\\s+");
        int n = arr1.length, m = arr2.length;
        if(arr1[n - 1].equals(arr2[m - 1])) return arr1[0].compareTo(arr2[0]);
        return arr1[n - 1].compareTo(arr2[m - 1]);
    }
}

public class J07071_TenVietTat{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = sc.nextInt(); sc.nextLine();
        Name[] a = new Name[n];        
        for(int i = 0; i < n; i++) a[i] = new Name(sc.nextLine());
        Arrays.sort(a);
        int q = sc.nextInt(); 
        while(q-- > 0){
            String s = sc.next();
            for(Name x : a)
                for (String y : x.getArr())
                    if(y.equals(s)) System.out.println(x.getName());
            }
    }
}