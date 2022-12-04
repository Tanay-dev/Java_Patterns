public class Diamond_Pattern {
    public static int diamond_Pattern(int n){
        //Outer loop for the upper part of the diamond
        for(int i=1; i<=n; i++){
            //Spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //Now Stars
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Outer loop for the lower part of the diamond
        for(int i=n; i>=1; i--){
            //Spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //Now Stars
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return n;
    }
    public static void main(String[] args) {
        diamond_Pattern(10);
    }
}
