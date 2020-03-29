package leetcode;

/**
 * Created by jinxiaobo on 2020/3/1.
 */
public class Leetcode1221 {
    public static void main(String[] args) {
        int result = balancedStringSplit("RLRRLLRLRL");
        System.out.println("result:" + result);
    }

    private static int balancedStringSplit(String s) {
        int sum = 0;
        int result = 0;
        for (int  i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                sum += 1;
            } else {
                sum -= 1;
            }
            if (sum == 0) {
                result += 1;
            }
        }
        return result;
    }
}
