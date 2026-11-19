class Solution {
    public boolean isPalindrome(String s) {
        String s2 = s.replaceAll("[^a-zA-Z0-9]","");
        s2 = s2.toLowerCase();
        char[] str = s2.toCharArray();
        for(int i=0; i<str.length/2; i++){
            char temp = str[i];
            str[i]=str[str.length-1-i];
            str[str.length-1-i]=temp;
        }
        return (new String(str).equals(s2));
    }
}