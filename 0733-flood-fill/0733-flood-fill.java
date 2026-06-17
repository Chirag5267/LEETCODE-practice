class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int oldCol = image[sr][sc];

        if(oldCol == color)
            return image;

        dfs(image, sr, sc, oldCol, color);

        return image;
    }

    void dfs(int[][] image, int r, int c, int oldCol, int newCol) {

        if(r < 0 || c < 0 || r >= image.length || c >= image[0].length)
            return;

        if(image[r][c] != oldCol)
            return;

        image[r][c] = newCol;

        dfs(image, r + 1, c, oldCol, newCol);
        dfs(image, r - 1, c, oldCol, newCol);
        dfs(image, r, c + 1, oldCol, newCol);
        dfs(image, r, c - 1, oldCol, newCol);
    }
}