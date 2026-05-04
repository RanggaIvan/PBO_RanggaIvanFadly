public class soal4 {
    public static void main(String[] args) {
        int n = 5;

        for(int a = 1; a <= n; a++){
            for(int b = 1; b <= a; b++){
                System.out.print("*");
            }
            System.out.println();
        }  for(int a = n - 1; a >= 1; a--){
            for(int b = 1; b <= a; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
