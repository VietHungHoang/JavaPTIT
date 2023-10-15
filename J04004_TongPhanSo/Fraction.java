package J04004_TongPhanSo;

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
    
    public void sumFraction(Fraction other){
        this.numerator = this.numerator * other.denominator + other.numerator * this.denominator;
        this.denominator = this.denominator * other.denominator;
    }
    public void simplify(){
        long GCD = gcd(this.numerator, this.denominator);
        this.numerator = this.numerator / GCD;
        this.denominator = this.denominator / GCD;
    }
    
    public String toString(){
        return this.numerator + "/" + this.denominator;
    }
}
