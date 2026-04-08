import java.util.*;
public class latihan_nilaiKursus {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String nama;
        int nilaiKeaktifan, nilaiTugas, nilaiUjian;
        double nilai_murniKeaktifan, nilai_murniTugas, nilai_murniUjian, nilaiAkhir;
        String grade;

        System.out.println("PROGRAM MENGHITUNG NILAI AKHIR KURSUS");
        System.out.print("Nama Siswa: ");
        nama = in.nextLine();

        System.out.print("Nilai keaktifan: ");
        nilaiKeaktifan = in.nextInt();
        System.out.print("Nilai tugas: ");
        nilaiTugas = in.nextInt();
        System.out.print("Nilai ujian: ");
        nilaiUjian = in.nextInt();

        nilai_murniKeaktifan = nilaiKeaktifan * 0.2;
        nilai_murniTugas = nilaiTugas * 0.3;
        nilai_murniUjian = nilaiUjian * 0.5;
        nilaiAkhir = nilai_murniKeaktifan + nilai_murniTugas + nilai_murniUjian;

        if(nilaiAkhir >= 80){
            grade = "A";
        }else if(nilaiAkhir >= 70){
            grade = "B";
        }else if(nilaiAkhir >= 59){ 
            grade = "C";
        }else if(nilaiAkhir >= 50){
            grade = "D";
        }else{
            grade = "E";
        }
        
        System.out.println("Siswa yang bernama " + nama);
        System.out.println("Dengan Nilai Persentasi Yang dihasilkan.");
        System.out.println("Nilai Keaktifan * 20% = " + nilai_murniKeaktifan);
        System.out.println("Nilai Tugas * 30% = " + nilai_murniTugas);
        System.out.println("Nilai Ujian * 50% = " + nilai_murniUjian);
        System.out.println("Jadi Siswa yang bernama " + nama + " memperoleh nilai akhir sebesar " + nilaiAkhir + " Grade nilai yang didapat adalah " + grade);
    }
}