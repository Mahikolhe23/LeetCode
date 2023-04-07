class Solution {
    public String reverseWords(String s) {
        String[] temp=s.split(" ");
        String ans="";
        for(int i=0;i<temp.length-1;i++){
            ans+=reverse(temp[i])+" ";
        }
        ans+=reverse(temp[temp.length-1]);
        return ans;
    }
    String reverse(String temp){
        String ans="";
        for(int i=temp.length()-1;i>=0;i--){
            ans+=temp.charAt(i);
        }
        return ans;
    }
}