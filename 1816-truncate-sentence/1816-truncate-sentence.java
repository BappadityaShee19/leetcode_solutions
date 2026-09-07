class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.trim().split(" ");
        for(int i=0; i<k; i++){
            sb.append(words[i]);
            if(i==k-1){
                break;
            }
            else{
                sb.append(" ");
            }
        }
        String result = sb.toString();
        return result;
    }
}