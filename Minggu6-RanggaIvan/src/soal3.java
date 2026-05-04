public class soal3 {
    public static void main(String[] args) {
        int n = 5;

        for(int a = n; a >= 1; a--){
            for(int b = a; b <= n; b++){
                System.out.print(" ");
            }
            for(int c=1; c <= (2*a-1); c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
