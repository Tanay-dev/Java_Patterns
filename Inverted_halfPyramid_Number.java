public class Inverted_halfPyramid_Number {
    public static void numPattern(int totrows){
        for (int i=1; i<=totrows; i++){
            for (int j=1; j<=totrows-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        numPattern(10);
    }
}
