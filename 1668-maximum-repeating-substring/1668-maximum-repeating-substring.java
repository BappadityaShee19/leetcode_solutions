class Solution {
    public int maxRepeating(String sequence, String word) {
        int count =0;
        /*char[] ch1 = sequence.toCharArray();
        char[] ch2 = word.toCharArray();

        for(int i=0; i<ch1.length-1; i++){
            if(ch1[i]==ch2[0] && ch1[i+1] == ch2[1]){
                count++;
            }
        }*/
        StringBuilder sb = new StringBuilder(word);
        while(sequence.contains(sb.toString())){
            count++;
            sb.append(word);
        }
        return count;
    }
}