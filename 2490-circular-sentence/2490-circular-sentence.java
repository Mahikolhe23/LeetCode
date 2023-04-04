class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] temp=sentence.split(" ");
        if(sentence.charAt(0)!=sentence.charAt(sentence.length()-1))
            return false;
        for(int i=0;i<temp.length-1;i++){
            int l=temp[i].length()-1;
            if(temp[i].charAt(l)!=temp[i+1].charAt(0))
                return false;
        }
        return true;
    }
}