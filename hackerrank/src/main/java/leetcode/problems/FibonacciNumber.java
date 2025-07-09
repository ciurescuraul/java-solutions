package leetcode.problems;

public class FibonacciNumber {

    public static void main(String[] args) {

        int number = fibonacciRecursive(4);

        System.out.println(number);
    }

    static int fibonacciRecursive(int n) {
        if (n <= 1) return n;

        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }
}
