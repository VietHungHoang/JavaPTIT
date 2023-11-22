import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Mathang{
    private String ma, ten, gia, baohanh;

    public Mathang(String ma, String ten, String gia, String baohanh) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.baohanh = baohanh;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getBaohanh() {
        return baohanh;
    }

    public void setBaohanh(String baohanh) {
        this.baohanh = baohanh;
    }
    
}

class nguoi{
    private static int stt = 1;
    private String ma, ten, diachi, masanpham, soluong, ngaymmua, ngayhetbaohanh;
    private int tongtien;

    public nguoi( String ten, String diachi, String masanpham, String soluong, String ngaymmua) {
        this.ma = String.format("KH%03d", stt);
        this.ten = ten;
        this.diachi = diachi;
        this.masanpham = masanpham;
        this.soluong = soluong;
        this.ngaymmua = ngaymmua;
        stt++;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(String masanpham) {
        this.masanpham = masanpham;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public String getNgaymmua() {
        return ngaymmua;
    }

    public void setNgaymmua(String ngaymmua) {
        this.ngaymmua = ngaymmua;
    }

    public String getNgayhetbaohanh() {
        return ngayhetbaohanh;
    }

    public void setNgayhetbaohanh(String ngayhetbaohanh) {
        this.ngayhetbaohanh = ngayhetbaohanh;
    }

    

    public int getTongtien() {
        return tongtien;
    }

    public void setTongtien(int tongtien) {
        this.tongtien = tongtien;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + diachi + " " + masanpham + " " + tongtien + " " + ngayhetbaohanh;
    }

    

    
    
}

public class Bai14 {
    public static void main(String[] args)throws ParseException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        Mathang[] a = new Mathang[n];
        for(int i = 0; i < n; i++)
            a[i] = new Mathang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());

        int m = sc.nextInt();sc.nextLine();
        nguoi[] b = new nguoi[m];
        for(int i = 0; i < m; i++)
            b[i] = new nguoi(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        
        for(int i = 0;i < m; i++){
            for(int j = 0; j < n; j++)
                if(b[i].getMasanpham().equals(a[i].getMa())){
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    Date ngay = sdf.parse(b[i].getNgaymmua());
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(ngay);
                    calendar.add(Calendar.MONTH, Integer.parseInt(a[i].getBaohanh()));
                    Date ngaymoi = calendar.getTime();
                    b[i].setNgayhetbaohanh(sdf.format(ngaymoi));
                    b[i].setTongtien(Integer.parseInt(b[i].getSoluong()) * Integer.parseInt(a[i].getGia()));
                }
        }
        Arrays.sort(b, new Comparator<nguoi>() {
            @Override
            public int compare(nguoi o1, nguoi o2) {
                // TODO Auto-generated method stub
                DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate date1 = LocalDate.parse(o1.getNgayhetbaohanh(), d);
                LocalDate date2 = LocalDate.parse(o2.getNgayhetbaohanh(), d);
                if (date1.equals(date2)){
                    return o1.getMa().compareTo(o2.getMa());
                }
                else
                return date1.compareTo(date2);
            }
        });
        for(nguoi x : b) System.out.println(x);
        Collections.max();
    }
}
