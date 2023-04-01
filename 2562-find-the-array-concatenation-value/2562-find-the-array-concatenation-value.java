class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int s=0;
        int e=nums.length-1;
        if(nums.length==1){
            return (long)nums[0];
        }
        String temp="";
        long ans=0;
        while(s<e){
            temp=""+nums[s]+nums[e];
            System.out.println(temp);
            ans+=Long.parseLong(temp);
            s++;
            e--;
        }
        if(nums.length%2!=0){
            temp=""+nums[s];
            ans+=Long.parseLong(temp);
        }
        return ans;
    }
}