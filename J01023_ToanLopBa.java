import java.util.ArrayList;
import java.util.Scanner;

public class J01023_ToanLopBa {

    public static void gene(String a, ArrayList<Integer> arr){
        if(a.equals("??")){
            for(int i = 10;i < 100; i++) arr.add(i);
        }
        else if (a.charAt(0) == '?'){
            for(int i = 1; i < 10; i++) arr.add(i * 10 + a.charAt(1) - 48);
        }
        else if (a.charAt(1) == '?')for(int i = 0; i < 10; i++) arr.add((a.charAt(0) - 48) * 10 + i);
        else arr.add(Integer.parseInt(a));
    }

    public static boolean cal(int a, int b, int c, char opr){
        if(opr == '+') return a + b == c;
        else if(opr == '-') return a - b == c;
        else return a + b == c || a - b == c;
    }

    public static boolean solve(String s){
        String a = s.substring(0, 2), b = s.substring(5, 7), c = s.substring(10);
        char opr = s.charAt(3);
        if(opr == '*' || opr == '/') return false;
        ArrayList<Integer> arrA = new ArrayList<>();
        ArrayList<Integer> arrB = new ArrayList<>();
        ArrayList<Integer> arrC = new ArrayList<>();
        gene(a, arrA);
        gene(b, arrB);
        gene(c, arrC);
        for(int i = 0; i < arrA.size(); i++)
            for(int j = 0; j < arrB.size(); j++)
                for(int k = 0; k < arrC.size(); k++){
                    if(cal(arrA.get(i), arrB.get(j), arrC.get(k), opr)){
                        if(opr == '?'){
                            if(arrA.get(i) + arrB.get(j) == arrC.get(k)) opr = '+';
                            else opr = '-';
                        }
                        System.out.println(arrA.get(i) + " " + opr + " " + arrB.get(j) + " = " + arrC.get(k));
                        return true;
                    }
                }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            if(!solve(sc.nextLine())) System.out.println("WRONG PROBLEM!");
        }
    }
}
