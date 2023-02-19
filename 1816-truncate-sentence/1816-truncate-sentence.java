class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
		String ans = "";
		for (int i = 0; i < k; i++) {
			ans += arr[i] + " ";
		}
		return ans.stripTrailing();
    }
}