
import java.io.File;
import java.io.IOException;
import java.util.*;

class IntSet{
    private TreeSet<Integer> tree;

    public IntSet(){
        tree = new TreeSet<>();
    }

    public IntSet(int[] a){
        tree = new TreeSet<>();
        for(int x : a) tree.add(x);
    }

    public void addNumber(int x){
        tree.add(x);
    }

    public IntSet intersection(IntSet o){
        IntSet tmp = new IntSet();
        for(int x : this.tree)
            if(o.tree.contains(x))
                tmp.addNumber(x);
        return tmp;
    }

    public String toString(){
        String res = "";
        for(int x : tree)
            res += x + " ";
        return res.trim();
    }
}
public class J07009_LopIntSet2{
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(new File("DATA.in"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}