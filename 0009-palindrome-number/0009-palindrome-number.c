bool isPalindrome(int x) {
    if(x<0) return false;
    int temp = x;
    long long num=0;
    while(temp!= 0){
        int new = temp%10;
        num = num * 10 + new;
        temp = temp/10;
    }
    if(num!=x){
        return false;
    }
    return true;
}