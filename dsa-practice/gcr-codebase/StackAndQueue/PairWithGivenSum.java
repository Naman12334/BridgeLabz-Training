

import java.util.*;

public class PairWithGivenSum {
    public static boolean hasPairWithSum(int[] arr, int targetSum) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            int complement = targetSum - num;
            if (seen.contains(complement)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}