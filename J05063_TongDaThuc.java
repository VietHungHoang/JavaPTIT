import java.util.Scanner;

class DaThuc{
    private String daThuc;

    public DaThuc(String daThuc) {
        this.daThuc = daThuc;
    }

    public void setDaThuc(String daThuc) {
        this.daThuc = daThuc;
    }

    public DaThuc cong(DaThuc o){
        String[] a = this.daThuc.split(" \\+ ");
        String[] b = o.daThuc.split(" \\+ ");
        int[] cnt = new int[10001];
        for(String x : a){
            String[] tmp = x.split("\\*x\\^");
            cnt[Integer.parseInt(tmp[1])] += Integer.parseInt(tmp[0]);
        }
        for(String x : b){
            String[] tmp = x.split("\\*x\\^");
            cnt[Integer.parseInt(tmp[1])] += Integer.parseInt(tmp[0]);
        }
        String res = "";
        for(int i = 10000; i >= 0;i--)
            if(cnt[i] != 0) res += cnt[i] + "*x^" + i + " + ";
        return new DaThuc(res.substring(0, res.length() - 3));
    }

    @Override
    public String toString() {
        return daThuc;
    }

}

public class J05063_TongDaThuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }
}
