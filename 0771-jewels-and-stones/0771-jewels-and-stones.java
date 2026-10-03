class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] jw = jewels.toCharArray();
        char[] st = stones.toCharArray();
        int count =0;
        for(int i=0; i<jw.length; i++){
            for(int k=0; k<st.length; k++){
                if(jw[i]==st[k]){
                    count++;
                }
            }
        }
        return count;
    }
}