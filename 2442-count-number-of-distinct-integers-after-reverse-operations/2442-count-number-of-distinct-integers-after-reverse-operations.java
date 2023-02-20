class Solution {
    public int countDistinctIntegers(int[] nums) {
        		int[] temp = new int[nums.length * 2];
		for (int i = 0; i < nums.length; i++) {
			temp[i] = nums[i];
			temp[nums.length + i] = reverse(nums[i]);
		}
		Arrays.sort(temp);
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < temp.length; i++) {
			set.add(temp[i]);
		}
		return set.size();
	}

	public static int reverse(int n) {
		int rev = 0;
		while (n > 0) {
			int r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}
		return rev;
    }
}