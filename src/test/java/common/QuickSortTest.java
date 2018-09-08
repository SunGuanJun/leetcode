package common;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author sunguanjun
 * @Date 2018/9/8
 */
public class QuickSortTest {

    QuickSort quickSort = new QuickSort();

    @Test
    public void test(){
        int[] param = {100, 2, -1, -99, 59, 99,87, 3};
        int[] result = {-99, -1, 2, 3, 59, 87, 99, 100};
        quickSort.quickSort(param, 0, param.length-1);
        Assert.assertArrayEquals(param, result);
    }
}
