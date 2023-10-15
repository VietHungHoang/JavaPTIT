package J04002_KhaiBaoLopHinhChuNhat;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            Rectange rect = new Rectange(sc.nextDouble(), sc.nextDouble(), sc.next());
            if(rect.getWidth() > 0 && rect.getHeight() > 0)
                System.out.println(rect);
            else
                System.out.println("INVALID");
    }
}

