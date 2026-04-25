import java.util.*;
public class ganjil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, total=0;

        for (a=1; a<=20; a+=2){
            if(a<19){
                System.out.print(a+ " + ");
            }else{
                System.out.print(a);
            }
            total = total + a;
        }
        System.out.println(" = " + total);
    }
}
