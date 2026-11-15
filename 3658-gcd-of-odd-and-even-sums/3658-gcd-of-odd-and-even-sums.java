class Solution {
    public int gcdOfOddEvenSums(int n) {
        int EvenSum =n*n;
        int oddSum =n*(n-1);
        
        while(EvenSum != 0){
            int temp = EvenSum;
            EvenSum = oddSum % EvenSum;
            oddSum = temp;/*
            /*if(EvenSum > oddSum){
                EvenSum -= oddSum;
            }
            else{
                oddSum-=EvenSum;
            }*/

        }
        //return EvenSum;
        return oddSum;
    }
}