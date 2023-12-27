import java.util.Scanner;

class Pair<T1, T2>{
    private T1 first;
    private T2 second;
    
    public Pair(T1 first, T2 second){
        this.first = first;
        this.second = second;
    }
    
    public boolean prime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++)
               if(n % i == 0) return false;
        return n > 1;
    }
    
    public boolean isPrime(){
        return this.prime((Integer)first) && this.prime((Integer)second);
    }
    
    public String toString(){
        return first + " " + second;
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}