import java.util.Scanner;
public class SOAL_1 {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner (System.in);

       String jk, kategori;
       double tb, bb, bb_ideal = 0, selisih;

        System.out.print("Pilih Jenis Kelamin (L/P) = ");
        jk = scanner.nextLine();
        System.out.print("Masukkan Tinggi Badan (cm) = ");
        tb = scanner.nextDouble();
        scanner.nextLine();

        if(jk.equals("L")){
            bb_ideal = tb - 100;
            System.out.println("Berat Badan Ideal = " + bb_ideal + " kg");
        }else if(jk.equals("P")){
            bb_ideal = tb - 110;
            System.out.println("Berat Badan Ideal = " + bb_ideal + " kg");
        }else {
            System.out.println("Input jenis kelamin tidak valid");
        }

        System.out.print("Masukkan Berat Badan Anda (kg) = ");
        bb = scanner.nextDouble();
        scanner.nextLine();
        
        if (bb < bb_ideal) {
            selisih = bb_ideal - bb;
            kategori  = "Anda termasuk kedalam kategori kurus dan harus menambah berat badan sebanyak " + selisih + " kg";
        } else if (bb > bb_ideal) {
            selisih = bb - bb_ideal;
            kategori = "Anda termasuk kedalam kategori gemuk dan harus mengurangi berat badan sebanyak " + selisih + " kg";
        } else {
            kategori = "Berat Badan Ideal";
        }
        System.out.println(kategori);

        System.out.print("ingin menghitung lagi? (Y/N) ");
        String ulang = scanner.nextLine();
        if (ulang.equals("Y") || ulang.equals("y")) {
            main(args);
        } else {
            System.out.println("Terima kasih telah menggunakan program penghitung berat badan ideal.");
        }
    }
}
