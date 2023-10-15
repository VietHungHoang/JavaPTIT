package J04014_BonDiemTrenMatPhang;

import java.util.Scanner;

/**
 *
 * @author VietHungHoang
 */

class Point3D{
    private int x, y, z;

    public Point3D() {
    }
    

    public Point3D (int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public Point3D makeVector(Point3D other){
        return new Point3D(other.x - this.x, other.y - this.y, other.z - this.z);
    }
    
    public Point3D vectorProduct(Point3D other){
        return new Point3D(this.y * other.z - this.z * other.y, this.z * other.x - this.x * other.z, this.x * other.y - this.y * other.x);
    }
    
    public int crossProduct(Point3D other){
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }
    
    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4){
        Point3D tmp = p1.makeVector(p2).vectorProduct(p1.makeVector(p3));
        return tmp.crossProduct(p1.makeVector(p4)) == 0;
    }
}

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        if(Point3D.check(p1,p2,p3,p4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }
    }
}
