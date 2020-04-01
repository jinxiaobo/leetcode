package leetcode;

/**
 * Created by jinxiaobo on 2020/4/1.
 */
public class Leetcode1395 {
    public static void main(String[] args) {
        int[] input = {2, 5, 3, 4, 1};
        System.out.println(numTeams(input));
    }

    private static int numTeams(int[] rating) {
        if (rating.length < 3) {
            return 0;
        }
        int result = 0;
        for (int i = 1; i < rating.length - 1; i++) {
            int left1 = 0;
            int left2 = 0;
            int right1 = 0;
            int right2 = 0;
            for (int j = 0; j < i; j++) {
                if (rating[j] < rating[i]) {
                    left1++;
                }
                if (rating[j] > rating[i]) {
                    left2++;
                }
            }
            for (int k = i + 1; k < rating.length; k++) {
                if (rating[k] > rating[i]) {
                    right1++;
                }
                if (rating[k] < rating[i]) {
                    right2++;
                }
            }
            result += (left1 * right1 + left2 * right2);
        }
        return result;
    }
}
