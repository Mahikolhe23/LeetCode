class Solution {
    public boolean checkIfPangram(String s) {
        for(int i='a';i<='z';i++){
            String c=Character.toString(i);
            if(!s.contains(c))
                return false;
        }
        return true;
    }
}