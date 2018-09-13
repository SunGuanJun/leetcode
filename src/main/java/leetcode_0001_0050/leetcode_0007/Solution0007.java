package leetcode_0001_0050.leetcode_0007;

/**
 * Created by sun on 2018/9/10.
 */
public class Solution0007 {
    public int reverse(int x) {
        int result = 0;
        int posMax = Integer.MAX_VALUE / 10;
        int negMax = Integer.MIN_VALUE / 10;
        while (x != 0){
            if (x > 0){
                if (result > posMax
                        || (result == posMax && x > 7)){
                    return 0;
                }
                else {
                    result = result * 10 + x % 10;
                    x /= 10;
                }
            }
            else {
                if (result < negMax
                        || (result == negMax && x < -8)){
                    return 0;
                }
                else {
                    result = result * 10 + x % 10;
                    x /= 10;
                }
            }
        }

        return result;
    }

    public static void main(String[] args){
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int a = 314748364;
        System.out.println(a);
        int b = a * 10;
        System.out.println(b);
        System.out.println(b/a);

        System.out.println(-11 / 10);



//        a *= 10;
//        System.out.println(a);
//        a *= 10;
//        System.out.println(a);
//        a *= 10;
//        System.out.println(a);
//        a *= 10;
//        System.out.println(a);
    }
}
