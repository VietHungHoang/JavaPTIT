import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Bai4 {

    public static boolean isValid (int n){
        if (n < 10) return false;
        String s = n + "";
        for(int i = 1; i < s.length(); i++)
            if(s.charAt(i) > s.charAt(i - 1)) return false;
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream ois1 = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA1.in")));
        ArrayList<Integer> a1 = (ArrayList<Integer>) ois1.readObject();
        int[] a = new int[100005];
        for(Integer x : a1)
            if (isValid(x)) a[x]++; 
        
        ObjectInputStream ois2 = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA2.in")));
        ArrayList<Integer> a2 = (ArrayList<Integer>) ois2.readObject();
        int[] b = new int[100005];
        for(Integer x : a2)
            if (a[x] > 0|| isValid(x)) b[x]++; 
        
        for(int i = 10; i < 100001; i++)
            if(a[i] > 0 && b[i] > 0)
                System.out.println(i + " " + a[i] + " " + b[i]);



    }
}