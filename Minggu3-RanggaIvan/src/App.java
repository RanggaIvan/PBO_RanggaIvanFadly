import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);

       int bilangan;
         System.out.print("Masukkan bilangan: ");
         bilangan = in.nextInt();
         if(bilangan % 2 == 0){
            System.out.println("Bilangan " + bilangan + " adalah bilangan genap");
         } else {
            System.out.println("Bilangan " + bilangan + " adalah bilangan ganjil");
         }
    }
}
