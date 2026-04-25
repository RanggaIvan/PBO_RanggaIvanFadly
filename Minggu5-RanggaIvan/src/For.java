import java.util.*;
public class For {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);

       int a, total = 0;

        for (a = 1; a <= 20; a+=2) {
            System.out.println( a + " + ");
            total = total +  a;
        }
        System.out.println("Total: " + total);
    }
}
