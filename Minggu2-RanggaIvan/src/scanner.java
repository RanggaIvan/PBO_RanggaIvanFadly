import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s1, s2;
        System.out.print("Masukan String Pertama : ");
        s1 = input.nextLine();

        System.out.print("Masukan String Kedua : ");
        s2 = input.nextLine();
        System.out.println("\nHasil Input String " + s1 + " " + s2);
    }
}
