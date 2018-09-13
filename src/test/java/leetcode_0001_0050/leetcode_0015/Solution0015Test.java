package leetcode_0001_0050.leetcode_0015;

import com.alibaba.fastjson.JSON;
import org.junit.Test;


public class Solution0015Test {
	Solution0015 solution0015 = new Solution0015();

	@Test
	public void test1(){
		int[] nums = {-1, 0, 1, 2, -1, -4};
		System.out.print(JSON.toJSONString(solution0015.threeSum(nums)));
	}

	@Test
	public void test2(){
		int[] nums = {-2,0,0,2,2};
		System.out.print(JSON.toJSONString(solution0015.threeSum(nums)));
	}

	@Test
	public void test3(){
		int[] nums = {0,4,5,1,1,-9,8,3,-1,-2,-3,2,1,9,-9,-6,4,1};
		System.out.print(JSON.toJSONString(solution0015.threeSum(nums)));
	}
}