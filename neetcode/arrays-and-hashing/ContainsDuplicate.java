package Neetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(ContainsDuplicateSolution.hasDuplicate(new int[]{1,2,3,1})); // true
        System.out.println(ContainsDuplicateSolution.hasDuplicate(new int[]{1,2,3,4})); // false
        System.out.println(ContainsDuplicateSolution.hasDuplicate(new int[]{}));
        System.out.println(ContainsDuplicateSolution.hasDuplicate(new int[]{1}));// false
    }
}

class ContainsDuplicateSolution {
    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int x: nums){
            if (!set.add(x)) return true;
        }
        return false;
    }
}
