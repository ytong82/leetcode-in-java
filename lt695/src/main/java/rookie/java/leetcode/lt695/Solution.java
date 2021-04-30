package rookie.java.leetcode.lt695;

public class Solution {
	public int maxAreaOfIsland(int[][] grid) {
		int maxArea = Integer.MIN_VALUE;
		for (int i=0; i<grid.length; i++) {
			for (int j=0; j<grid[0].length; j++) {
				int islandArea = maxAreaOfIsland(grid, i, j);
				if (maxArea < islandArea) {
					maxArea = islandArea;
				}
 			}
		}
		return maxArea;
	}
	
	private int maxAreaOfIsland(int[][] grid, int i, int j) {
		if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
			return 0;
		}	
		if (grid[i][j] == 0) {
			return 0;
		} else {
			grid[i][j] = 0;
			return 1 + maxAreaOfIsland(grid, i-1, j) 
					+ maxAreaOfIsland(grid, i+1, j)
					+ maxAreaOfIsland(grid, i, j-1)
					+ maxAreaOfIsland(grid, i, j+1);
		}	
	}
}
