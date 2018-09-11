package leetcode_0008;

/**
 * Created by sun on 2018/9/11.
 */
public class Solution0008 {
    public int myAtoi(String str) {

        int i;
        int res = 0;
        for (i=0; i<str.length(); i++){
            if (str.charAt(i) != ' '){
                break;
            }
        }

        boolean posFlag = true;
        if (i == str.length()){
            return 0;
        }
        else if (str.charAt(i) == '-'){
            posFlag = false;
            i++;
        }
        else if (str.charAt(i) == '+'){
            i++;
        }
        else if (str.charAt(i) < '0' || str.charAt(i) > '9'){
            return 0;
        }

        int max = posFlag ? Integer.MAX_VALUE / 10 : 0 - Integer.MIN_VALUE / 10;
        while (i<str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
            if (res < max){
                res = res * 10 + str.charAt(i) - '0';
            }
            else if (res == max){
                if (posFlag && str.charAt(i) > '7'){
                    return Integer.MAX_VALUE;
                }
                else if (!posFlag && str.charAt(i) > '8'){
                    return Integer.MIN_VALUE;
                }
                else {
                    res = res * 10 + str.charAt(i) - '0';
                }
            }
            else {
                return posFlag ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            i++;
        }

        return posFlag ? res : -res;
    }

    public static void main(String[] args){
        System.out.println(Character.isSpaceChar(' '));
        System.out.println(Character.isSpaceChar('\t'));
    }
}
