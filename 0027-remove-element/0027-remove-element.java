class Solution {
    public int removeElement(int[] nums, int val) {
       int l = nums.length;
		for (int i = 0; i < l; i++) {
			if (nums[i] == val) {
				nums[i--] = nums[--l];
			}
		}
		return l; 
    }
}