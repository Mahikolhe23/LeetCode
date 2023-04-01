class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int c=0;
        int[] temp=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i] && j!=i)
                    c++;
            }
            temp[i]=c;
        }
        return temp;
    }
}