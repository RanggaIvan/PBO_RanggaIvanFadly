import java.util.Scanner;
public class latihan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int jumlah;
        System.out.print("Masukkan jumlah mahasiswa = ");
        jumlah = scanner.nextInt();
        scanner.nextLine();

        String [] nama = new String[jumlah];
        double [] nilaiTugas = new double[jumlah];
        double [] nilaiUts = new double[jumlah];
        double [] nilaiUas = new double[jumlah];
        double [] nilaiAkhir = new double[jumlah];
        String [] grade = new String[jumlah];

        for(int i = 0; i < jumlah; i++){
            System.out.println("Mahasiswa Ke-" + (i+1));

            System.out.print("Nama Mahasiswa = ");
            nama[i] = scanner.nextLine();

            System.out.print("Nilai Tugas = ");
            nilaiTugas[i] = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Nilai Uts = ");
            nilaiUts[i] = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Nilai Uas = ");
            nilaiUas[i] = scanner.nextDouble();
            scanner.nextLine();

            
            nilaiAkhir[i] = (nilaiTugas[i] * 0.3) + (nilaiUts[i] * 0.3) + (nilaiUas[i] * 0.3);

            if(nilaiAkhir[i] >= 80){
                grade[i] = "A";
            }else if(nilaiAkhir[i] >= 70){
                grade[i] = "B";
            }else if(nilaiAkhir[i] >= 59){
                grade[i] = "C";
            }else if(nilaiAkhir[i] >= 50){
                grade[i] = "D";
            }else{
                grade[i] = "E";
            }
        }
        System.out.println("No.     Nama_Mahasiswa      Tugas       Uts     Uas     Nilai_AKhir     Grade");
        System.out.println("===============================================================================");

        for(int i = 0; i < jumlah; i++){
            System.out.println((i+1) + "      " + nama[i] + "            " + nilaiTugas[i] + "              " + nilaiUts[i] + "         " + nilaiUas[i] + "              " + nilaiAkhir[i] + "                 " + grade[i] + "          ");
        }
    }
}
