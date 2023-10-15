package J04003_PhanSo;

import java.util.Scanner;

/**;
 *
 * @author VietHungHoang
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction frac = new Fraction(sc.nextLong(), sc.nextLong());
        System.out.print(frac.simplify());
    }
}
