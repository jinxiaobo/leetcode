package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by jinxiaobo on 2020/3/29.
 */
public class Leetcode961 {
    public static void main(String[] args) {
        int[] A = {5,1,5,2,5,3,5,4};
        System.out.println(repeatedNTimes2(A));
    }

    public static int repeatedNTimes(int[] A) {
        int len = A.length;
        int N = len / 2;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : A) {
            Integer value = map.get(num);
            if (value == null) {
                map.put(num, 1);
            } else {
                map.put(num, value + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == N) {
                return entry.getKey();
            }
        }
        return A[0];
    }

    // hack solution
    public static int repeatedNTimes2(int[] A) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num : A) {
            if (set.contains(num)) {
                return num;
            } else {
                set.add(num);
            }
        }
        return A[0];
    }
}
