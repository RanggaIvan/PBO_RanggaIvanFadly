import java.util.Scanner;
public class latihan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Hitung Honor Karyawan Kontrak PT. EASY");
        System.out.println("================================================");
        System.out.print("Masukkan jumlah karyawan = ");
        int jumlah = scanner.nextInt();
        scanner.nextLine();

        String [] nama = new String[jumlah];
        int [] golongan = new int[jumlah];
        int [] pendidikan = new int[jumlah];
        int [] lembur = new int[jumlah];
        int [] jamKerja = new int[jumlah];
        double [] tunjanganJabatan = new double[jumlah];
        double[] totalGaji = new double[jumlah];
        double honorTetap = 700000;
        double[] tunjanganPendidikan = new double[jumlah];
        double [] honorLembur = new double[jumlah];
        double totalSemuaGaji = 0;

        for(int i = 0; i < jumlah; i++){
            System.out.println("Karyawan ke - " + (i+1));

            System.out.print("Nama Karyawan = ");
            nama[i] = scanner.nextLine();

            
            System.out.print("Jumlah jam kerja = ");
            jamKerja[i] = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Golongan 1/2/3 = ");
            golongan[i] = scanner.nextInt();
            scanner.nextLine();

            if(golongan[i] == 1){
                tunjanganJabatan[i] = honorTetap * 0.05;
            }else if(golongan[i] == 2){
                tunjanganJabatan[i] = honorTetap * 0.1;
            }else if(golongan[i] == 3){
                tunjanganJabatan[i] = honorTetap * 0.15;
            }else{
                tunjanganJabatan[i] = 0;
            }

            System.out.print("Pendidikan 1=SMU/2=D3/3=S1 = ");
            pendidikan[i] = scanner.nextInt();
            scanner.nextLine();

            if(pendidikan[i] == 1){
                tunjanganPendidikan[i] = honorTetap * 0.025;
            }else if(pendidikan[i] == 2){
                tunjanganPendidikan[i] = honorTetap * 0.5;
            }else if(pendidikan[i] == 3){
                tunjanganPendidikan[i] = honorTetap * 0.075;
            }else{
                tunjanganPendidikan[i] = 0;
            }

            if(jamKerja[i] > 240){
                lembur[i] = jamKerja[i] - 240;
                honorLembur[i] = lembur[i] * 2500;
            }else{
                honorLembur[i] = 0;
            }

            totalGaji[i] = tunjanganJabatan[i] + tunjanganPendidikan[i] + honorLembur[i] + honorTetap;
        }
       System.out.println("\nPT EASY");
System.out.println("==============================================================================================");

System.out.printf("%-3s %-20s %-20s %-22s %-15s %-15s\n",
        "No", "Nama Karyawan", "Tunjangan Jabatan",
        "Tunjangan Pendidikan", "Honor Lembur", "Gaji Bersih");

System.out.println("==============================================================================================");

for(int i = 0; i < jumlah; i++){
    System.out.printf("%-3d %-20s %-20.0f %-22.0f %-15.0f %-15.0f\n",
            (i+1),
            nama[i],
            tunjanganJabatan[i],
            tunjanganPendidikan[i],
            honorLembur[i],
            totalGaji[i]);

    totalSemuaGaji += totalGaji[i];
}

System.out.println("==============================================================================================");
System.out.printf("Total Semua Gaji = Rp %.0f\n", totalSemuaGaji);
    }
}
