public class J03035_DienChuSo {

    public static int cmp(String a, String b,int idx){
        while(a.charAt(idx) != '?' && (idx != -1 && idx != 100)){
            if(a.charAt(idx) > b.charAt(idx)) return 100;
            else if(a.charAt(idx) < b.charAt(idx)) return -1;
            idx++;
        }
        return idx;
    }

    public static long solve(String a, String b){
        long cnt = 0;
        for(int i = 0; i < a.length(); i++)
                if(a.charAt(i) == '?') cnt++;
        int tmp = cmp(a, b, 0);
        while(tmp == 0){
            
        }
        
        
            
    }
    public static void main(String[] args) {
        
    }
}
