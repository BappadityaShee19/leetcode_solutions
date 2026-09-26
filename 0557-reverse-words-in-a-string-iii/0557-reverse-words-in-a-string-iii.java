class Solution {
    public String reverseWords(String s) {
       StringBuilder sb = new StringBuilder();
       String[] words = s.split(" ");
       //String[] reverseword = new StringArray[words.length];
       for(int i=0; i<words.length; i++){

        sb.append( new StringBuilder(words[i]).reverse().toString());
        sb.append(" ");
        
       }
       return sb.deleteCharAt(sb.length()-1).toString();

    }
}