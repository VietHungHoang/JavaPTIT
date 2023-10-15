package J04003_PhanSo;

/**
 *
 * @author VietHungHoang
 */
public class Fraction {
    private long numerator, denominator;
    
    public long gcd(long a, long b){
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public Fraction(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    
    public String simplify(){
        long GCD = gcd(this.numerator, this.denominator);
        return this.numerator/GCD + "/" + this.denominator/GCD;
    }
}
