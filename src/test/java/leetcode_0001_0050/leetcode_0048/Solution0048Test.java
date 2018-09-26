package leetcode_0001_0050.leetcode_0048;

import org.junit.Assert;
import org.junit.Test;

public class Solution0048Test {
	Solution0048 solution0048 = new Solution0048();

	@Test
	public void test1(){
		int[][] matrix1 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};

		int[][] matrix2 = {
				{7,4,1},
				{8,5,2},
				{9,6,3}
		};
		solution0048.rotate(matrix1);
		Assert.assertArrayEquals(matrix2, matrix1);
	}

	@Test
	public void test2(){
		int[][] matrix1 = {
							{ 5, 1, 9,11},
							{ 2, 4, 8,10},
							{13, 3, 6, 7},
							{15,14,12,16}
							};

		int[][] matrix2 = {
							{15,13, 2, 5},
							{14, 3, 4, 1},
							{12, 6, 8, 9},
							{16, 7,10,11}
							};

		solution0048.rotate(matrix1);
		Assert.assertArrayEquals(matrix2, matrix1);
	}
}