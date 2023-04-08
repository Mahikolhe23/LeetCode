class Solution {
    public String convertToTitle(int n) {
        String temp="";
        while(n>0){
           char  c=(char)((n-1)%26+65);                
            temp=c+temp;            
            n=(n-1)/26;
        }
        return temp;
    }
}