public class Hollow_Rhombus {
    public static int rhombus(int n){
        //Initialisation of the outer loop
        for(int i=0; i<=n; i++){
            //For the first blank space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //Now the stars and the hollow part {Same logic as hollow_rectangle}
            for(int j=1; j<=n; j++){
                if(i==0 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return n;
    }
    public static void main(String[] args) {
        rhombus(10);
    }
}
