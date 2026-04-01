import java.io.*;
public class reader {
    public static void main(String[] args) throws IOException {

        InputStreamReader keyReader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(keyReader);

        String s1, s2;
        System.out.print("Masukan String Pertama : ");
        s1 = input.readLine();

        System.out.print("Masukan String Kedua : ");
        s2 = input.readLine();
        System.out.println("\nHasil Input String " + s1 + " " + s2);

    }
}