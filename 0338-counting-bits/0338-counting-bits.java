class Solution {
    public int[] countBits(int n) {
        int[] temp=new int[n+1];
        for(int i=0;i<=n;i++){
            String bin=Integer.toBinaryString(i);
            temp[i]=count(bin);
        }
        return temp;
    }
    int count(String bin){
        int c=0;
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)=='1'){
                c++;
            }
        }
        return c;
    }
}