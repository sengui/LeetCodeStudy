package array.easy;

public class FibonacciNumber {
    public int fib(int N) {
        if (N == 0 || N == 1) {
            return N;
        }
        int f1 = 0;
        int f2 = 1;
        int result = f2;
        for (int i = 2; i <= N; i++) {
            result = f1 + f2;
            f1 = f2;
            f2 = result;
        }
        return result;
    }
}
