class Solution {
    public int[] searchRange(int[] nums, int target) {
      int fl[]=new int[2];
        int count=0;
        if(nums.length==0){
            fl[0]=-1;
            fl[1]=-1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                fl[1]=i;
                count++;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                fl[0]=i;
                count++;
            }
        }
        if(count==0){
            fl[0]=-1;
            fl[1]=-1;
        }
        return fl;  
    }
}