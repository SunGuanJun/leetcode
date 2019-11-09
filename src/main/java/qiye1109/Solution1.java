package qiye1109;

class Solution1 {
    public boolean isMonotonic(int[] A) {
        if (A.length <= 1){
            return true;
        }

        int c = Integer.compare(A[0], A[1]);
        for (int i=2; i<A.length; i++){
            int tmp = Integer.compare(A[i-1], A[i]);
            if (c == 0 && tmp != 0){
                c = tmp;
            }
            if (tmp != c && tmp != 0){
                return false;
            }
        }
        return true;
    }
}
