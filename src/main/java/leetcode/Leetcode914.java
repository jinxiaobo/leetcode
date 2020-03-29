package leetcode;

/**
 * Created by jinxiaobo on 2020/3/27.
 */
public class Leetcode914 {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 4, 3, 2, 1};
        System.out.println(hasGroupsSizeX(input));
    }

    private static boolean hasGroupsSizeX(int[] deck) {
        int[] freq = new int[10000];
        for (int num : deck) {
            freq[num]++;
        }

        int x = 0;
        for (int i = 0; i < 10000; i++) {
            if (freq[i] > 0) {
                x = gcd(x, freq[i]);
                if (x < 2) {
                    return false;
                }
            }
        }
        return x >= 2;
    }

    /**
     * 求最大公约数
     *
     * @param a
     * @param b
     * @return
     */
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
