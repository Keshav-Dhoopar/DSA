class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int m = grid.length, n = grid[0].length;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    Deque<int[]> stack = new ArrayDeque<>();
                    stack.push(new int[]{i, j});
                    grid[i][j] = '0';
                    while (!stack.isEmpty()) {
                        int[] cur = stack.pop();
                        for (int[] d : dirs) {
                            int a = cur[0] + d[0], b = cur[1] + d[1];
                            if (a >= 0 && a < m && b >= 0 && b < n && grid[a][b] == '1') {
                                grid[a][b] = '0';
                                stack.push(new int[]{a, b});
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}