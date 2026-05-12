import java.util.Scanner;
public class Latihan_uts1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("RUMAH MAKAN SELASIH");
        System.out.println("==================================");
        System.out.println("kode        Jenis           Harga");
        System.out.println("R           Rendang         25000");
        System.out.println("A           Ayam Pop        22000");
        System.out.println("D           Dendeng         28000");
        System.out.println("k           Kalio           24000");
        System.out.println("T           Teh Tarik       4000");
        System.out.println("E           Es Teh Manis    10000");
        System.out.println("==================================");

        System.out.print("Banyak Jenis = ");
        int jumlah = scanner.nextInt();
        scanner.nextLine();

        String [] kode = new String[jumlah];
        int [] banyak = new int[jumlah];
        String [] jenis = new String[jumlah];
        int [] harga = new int[jumlah];
        int [] hargaAwal = new int[jumlah];
        int totalsebelumPajak = 0;
        double diskon, pajak, totalBayar;
        
        for(int i = 0; i < jumlah; i++){
            System.out.print("Jenis Ke " + (i+1) + "= ");
            kode[i] = scanner.nextLine();

            System.out.print("Banyak = ");
            banyak[i] = scanner.nextInt();
            scanner.nextLine();

            if(kode[i].equals("R")){
                jenis[i] = "Rendang";
                harga[i ]= 25000;  
                hargaAwal[i] = harga[i] * banyak[i];
            }else if(kode[i].equals("A")){
                jenis[i] = "Ayam Pop";
                harga[i ]= 22000;  
                hargaAwal[i] = harga[i] * banyak[i];
            }else if(kode[i].equals("D")){
                jenis[i] = "Dendeng";
                harga[i ]= 28000;  
                hargaAwal[i] = harga[i] * banyak[i];
            }else if(kode[i].equals("K")){
                jenis[i] = "Kalio";
                harga[i ]= 24000;  
                hargaAwal[i] = harga[i] * banyak[i];
            }else if(kode[i].equals("T")){
                jenis[i] = "Teh Tarik";
                harga[i ]= 4000;  
                hargaAwal[i] = harga[i] * banyak[i];
            }else if(kode[i].equals("E")){
                jenis[i] = "Es Teh Tarik";
                harga[i ]= 10000;  
                hargaAwal[i] = harga[i] * banyak[i];
            }else{
                System.out.println("Kode yang di masukkan salah");
            }

            totalsebelumPajak += hargaAwal[i];
        }

        if(totalsebelumPajak >= 100000){
           diskon = totalsebelumPajak * 0.05;
        }else{
           diskon = 0;
        }
        
       pajak = totalsebelumPajak * 0.10;
       totalBayar = totalsebelumPajak - diskon + pajak;
        System.out.println("RUMAH MAKAN SELASIH");
        System.out.println("===============================");
        System.out.println("No.     Jenis           Harga       Banyak      jumlah");
        for(int i = 0; i < jumlah; i++){
            System.out.println((i+1 + "     " + jenis[i] + "           " + harga[i] + "       " + banyak[i] + "      " + hargaAwal[i]));

        }
        System.out.println("========================================================");
        System.out.println("Total Sebelum Pajak = " + totalsebelumPajak);
        System.out.println("Diskon = " + diskon);
        System.out.println("Pajak = " + pajak);
        System.out.println("Total Bayar = " + totalBayar);

    }
}
