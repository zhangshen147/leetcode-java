package dfs;

/**
 * Leetcode 200:
 * 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 *
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
 *
 * 此外，你可以假设该网格的四条边均被水包围。
 *
 */
public class NumIslands {
    char[][] grid;

    public int numIslands(char[][] grid) {
        this.grid = grid;

        int count =0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1'){
                    dfs(i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(int i, int j) {
        if (i < 0 || i >= grid.length){
            return;
        }
        if (j < 0 || j >= grid[0].length){
            return;
        }
        if (grid[i][j] != '1'){
            return;
        }

        grid[i][j] = '2';
        dfs(i, j+1);
        dfs(i+1, j);
        dfs(i, j-1);
        dfs(i-1, j);
    }
}
