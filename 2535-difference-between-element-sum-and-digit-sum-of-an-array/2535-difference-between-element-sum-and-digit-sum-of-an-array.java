class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
		int ans = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (nums[i] > 9) {
				int a = nums[i];
				while (a > 0) {
					int r = a % 10;
					ans += r;
					a /= 10;
				}
			} else
				ans += nums[i];
		}
		return Math.abs(sum - ans);
    }
}