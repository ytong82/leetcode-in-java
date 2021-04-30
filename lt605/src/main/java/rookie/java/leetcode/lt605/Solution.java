package rookie.java.leetcode.lt605;

public class Solution {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		int count = 0;
		for (int i=0; i<flowerbed.length; i++) {
			if (flowerbed[i] == 0) {
				if (i== 0 || (i > 0 && flowerbed[i-1] == 0)) {
					if (i == flowerbed.length - 1 || (i < flowerbed.length - 1 && flowerbed[i+1] == 0)) {
						count++;
						flowerbed[i] = 1;
						i++;
					}
				}
			}
		}
		return count >= n ? true : false;
	}
}
