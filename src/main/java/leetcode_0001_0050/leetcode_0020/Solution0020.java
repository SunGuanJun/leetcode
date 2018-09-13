package leetcode_0001_0050.leetcode_0020;

/**
 * (){}[]
 * Created by sun on 2018/9/13.
 */
public class Solution0020 {
    public boolean isValid(String s) {
        char[] chars = new char[s.length()];
        int index=0;

        for (int i=0; i<s.length(); i++){
            switch (s.charAt(i)){
                case '(':
                case '{':
                case '[':
                    chars[index] = s.charAt(i);
                    index++;
                    break;
                case ')':
                    if (index > 0){
                        index--;
                    }
                    else {
                        return false;
                    }
                    if (chars[index] != '('){
                        return false;
                    }
                    break;
                case '}':
                    if (index > 0){
                        index--;
                    }
                    else {
                        return false;
                    }
                    if (chars[index] != '{'){
                        return false;
                    }
                    break;
                case ']':
                    if (index > 0){
                        index--;
                    }
                    else {
                        return false;
                    }
                    if (chars[index] != '['){
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }
        return index > 0 ? false : true;
    }
}
