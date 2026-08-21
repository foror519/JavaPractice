package Neetcode;
import java.util.*;
public class TopKFrequentElements {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(TopKFrequentElementsSolution.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2))); // 1, 2
        System.out.println(Arrays.toString(TopKFrequentElementsSolution.topKFrequent(new int[]{1}, 1))); // 1
        System.out.println(Arrays.toString(TopKFrequentElementsSolution.topKFrequent(new int[]{4, 1, -1, 2, -1, 2, 3}, 2))); // -1, 2
        System.out.println(Arrays.toString(TopKFrequentElementsSolution.topKFrequent(new int[]{1, 2}, 2))); // 1, 2
        System.out.println(Arrays.toString(TopKFrequentElementsSolution.topKFrequent(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10))); // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    }
}

class TopKFrequentElementsSolution {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<List<Integer>> buckets = new ArrayList<>(nums.length + 1);
        for (int i = 0; i <= nums.length; i++) {
            buckets.add(new ArrayList<>());
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int value = entry.getKey();
            int count = entry.getValue();
            buckets.get(count).add(value);
        }

        int[] result = new int[k];
        int index = 0;

        for (int count = nums.length; count >= 1 && index < k; count--) {
            for (int num : buckets.get(count)) {
                result[index++] = num;
                if (index == k) {
                    return result;
                }
            }
        }

        return result;
    }
}