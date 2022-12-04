public class Solid_Rhombus {
    public static void rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // First Spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // Star spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
        }
    }

    public static void main(String args[]) {
        rhombus(5);
    }
}
