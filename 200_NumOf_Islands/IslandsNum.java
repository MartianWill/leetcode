/**
 * IslandsNum
 */
public class IslandsNum {

    public static int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != '0') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void dfs(char[][] grid, int r, int c) {
        if (!inGrid(grid, r, c))
            return;
        if (grid[r][c] != '1')
            return;
        grid[r][c] = '0';
        dfs(grid, r + 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r - 1, c);
        dfs(grid, r, c - 1);
    }

    public static boolean inGrid(char[][] grid, int r, int c) {
        return 0 <= r && r < grid.length && c >= 0 && c < grid[0].length;
    }

    public static void main(String[] args) {
        char[][] grid = { { '1', '1', '1', '1', '0' },
                { '1', '1', '0', '1', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '0', '0', '0' } };
        int result = numIslands(grid);
        System.out.println(result);

    }
}