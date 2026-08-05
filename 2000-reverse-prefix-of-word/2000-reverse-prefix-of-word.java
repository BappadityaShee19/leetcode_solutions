class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int s =-1;
        char[] ch2 = word.toCharArray();
        for(int i=0; i<ch2.length; i++){
            if(ch2[i]==ch){
                s=i;
                break;
            }
        }
        for(int i=s; i>=0;i--){
            sb.append(ch2[i]);
        }
        for(int i=s+1; i<ch2.length; i++){
            sb.append(ch2[i]);
        }
        return sb.toString();
    }
}