import java.util.Scanner;
public class latihan_uts2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("PROGRAM HITUNG NILAI AKHIR");
        System.out.println("ENGLISH CENTRE");
        System.out.println();

        System.out.print("Masukkan jumlah mahasiswa = ");
        int jumlah = scanner.nextInt();
        scanner.nextLine();

        String [] nama = new String[jumlah];
        int [] kehadiran = new int[jumlah];
        double [] fkehadiran = new double[jumlah];
        int [] assg = new int[jumlah];
        double [] fassg = new double[jumlah];
        int [] mid = new int[jumlah];
        double [] fmid = new double[jumlah];
        int [] last = new int[jumlah];
        double [] flast = new double[jumlah];
        double [] fnilai = new double[jumlah];
        String [] grade = new String[jumlah];
        String [] keterangan = new String[jumlah];
        int lulus = 0;

        for(int i = 0; i < jumlah; i++){
            System.out.println("Siswa ke-" + (i+1));

            System.out.print("Nama Siswa = ");
            nama[i] = scanner.nextLine();

            System.out.print("Kehadiran (%) = ");
            kehadiran[i] = scanner.nextInt();
            scanner.nextLine();

            fkehadiran[i] = kehadiran[i] * 0.2;

            System.out.print("Assigment = ");
            assg[i] = scanner.nextInt();
            scanner.nextLine();

            fassg[i] = assg[i] * 0.3;

            System.out.print("Mid Test = ");
            mid[i] = scanner.nextInt();
            scanner.nextLine();

            fmid[i] = mid[i] * 0.25;

            System.out.print("Final Test = ");
            last[i] = scanner.nextInt();
            scanner.nextLine();     
            
            flast[i] = last[i] * 0.25;

            fnilai[i] = fkehadiran[i] + fassg[i] + fmid[i] + flast[i];

            if (fnilai[i] >= 85) {
                grade[i] = "A";
                keterangan[i] = "Lulus";
            }else if(fnilai[i] >= 75){
                grade[i] = "B";
                keterangan[i] = "Lulus";
            }else if(fnilai[i] >= 65){
                grade[i] = "C";
                keterangan[i] = "Lulus";
            }else if(fnilai[i] >= 55){
                grade[i] = "D";
                keterangan[i] = "Tidak Lulus";
            }else if(fnilai[i] < 55){
                grade[i] = "E";
                keterangan[i] = "Tidak Lulus";
            }else{
                System.out.println("REMED");
            }

            if(grade[i].equals("A") || grade[i].equals("B") || grade[i].equals("C")){
                lulus++;
            }

        }

        System.out.println("DAFTAR NILAI SISWA ENGLISH CENTRE");
        System.out.println("No.     Nama Siswa        Kehadiran       Assg        Mid        Final       Akhir       Grade");
        System.out.println("==============================================================================================");

        for(int i = 0; i < jumlah; i++){
            System.out.println((i+1) + "           " +
            nama[i] + "        " + 
            kehadiran[i] + "       " + 
            assg[i] + "        " + 
            mid[i] + "        " + 
            last[i] + "       " + 
            fnilai[i] + "       " + 
            grade[i]);
        }

        System.out.println("==============================================================================================");
        System.out.println("Total Siswa Lulus = " + lulus);

    }
}
