import java.util.Scanner;
public class latihanCELCIUS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double celcius, fahrenehit, reamor;

        System.out.print("Masukan Suhu Dalam Celcius : ");
        celcius = input.nextDouble();

        fahrenehit = (celcius * 9/5) + 32;
        reamor = celcius * 4/5;
        System.out.println("Hasil Konversi");
        System.out.println("Suhu Dalam Fahrenehit : " + fahrenehit);
        System.out.println("Suhu Dalam Reamor : " + reamor);
    }
}
