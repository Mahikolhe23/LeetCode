class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int[] left = new int[nums.length];
		int sum = 0;
		int sum1 = 0;
		int j = nums.length - 1;
		int[] right = new int[nums.length];

		for (int i = 0; i < nums.length - 1; i++) {
			sum = sum + nums[i];
			left[i + 1] = sum;
			sum1 = sum1 + nums[j--];
			right[j] = sum1;
		}
		int[] ans = new int[nums.length];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = (left[i] - right[i]) > 0 ? (left[i] - right[i]) : (left[i] - right[i]) * -1;
		}

		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(right));
		return ans;
    }
}