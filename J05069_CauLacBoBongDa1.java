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

class Match{
    private String id;
    private int people;
    private Clb clb;
    public Match(String id, int people) {
        this.id = id;
        this.people = people;
    }

    public void setClb(Clb clb){
        this.clb = clb;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString(){
        return id + " " + clb.getName() + " " + people * clb.getTicketPrice();
    }
    
}
public class J05069_CauLacBoBongDa1 {
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
        for(int i = 0; i < m; i++){
            sc.nextLine();
            Match match = new Match(sc.next(), sc.nextInt());
            match.setClb(map.get(match.getId().substring(1, 3)));
            System.out.println(match);
        }
    }
    
}