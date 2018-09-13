package leetcode_0001_0050.leetcode_0011;

/**
 * @Author sunguanjun
 * @Date 2018/9/11
 */
public class Solution0011 {

    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int maxArea = 0, area;
        int width, h;
        while (j>i){
            width = j - i;
            if (height[i] > height[j]){
                h = height[j];
                j--;
            }
            else {
                h = height[i];
                i++;
            }
            area = width * h;
            maxArea = maxArea > area ? maxArea : area;
        }

        return maxArea;
    }
}
