import java.util.*;
public class switchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char pilih;
        String prodi;
        System.out.print("Masukkan pilihan (a/b/c): ");
        pilih = in.next().charAt(0);
        switch(pilih){
            case'a':
                prodi = "Teknik Informatika";
                break;
            case 'b':
                prodi = "Sistem Informasi";
                break;
            case 'c':
                prodi = "Teknik Komputer";
                break;
            default:
                prodi = "Pilihan tidak valid";
        }
       System.out.println("Anda memilih prodi " + prodi);
    }
}
