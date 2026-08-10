int maxDepth(char* s) {
    int cd = 0;
    int md = 0;
    for(int i=0; s[i]!= '\0'; i++){
        if(s[i]=='('){
            cd++;
            if(cd>md){
                md = cd;
            }}
        else if(s[i]==')'){
            cd--;    
        }
    }
    return md;

}