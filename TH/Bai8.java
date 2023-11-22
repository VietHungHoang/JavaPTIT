import java.io.File;
import java.rmi.server.UID;
import java.util.HashMap;
import java.util.Scanner;

class User{
    private String user, pass;

    public User(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User [user=" + user + ", pass=" + pass + "]";
    }
    
}

public class Bai8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<User, Integer> map = new HashMap<>();
        int n = sc.nextInt(); sc.nextLine();
        User[] a = new User[n];
        for(int i = 0; i < n; i++){
            a[i] = new User(sc.next(), sc.next());
            map.put(a[i], 0);
        }
        int q = sc.nextInt(); sc.nextLine();
        while(q-- > 0){
            String x = sc.next(), y = sc.next();
            for(int i = 0; i < n; i++)
                if(a[i].getUser().equals(x) && a[i].getPass().equals(y))
                        map.put(a[i], map.get(a[i]) + 1);
        }
        for(int i = 0; i < n; i++)
            System.out.print(map.get(a[i]) + " ");

    }
}