    import java.util.Arrays;
import java.util.Scanner;

    class Order implements Comparable<Order>{
        private String id, firmName;
        private long quantity, cost, tax, price;

        public Order(String id, int quantity) {
            this.id = id;
            this.quantity = quantity;
            this.firmName = getFirmName();
            getCostAndTax();
        }

        public String getFirmName(){
            if(id.endsWith("BP")) return "British Petro";
            else if(id.endsWith("ES")) return "Esso";
            else if(id.endsWith("SH")) return "Shell";
            else if(id.endsWith("CA")) return "Castrol";
            else if(id.endsWith("MO")) return "Mobil";
            else return "Trong Nuoc";
        }

        public void getCostAndTax(){
            if(id.startsWith("X")){
                this.cost = 128000;
                this.price = cost * quantity;
                this.tax =(long)(this.price * 0.03);
            }
            else if(id.startsWith("D")){
                this.cost = 11200;
                this.price = cost * quantity;
                this.tax =(long)(this.price * 0.035);
            }
            else{
                this.cost = 9700;
                this.price = cost * quantity;
                this.tax = (long)(this.price * 0.02);
            }
            if(id.endsWith("TN")) this.tax = 0;
        }

        @Override
        public String toString(){
            return id + " " + firmName + " " + cost + " " + tax + " " + (price + tax);
        }

        @Override
        public int compareTo(Order o){
            if(o.price + o.tax - this.price - this.tax > 0) return 1;
            else return -1;
        }

    }

    public class J05068_SapXepBangGiaXangDau {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Order[] a = new Order[n];
            for(int i = 0; i < n; i++)
                a[i] = new Order(sc.next(), Integer.parseInt(sc.next()));
            Arrays.sort(a);
            for(Order x : a) System.out.println(x);
        }
    }
