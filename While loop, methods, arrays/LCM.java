class Java {

    // Method to calculate GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate LCM
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs(a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        System.out.println("LCM of " + a + " and " + b + " is: " + lcm(a, b));
    }
}
