public class HollowDiamond {

    public static void printHollowDiamond(int n) {
        int i, j;

        // 🔼 Upper half of the hollow diamond
        for (i = 1; i <= n; i++) {

            // Print spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars and spaces between them
            for (j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*"); // Print star at borders
                } else {
                    System.out.print(" "); // Hollow space inside
                }
            }
            System.out.println();
        }

        // 🔽 Lower half of the hollow diamond
        for (i = n - 1; i >= 1; i--) {

            // Print spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars and spaces between them
            for (j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*"); // Border stars
                } else {
                    System.out.print(" "); // Inside empty
                }
            }
            System.out.println();
        }
    }

    // Main function
    public static void main(String[] args) {
        int n = 5; // Number of rows in the top half
        printHollowDiamond(n);
    }
}

