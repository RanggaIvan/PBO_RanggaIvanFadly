public class soal5 {
    public static void main(String[] args) {
        int n = 5;

        for(int a = 1; a <= n; a++){
            for(int b = 1; b <= n - a; b++){
                System.out.print(" ");
            }
            for(int c = 1; c <= a; c++){
                System.out.print("*");
            }
            System.out.println();
        }  
        for(int a = n - 1; a >= 1; a--){
            for(int b = 1; b <= n - a; b++){
                System.out.print(" ");
            }
            for(int c = 1; c <= a; c++){
                System.out.print("*");
            }
            System.out.println();
        }  
    }
}
