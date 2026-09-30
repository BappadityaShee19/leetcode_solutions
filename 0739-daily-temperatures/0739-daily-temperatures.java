/*class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        for(int i=0; i<temperatures.length;i++){
            for(int j=i+1;j<n;j++){
                if(temperatures[i]<temperatures[j]){
                    result[i]=j-i;
                    break;
                }
            }
        }
        return result;
    }
}*/

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];

        // Process from right to left
        for (int i = n - 2; i >= 0; i--) {
            int j = i + 1;

            // Jump forward using previous results until we find a warmer day
            while (j < n && temperatures[j] <= temperatures[i]) {
                if (result[j] == 0) {
                    // No warmer day exists ahead
                    j = n;
                    break;
                }
                // Skip directly to the next warmer day for day 'j'
                j += result[j];
            }

            // If a warmer day was found within bounds
            if (j < n) {
                result[i] = j - i;
            }
        }

        return result;
    }
}