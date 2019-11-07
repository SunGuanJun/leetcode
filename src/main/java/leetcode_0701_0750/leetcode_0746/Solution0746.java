package leetcode_0701_0750.leetcode_0746;

public class Solution0746 {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] plans = new int[len];
        for (int i=0; i<len; i++){
            if (i<2){
                plans[i] = cost[i];
            }
            else {
                plans[i] = cost[i] + Math.min(plans[i-1], plans[i-2]);
            }
        }
        return Math.min(plans[len-1], plans[len-2]);
    }
}
