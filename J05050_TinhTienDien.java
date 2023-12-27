import java.util.Scanner;
// Bài toán tính tiền thì số tiền phải làm tròn lên
class Customer{
    private String id;
    private int factor, money, bonus, totalMoney;

    public Customer(int id, String type, int oldIndex, int newIndex) {
        this.id = String.format("KH%02d", id);
        this.factor = getFactor(type);
        this.money = (newIndex - oldIndex) * factor * 550;
        this.bonus = getBonus(oldIndex, newIndex);
        this.totalMoney = money + bonus;
    }

    public int getFactor(String type){
        if(type.equals("KD")) return 3;
        else if(type.equals("NN")) return 5;
        else if(type.equals("TT")) return 4;
        else return 2;
    }

    public int getBonus(int oldIndex, int newIndex){
        int tmp = newIndex - oldIndex;
        if(tmp > 100) return money;
        else if(tmp >= 50) return (int)Math.ceil(money * 0.35);
        else return 0;
    }

    @Override
    public String toString() {
        return id + " " + factor + " " + money + " " + bonus + " " + totalMoney;
    }

}

public class J05050_TinhTienDien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i  = 0; i < n; i++)
            System.out.println(new Customer(i + 1, sc.next(), sc.nextInt(), sc.nextInt()));
    }
}
