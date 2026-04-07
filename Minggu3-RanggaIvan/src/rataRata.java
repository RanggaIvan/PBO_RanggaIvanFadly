import java.util.*;
public class rataRata {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String nama;
        int nilai1, nilai2, nilai3;
        double rataRata;
        String hadiah;

        System.out.print("Masukkan nama siswa: ");
        nama = in.nextLine();
        System.out.print("Masukkan nilai 1: ");
        nilai1 = in.nextInt();
        System.out.print("Masukkan nilai 2: ");
        nilai2 = in.nextInt();
        System.out.print("Masukkan nilai 3: ");
        nilai3 = in.nextInt();

        rataRata = (nilai1 + nilai2 + nilai3) /3;
        if (rataRata >= 85){
            hadiah = "Seperangkat komputer P4";
        }else if(rataRata >= 70){
            hadiah = "Seperangkat uang sebesar Rp. 500.000";
        }else {
            hadiah = " hadiah hiburan";
        }
        System.out.println("Siswa yang bernama " + nama + " dari hasil perlombaan yang diikutinya dan berhak mendapatkan hadiah " + hadiah);
    }
}
