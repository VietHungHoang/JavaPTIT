package J04004_TongPhanSo;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction p = new Fraction(sc.nextLong(), sc.nextLong());
        Fraction q = new Fraction(sc.nextLong(), sc.nextLong());
        p.sumFraction(q);
        p.simplify();
        System.out.println(p);
    }
}
