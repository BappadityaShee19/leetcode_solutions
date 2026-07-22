class Solution {
    public char findTheDifference(String s, String t) {
        if(s==null){
            return t.charAt(0);
        }
        else if (t ==null){
            return s.charAt(0);
        }
        
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        //char[] ch = new char[ch2.length];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<ch1.length; i++){
            if(ch1[i] != ch2[i]){
                return ch2[i];
            }
        }
        return ch2[ch2.length-1];
    }
}