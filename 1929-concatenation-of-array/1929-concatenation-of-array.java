import java.util.*;
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
		int[] res = new int[2 * n];
		for (int i = 0; i < nums.length; i++) {
			res[i] = nums[i];
			res[i + n] = nums[i];
		}
		return res;
    }
}