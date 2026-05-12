import java.util.Scanner;
public class latihan2 {
     public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        String[] kode = new String[100];
        String[] jenis = new String[100];
        int[] harga = new int[100];
        int[] banyak = new int[100];
        int[] total = new int[100];

        System.out.println(" Kode         Jenis        Harga");
        System.out.println("====================================");
        System.out.println(" D            Dada         Rp. 2500");
        System.out.println(" P            Paha         Rp. 2000");
        System.out.println(" S            Sayap        Rp. 1500");
        System.out.println("====================================");

        System.out.print("Masukkan jumlah jenis ayam yang ingin dibeli : ");
        int jumlah = scanner.nextInt();

        for(int i = 0; i < jumlah; i++){
        System.out.println("Jenis ayam ke " + (i+1)); 
        System.out.print("Masukkan kode ayam : ");
        kode[i] = scanner.next();

        System.out.println("Masukkan banyak ayam : ");
        banyak[i] = scanner.nextInt();

        if(kode[i].equals("D")){
            jenis[i] = "Dada";
            harga[i] = 2500;
        } else if(kode[i].equals("P")){
            jenis[i] = "Paha";
            harga[i] = 2000;
        } else if(kode[i].equals("S")   ){
            jenis[i] = "Sayap";
            harga[i] = 1500;
        } else {
            System.out.println("Kode yang dimasukkan salah");
        }

        total[i] = harga[i] * banyak[i];
        }

        int totalBayar = 0;
        System.out.println("No.  JenisPotong   HargaSatuan   BanyakBeli  JumlahHarga");
        for(int i = 0; i < jumlah; i++){
            System.out.println((i+1) + "    " + jenis[i] + "          " + harga[i] + "          " + banyak[i] + "          " + total[i]);
            totalBayar += total[i];
        }
        double pajak = totalBayar * 0.1;
        double jumlahBayar = totalBayar + pajak;

        System.out.println("Total Bayar : " + totalBayar);
        System.out.println("Pajak (10%) : " + pajak);
        System.out.println("Jumlah Bayar : " + jumlahBayar);

     }

}
