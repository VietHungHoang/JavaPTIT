import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * bai2
 */
public class bai2 {

    public static void main(String[] args) throws IOException{
        Scanner nhap = new Scanner(new File("ONLINE.in"));
        int t = Integer.parseInt(nhap.nextLine());
        ArrayList<SV> list = new ArrayList<>();
        for(int i = 0; i < t ; i++){
            SV a = new SV(nhap.nextLine(), nhap.nextLine(), nhap.nextLine());
            list.add(a);
        }
        Collections.
        for(SV x : list){
            System.out.println(x);
    }
}

class SV{
    private String name;
    private String start;
    private String end;
    private long time;

    public SV(String name, String start, String end) {
        this.name = name;
        this.start = start;
        this.end = end;
        
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    try{
        Date starttime = dateFormat.parse(this.start);
        Date endtime = dateFormat.parse(this.end);
        long out =TimeUnit.MILLISECONDS.toMinutes(endtime.getTime() - starttime.getTime());
    } catch(parseException e){
        e.printStackTrace();
    }
    this.time = out;/

    @Override
    public String toString() {
        return name + " " + time;
    }
}