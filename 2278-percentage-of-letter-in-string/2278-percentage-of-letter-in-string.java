class Solution {
    public int percentageLetter(String s, char letter) {
        char[] s1 = s.toCharArray();
        int count =0;
        for(int i=0; i<s1.length; i++){
            if(s1[i]==letter){
                count++;
            }
        }
        double p = (double)count / s1.length * 100;
        return (int)Math.floor(p);
    }
}