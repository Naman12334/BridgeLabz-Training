

import java.util.*;
public class ZeroSumSubarrays {
    public static int countZeroSumSubarrays(int[] arr) {
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1);
        int prefixSum = 0;
        int count = 0;

        for (int num : arr) {
            prefixSum += num;
            if (prefixSumMap.containsKey(prefixSum)) {
                count += prefixSumMap.get(prefixSum);
            }
            prefixSumMap.put(prefixSum, prefixSumMap.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}