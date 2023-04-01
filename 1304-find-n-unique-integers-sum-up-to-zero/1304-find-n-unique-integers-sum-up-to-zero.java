class Solution {
    public int[] sumZero(int n) {
        int[] arr= new int[n];
        if(n==1){
            arr[0]=0;
        }
        if(n==2){
            arr[0]=-1;
            arr[1]=1;
        }
        for(int i=0;i<n-1;i+=2){
            arr[i]=i+1;
            arr[i+1]=-(i+1);
        }
        return arr;
    }
}