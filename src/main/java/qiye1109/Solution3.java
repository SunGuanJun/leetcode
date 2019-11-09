package qiye1109;

class Solution3 {
    public int knightDialer(int N) {
        if (N == 1){
            return 10;
        }

        int[][] next = {
            {4,6},
            {6,8},
            {7,9},
            {4,8},
            {3,9,0},
            {},
            {1,7,0},
            {2,6},
            {1,3},
            {2,4}
        };

        int mod = 1000000007;
        long[][] resultArray = new long[2][10];
        long[] zeroArray = {0L,0L,0L,0L,0L,0L,0L,0L,0L,0L};
        for (int i=0; i<10; i++){
            resultArray[0][i] = 1;
        }

        for (int i=1; i<N; i++){
            System.arraycopy(zeroArray, 0, resultArray[1], 0, 10);
            for (int j=0; j<10; j++){
                for (int k=0; k<next[j].length; k++){
                    resultArray[1][j] += resultArray[0][next[j][k]] % mod;
                }
            }
            System.arraycopy(resultArray[1], 0, resultArray[0], 0, 10);
        }

        long result = 0L;
        for (int i=0; i<10; i++){
            result += resultArray[1][i] % mod;
        }

        return (int) (result % mod);
    }

    public static void main(String[] args){
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.knightDialer(2));
        System.out.println(solution3.knightDialer(161));
    }
}
