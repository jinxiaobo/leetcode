package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jinxiaobo on 2020/3/31.
 */
public class Leetcode771 {
    public static void main(String[] args) {

    }

    private static int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<Character>();
        for (char c : J.toCharArray()) {
            set.add(c);
        }
        int result = 0;
        for (char d : S.toCharArray()) {
            if (set.contains(d)) {
                result++;
            }
        }
        return result;
    }
}
