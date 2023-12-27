import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Clb{
    private String id, name;
    private int ticketPrice;

    public Clb(String id, String name, int ticketPrice) {
        this.id = id;
        this.name = name;
        this.ticketPrice = ticketPrice;
    }

    public String getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }
}

class Match implements Comparable<Match>{
    private String id;
    private int people, income;
    private Clb clb;
    public Match(String id, int people) {
        this.id = id;
        this.people = people;
    }

    public void setClb(Clb clb){
        this.clb = clb;
        this.income = people * clb.getTicketPrice();
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString(){
        return id + " " + clb.getName() + " " + income;
    }

    @Override
    public int compareTo(Match o){
        if(this.income == o.income) return this.clb.getName().compareTo(o.clb.getName());
        else return o.income - this.income;
    }
    
}
public class J05070_CauLacBoBongDa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Clb> map = new HashMap<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            sc.nextLine();
            Clb clb = new Clb(sc.nextLine(), sc.nextLine(), sc.nextInt());
            map.put(clb.getId(), clb);
        }
        int m = sc.nextInt();
        Match[] a = new Match[m];
        for(int i = 0; i < m; i++){
            sc.nextLine();
            a[i] = new Match(sc.next(), sc.nextInt());
            a[i].setClb(map.get(a[i].getId().substring(1, 3)));
        }
        Arrays.sort(a);
        for(Match x : a) System.out.println(x);
    }
    
}