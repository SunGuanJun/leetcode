package leetcode_0101_0150.leetcode_0121;

public class Solution0121 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if (prices.length > 0){
            int min = prices[0];
            for (int i=0; i<prices.length-1; i++){
                if (prices[i] > prices[i+1]){
                    /** to find out min cost **/
                    min = Math.min(min, prices[i+1]);
                }
                else {
                    maxProfit = Math.max(maxProfit, prices[i+1] - min);
                }
            }
        }
        return maxProfit;
    }
}
