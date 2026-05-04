public class App {
    public static void main(String[] args) throws Exception {
         int n = 5;
         for (int a = 1; a <= n; a++) {
            for (int b = a; b < n; b++) {
                System.out.print(" ");
            }
            for(int c = 1; c <= (2*a-1); c++){
                System.out.print("*");
            }
            System.out.println();
}
} }

