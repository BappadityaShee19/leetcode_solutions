class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        char[] st = s.toCharArray();
        int count =0;
        for(int i=st.length-1; i>=0;i--){
            if(st[i]==' '){
                break;
            }
            count++;
        }
        return count;
    }
}