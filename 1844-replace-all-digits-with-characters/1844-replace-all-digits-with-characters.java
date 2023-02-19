class Solution {
    public String replaceDigits(String s) {
        String ans = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				ans += (char) ((s.charAt(i - 1) + s.charAt(i) - '0'));
			} else {
				ans += s.charAt(i);
			}
		}
		return ans;
    }
}