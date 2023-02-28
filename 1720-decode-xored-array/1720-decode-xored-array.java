class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] ans = new int[encoded.length + 1];
		ans[0] = first;
		for (int j = 0; j < encoded.length; j++) {
			ans[j + 1] = ans[j] ^ encoded[j];
		}
		return ans;
    }
}