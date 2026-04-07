import java.util.*;
public class CobaNestediIf {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int bilangan;
        System.out.print("Masukkan bilangan (1-100): ");
        bilangan = in.nextInt();

        /*if(bilangan < 1){
            System.out.println(+bilangan + " adalah bilangan kurang dari 1");
        }else if(bilangan > 100){
            System.out.println(+bilangan +" adalah bilangan lebih dari 100");
        }*/
        /*if(bilangan < 1 || bilangan > 100){
            System.out.println("Bilangan tidak valid. Masukkan bilangan antara 1 dan 100.");
            System.out.print("Masukkan bilangan (1-100): ");
            bilangan = in.nextInt();
        }else{
            System.out.println("Anda memasukkan bilangan yang benar yaitu " + bilangan);
            if(bilangan % 2 == 0){
            System.out.println("Bilangan " + bilangan + " adalah bilangan genap");
            }else{
            System.out.println("Bilangan " + bilangan + " adalah bilangan ganjil");
            }
        }*/
        if(bilangan >= 1 && bilangan <= 100){
            System.out.println("Anda memasukkan bilangan yang benar yaitu " + bilangan);
            if(bilangan % 2 == 0){
            System.out.println("Bilangan " + bilangan + " adalah bilangan genap");
            }else{
            System.out.println("Bilangan " + bilangan + " adalah bilangan ganjil");
            }
        }else{
            System.out.println("Bilangan tidak valid. Masukkan bilangan antara 1 dan 100.");
            System.out.print("Masukkan bilangan (1-100): ");
            bilangan = in.nextInt();
        }
    }
}
