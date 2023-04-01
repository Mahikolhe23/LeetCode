class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];
		for (int i = 0; i < index.length; i++) {
			if (index[i] < i) {
				for (int j = ans.length - 1; j > index[i]; j--)
					ans[j] = ans[j - 1];
				ans[index[i]] = nums[i];
			} else
				ans[index[i]] = nums[i];
		}
		return ans;
        
    }
}