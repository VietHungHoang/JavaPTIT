package J04008_ChuViTamGiac;
import java.util.Scanner;

/**
 *
 * @author VietHungHoang
 */
class Point {
    private double x, y;

    public Point(){
    }
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double distance(Point secondPoint){
        return Math.sqrt(Math.pow(this.x - secondPoint.x, 2) + Math.pow(this.y - secondPoint.y, 2));
    }
    
    public double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
}

public class main {
    public static boolean checkTriangle(Point p1, Point p2, Point p3){
        double a = p1.distance(p2), b = p2.distance(p3), c = p3.distance(p1);
        if (a + b > c && b + c > a && a + c > b) return true;
        return false;
    }
    public static String Parameter(Point p1, Point p2, Point p3){
        double p = p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
        return String.format("%.3f", p);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(), sc.nextDouble());
            System.out.println(checkTriangle(p1, p2, p3) ? Parameter(p1, p2, p3) : "INVALID");
        }
    }
}

