import java.util.*;
public class latihan_totalPembayaran {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        char jenis_susu;
        int ukuran;
        int jumlah_beli = 0;
        float harga_satuan = 0, total_harga;

        System.out.println("TOKO KELONTONG KERONCONGAN");
        System.out.println("==============================");
        System.out.println("A. Susu Dancow");
        System.out.println("    1. Ukuran Kecil");
        System.out.println("    2. Ukuran Sedang");
        System.out.println("    3. Ukuran Besar");
        System.out.println("B. Susu Bendera");
        System.out.println("    1. Ukuran Kecil");
        System.out.println("    2. Ukuran Sedang");
        System.out.println("    3. Ukuran Besar");
        System.out.println("C. Susu SGM");
        System.out.println("    1. Ukuran Kecil");
        System.out.println("    2. Ukuran Sedang");
        System.out.println("    3. Ukuran Besar");
        System.out.println("==============================");
        System.out.print("Masukkan jenis susu yang ingin dibeli (Dancow | Bendera | SGM): ");
        jenis_susu = in.next().charAt(0);
        System.out.print("Masukkan ukuran susu yang ingin dibeli (Kecil | Sedang  | Besar): ");
        ukuran = in.nextInt();  

            if(jenis_susu == 'A' || jenis_susu == 'a'){
                if(ukuran == 1){
                    harga_satuan = 15000;
                }else if(ukuran == 2){
                    harga_satuan = 20000;
                }else if(ukuran == 3){
                    harga_satuan = 25000;
                }
            }else if(jenis_susu == 'B' || jenis_susu == 'b'){
                if(ukuran == 1){
                    harga_satuan = 13500;
                }else if(ukuran == 2){
                    harga_satuan = 17500;
                }else if(ukuran == 3){
                    harga_satuan = 20000;
                }
            }else if(jenis_susu == 'C' || jenis_susu == 'c'){
                if(ukuran == 1){
                    harga_satuan = 15000;
                }else if(ukuran == 2){
                    harga_satuan = 18500;
                }else if(ukuran == 3){
                    harga_satuan = 22000;
                }
            }else{
                System.out.println("Jenis susu tidak valid");
            }
            System.out.println("Harga Satuan Barang Rp. " + harga_satuan);
            System.out.print("Jumlah Yang dibeli: ");
            jumlah_beli = in.nextInt();
            total_harga = harga_satuan * jumlah_beli;
            System.out.println("Harga Yang Harus dibayar Sebesar Rp. " + total_harga);
        }
    }