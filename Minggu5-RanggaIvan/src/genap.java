import java.util.*;
public class genap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, total = 0;

        for (a = 2; a <= 20; a += 2) {
            if (a < 20) {
                System.out.print(a + " + ");
            } else {
                System.out.print(a);
            }
            total = total + a;
        }
        System.out.println(" = " + total);
    }
}