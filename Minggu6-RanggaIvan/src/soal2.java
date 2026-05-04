public class soal2 {
    public static void main(String[] args) {
        int n = 5;
        for (int a = 0; a < n; a++){
            for (int b = 0; b < n; b++){
            if(b == a || b == n - a - 1){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}}
