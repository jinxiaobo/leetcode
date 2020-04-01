package leetcode;

/**
 * Created by jinxiaobo on 2020/3/29.
 */
public class Leetcode509 {
    public static void main(String[] args) {
        int N = 3;
        System.out.println(fib(N));
    }

    private static int fib(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return fib(N - 1) + fib(N - 2);
    }
}
