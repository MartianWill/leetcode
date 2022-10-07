import java.util.Arrays;

public class MatrixReshape {
    public static int[][] reshapeMatrix(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if (r * c != m * n)
            return mat;
        int[][] reshaped = new int[r][c];
        for (int i = 0; i < r * c; i++) {
            reshaped[i / c][i % c] = mat[i / n][i % n];
        }

        return reshaped;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2 }, { 3, 4 }, { 2, 5 } };
        int r = 2, c = 3;
        int[][] result = reshapeMatrix(mat, r, c);
        System.out.println(Arrays.toString(result));
    }
}
