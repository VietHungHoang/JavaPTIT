package J04009_DienTichTamGiac;

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
    public static String triangleArea(Point a, Point b, Point c){
        double x = a.distance(b), y = b.distance(c), z = a.distance(c);
        double res = Math.sqrt(x + y + z) * Math.sqrt(x + y - z) * Math.sqrt(y + z - x) * Math.sqrt(z + x - y)/4;
        return String.format("%.2f", res);
    }
    
    public static boolean checkTriangle(Point p1, Point p2, Point p3){
        double a = p1.distance(p2), b = p2.distance(p3), c = p3.distance(p1);
        if (a + b > c && b + c > a && a + c > b) return true;
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());
            if(checkTriangle(a, b, c)) System.out.println(triangleArea(a, b, c));
            else System.out.println("INVALID");
        }
    }
    
}
