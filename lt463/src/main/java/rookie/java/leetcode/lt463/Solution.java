package rookie.java.leetcode.lt463;

public class Solution {
	public int islandPerimeter(int[][] grid) {
		int peri = 0;
		for (int i=0; i<grid.length; i++) {
			for (int j=0; j<grid[0].length; j++) {
				if (grid[i][j] == 1) {
					peri += getPerimeter(grid, i, j);			
				}
			}
		}
        return peri;
    }
	
	private int getPerimeter(int[][] grid, int i, int j) {
		int peri = 0;
		if (i != 0) {
			peri += (1 - grid[i-1][j]);
		} else {
			peri += 1;
		}
		
		if (i != grid.length - 1) {
			peri += (1 - grid[i+1][j]);
		} else {
			peri += 1;
		}	
		if (j != 0) {
			peri += (1 - grid[i][j-1]);
		} else {
			peri += 1;
		}		
		if (j != grid[0].length - 1) {
			peri += (1 - grid[i][j+1]);
		} else {
			peri += 1;
		}
		return peri;
	}
}
