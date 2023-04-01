class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] temp= new int[nums.length];
        int i=0;
        int j=n;
        int k=0;
        while(i<n){
            temp[k]=nums[i];
            temp[k+1]=nums[j];
            i++;
            j++;
            k+=2;
            
        }
        return temp;
    }
}