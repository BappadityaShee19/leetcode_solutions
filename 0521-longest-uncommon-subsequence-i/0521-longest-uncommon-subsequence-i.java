class Solution {
    public int findLUSlength(String a, String b) {
        // If both strings are identical, no uncommon subsequence exists
        if (a.equals(b)) {
            return -1;
        }
        
        // If they differ, the longer string is itself the longest uncommon subsequence
        return Math.max(a.length(), b.length());
    }
}