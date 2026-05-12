import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // int [] bilangan = {1, 2, 3, 4, 5};
        
        int elemen = 0;
        System.out.println("Masukkan jumlah elemen array : ");
        elemen = scanner.nextInt();
        
        int i;
        int [] nilai = new int[elemen];

        for(i = 0; i < elemen; i++){
            System.out.print("Masukkan nilai elemen ke " + i + " : ");
            nilai[i] = scanner.nextInt();
        }
        for(i = 0; i < elemen; i++){
            System.out.println("Nilai array elemen ke " + i + " = " + nilai[i]);
        }

    }
}
