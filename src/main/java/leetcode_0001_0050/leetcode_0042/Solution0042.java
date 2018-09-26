package leetcode_0001_0050.leetcode_0042;

public class Solution0042 {
    public int trap(int[] height) {
        if (height.length <= 2){
            return 0;
        }

        int heighest=0, hIndex=0;
        for (int i=0; i<height.length; i++){
            if (height[i] > heighest){
                heighest = height[i];
                hIndex = i;
            }
        }

        int vloume = 0, h1=height[0];
        for (int i=1; i<hIndex; i++){
            if (h1 > height[i]){
                vloume += h1 - height[i];
            }
            else {
                h1 = height[i];
            }
        }

        h1=height[height.length-1];
        for (int i=height.length-1; i>hIndex; i--){
            if (h1 > height[i]){
                vloume += h1 - height[i];
            }
            else {
                h1 = height[i];
            }
        }

        return vloume;
    }
}