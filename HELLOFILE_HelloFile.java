import java.io.File;
import java.util.Scanner;
public class HELLOFILE_HelloFile {
    public static void main(String[] args) {
        File inp = new File("Hello.txt");
        Scanner sc = new Scanner(inp);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
