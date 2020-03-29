package leetcode;

/**
 * Created by jinxiaobo on 2020/3/25.
 */
public class Leetcode1365 {
    public static void main(String[] args) {
        int[] input = {8, 1, 2, 2, 3};
        int[] result = smallerNumbersThanCurrent2(input);
        for (int i : result) {
            System.out.println(i);
        }
    }

    private static int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] > nums[j]) {
                    result[i]++;
                } else if (nums[i] < nums[j]) {
                    result[j]++;
                }
            }
        }
        return result;
    }

    private static int[] smallerNumbersThanCurrent2(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int[] freq = new int[101];
        for (int num : nums) {
            freq[num]++;
        }
        for (int i = 1; i < freq.length; i++) {
            freq[i] = freq[i] + freq[i - 1];
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0)
                res[i] = freq[nums[i] - 1];
        }
        return res;
    }
}
