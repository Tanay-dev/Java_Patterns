public class Butterfly_Pattern {
    public static void Butterfly(int n){
        // For the upper half of the butterfly
        for(int i=1; i<=n; i++){
            // First stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // Blank spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // Last Stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // For the lower half of the butterfly
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Butterfly(10);
    }
}
