import java.io.*;
import java.util.*;

class User{
    private String username, password;
    private int loginSuccess;
    public User(String inp){
        String[] tmp = inp.split("\\s+");
        this.username = tmp[0];
        this.password = tmp[1];
        this.loginSuccess = 0;
    }
    public void addLoginSuccess(){
        this.loginSuccess += 1;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public int getLoginSuccess() {
        return loginSuccess;
    }
    
    

}

public class TH_LopUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        User[] a = new User[n];       
        for(int i = 0; i < n; i++) a[i] = new User(sc.nextLine());
        int m = sc.nextInt(); sc.nextLine();
        for(int i = 0;i < m; i++){
            String[] tmp = sc.nextLine().split("\\s+");
            String username = tmp[0], password = tmp[1];
            for(User j : a)
                if(username.equals(j.getUsername()) && password.equals(j.getPassword())){
                    j.addLoginSuccess();
                    break;
                }
        }
        for(User x : a) System.out.print(x.getLoginSuccess() + " ");
    }    
}