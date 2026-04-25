import java.util.*;
public class Prima {    
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a, b;

    for(a=2; a<=20; a++){
        int count = 0;
        for(b=1; b<=a; b++){
            if(a % b == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.print(a + " ");
        }
    }
     
}}