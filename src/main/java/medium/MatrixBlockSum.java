package medium;

public class MatrixBlockSum {
    // https://leetcode.com/problems/matrix-block-sum/
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int[][] result = new int[mat.length][mat[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {

                for (int l = Math.max(i - k, 0); l <= Math.min(i + k, result.length - 1); l++) {
                    for (int m = Math.max(j - k, 0); m <= Math.min(j + k, result[0].length - 1); m++) {
                        result[i][j] += mat[l][m];
                    }
                }

            }
        }
        return result;
    }
}
