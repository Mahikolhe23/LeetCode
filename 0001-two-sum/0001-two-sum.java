class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] out=new int[2];
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            while(j<nums.length){
                if(nums[i]+nums[j]==target){
                     out[0]=i;
                     out[1]=j;
                return out;
                }
                j++;
            }
        }
    return null;
    }
}