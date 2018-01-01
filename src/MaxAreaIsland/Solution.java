package MaxAreaIsland;

public class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int area=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                    area=Math.max(area,maxAreaOfIsland(grid,i,j));
            }
        }
        return area;
    }

    private int maxAreaOfIsland(int[][] grid, int i, int j) {
        int area=0;

        if(i>=0 && i<grid.length && j>=0 && j<grid[0].length && grid[i][j]==1)
        {
            grid[i][j]=0;
            area=1+maxAreaOfIsland(grid,i-1,j)+maxAreaOfIsland(grid,i+1,j)+maxAreaOfIsland(grid,i,j-1)+maxAreaOfIsland(grid,i,j+1);
        }
        return area;
    }
}
