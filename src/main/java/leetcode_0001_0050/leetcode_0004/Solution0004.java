package leetcode_0001_0050.leetcode_0004;

/**
 * @Author sunguanjun
 * @Date 2018/9/9
 */
public class Solution0004 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = combineAndSort(nums1, nums2);
        return findMedianSortedArray(nums);
    }

    public double findMedianSortedArray(int[] nums){
        int len = nums.length;
        if (len % 2 != 0){
            return (double) nums[(len-1)/2];
        }
        else {
            return (nums[len/2 - 1] + nums[len/2]) / 2.0;
        }
    }

    public int[] combineAndSort(int[] nums1, int[] nums2){
        if (nums1 == null || nums1.length == 0){
            return nums2;
        }
        else if (nums2 == null || nums2.length == 0){
            return nums1;
        }
        else {
            int[] nums = new int[nums1.length + nums2.length];
            int i1=0, i2=0, i=0;
            while (i1<nums1.length && i2<nums2.length){
                if (nums1[i1] < nums2[i2]){
                    nums[i] = nums1[i1];
                    i1++;
                }
                else {
                    nums[i] = nums2[i2];
                    i2++;
                }
                i++;
            }
            while (i1< nums1.length){
                nums[i] = nums1[i1];
                i++;
                i1++;
            }
            while (i2< nums2.length){
                nums[i] = nums2[i2];
                i++;
                i2++;
            }

            return nums;
        }
    }
}
