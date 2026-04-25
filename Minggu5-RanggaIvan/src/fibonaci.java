import java.util.*;

public class fibonaci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 8;
        int a = 1, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a);

            if (i < n) {
                System.out.print(", ");
            }

            int next = a + b;
            a = b;
            b = next;
        }
    }
}
