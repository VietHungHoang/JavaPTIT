import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class People implements Comparable<People>{
    private String name, dob;

    public People(String inp) {
        String[] tmp = inp.split("\\s+");
        this.name = tmp[0];
        this.dob = tmp[1];
    }

    public String getName(){
        return this.name;
    }

    @Override
    public int compareTo(People o){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d1 = LocalDate.parse(this.dob, dtf);
        LocalDate d2 = LocalDate.parse(o.dob, dtf);
        return d1.compareTo(d2);
    }
}

public class J05032_TreNhatGiaNhat {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        ArrayList<People> a = new ArrayList<>();
        for(int i = 0; i < n; i++) a.add(new People(sc.nextLine()));
        System.out.println(Collections.max(a).getName());
        System.out.println(Collections.min(a).getName());
     }
}
