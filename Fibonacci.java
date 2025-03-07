public class Fibonacci {
    // Recursive method to calculate nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer");
        }
        if (n == 1) return 0;
        if (n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Change this value to compute different Fibonacci numbers
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
}

