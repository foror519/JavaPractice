import java.util.*;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] table = new int[cost.length];
        table[0] = cost[0];
        table[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            table[i] = Math.min(table[i-1],table[i-2]) + cost[i];
        }
        return Math.min(table[table.length-2], table[cost.length-1]);
    }
}