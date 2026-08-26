import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        // Store friends in a HashSet for O(1) lookup speed
        Set<Integer> friendSet = new HashSet<>();
        for (int friend : friends) {
            friendSet.add(friend);
        }

        int[] result = new int[friends.length];
        int index = 0;

        // Iterate through finishing order and collect friends as they appear
        for (int id : order) {
            if (friendSet.contains(id)) {
                result[index++] = id;
            }
        }

        return result;
    }
}