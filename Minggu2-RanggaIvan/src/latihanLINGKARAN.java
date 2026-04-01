import java.util.Scanner;
public class latihanLINGKARAN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double jari, luas, keliling;
        double phi = 3.14;
        System.out.print("Masukan Jari-jari Lingkaran : ");
        jari = input.nextDouble();

        System.out.println("Hasil Perhitungan");
        luas = phi * jari * jari;
        keliling = 2 * phi * jari;
        System.out.println("Luas Lingkaran : " + luas);
        System.out.println("Keliling Lingkaran : " + keliling);
    }
}
