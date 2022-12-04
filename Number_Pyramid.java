public class Number_Pyramid {
    public static int yoyobantai(int n){
        //Outer loop
        for(int i=1; i<=n; i++){
            //Spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //Number
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        return n;
    }
    public static void main(String[] args) {
        yoyobantai(9);
    }
}
