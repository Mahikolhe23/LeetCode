class Solution {
    public int titleToNumber(String c) {
        int sum=0;
        for(int i=0;i<c.length();i++){
            int ch=c.charAt(i)-'A'+1;
            if(c.length()>1){
                sum=sum*26+ch;
            }else{
                sum=ch;
            } 
        }
        return sum;
    }
}