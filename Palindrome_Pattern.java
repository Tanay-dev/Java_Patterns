public class Palindrome_Pattern {
    public static int patnn(int n) {
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Number in Decending order
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Number in Ascending order
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        return n;
    }

    public static void main(String[] args) {
        patnn(5);
    }
}
