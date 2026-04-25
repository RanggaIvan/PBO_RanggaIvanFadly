import java.util.*;
public class DoWhile {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);

       int n;

        System.out.print("Masukkan jumlah bilangan: ");
        n = in.nextInt();
        do {
            System.out.println("nama ke-" +n);
            n++;
        } while (n <=3);
    }
}