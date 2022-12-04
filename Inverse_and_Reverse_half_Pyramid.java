public class Inverse_and_Reverse_half_Pyramid {
    public static void pyramid_pattern(int totrows){
        for(int i=1; i<=totrows; i++){
            //For blank spaces
            for(int j=1; j<=(totrows-i); j++){
                System.out.print(" ");
            }
            //For Star spaces
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        pyramid_pattern(5);
    }
}
