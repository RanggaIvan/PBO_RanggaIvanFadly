import java.io.*;

public class InputStream {
    public static void main(String[] args) throws IOException {
        String kata = "";
        boolean akhir = false;
        int huruf;

        System.out.print("Masukkan kata: ");

        while (!akhir) {
            huruf = System.in.read();
            if (huruf == 10) {
                akhir = true;
            } else {
                kata += (char) huruf;
            }
        }

        System.out.println("Kalimat yang anda ketikan = " + kata);

    }
}
