class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int m = flowerbed.length;

        for (int i = 0; i < m; i++) {
            // Check if current spot is empty
            if (flowerbed[i] == 0) {
                // Check if left and right spots are empty (or at boundary)
                boolean leftEmpty = (i == 0 || flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == m - 1 || flowerbed[i + 1] == 0);

                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1; // Plant a flower
                    count++;
                    
                    if (count >= n) {
                        return true; // Early return if requirement is met
                    }
                }
            }
        }

        return count >= n;
    }
}