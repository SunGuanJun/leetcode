package leetcode_0011;

/**
 * @Author sunguanjun
 * @Date 2018/9/11
 */
public class Solution0011 {

    public int max(int[] heights){
        int i = 0, j = heights.length - 1;
        int maxArea = 0, area;
        int width, height;
        while (j>i){
            width = j - i;
            if (heights[i] > heights[j]){
                height = heights[j];
                j--;
            }
            else {
                height = heights[i];
                i++;
            }
            area = width * height;
            maxArea = maxArea > area ? maxArea : area;
        }

        return maxArea;
    }
}
