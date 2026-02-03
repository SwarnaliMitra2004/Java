class Pyramids{

    public static void main(String[] args) {

        int n = 5;

        // 1. Right Half Pyramid
        System.out.println("Right Half Pyramid:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2. Reverse Right Half Pyramid
        System.out.println("\nReverse Right Half Pyramid:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 3. Left Half Pyramid
        System.out.println("\nLeft Half Pyramid:");
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = n - 1; j >= i; j--) {
                System.out.print("  ");
            }
            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
