class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
		String ans = "";
		int c = 1;
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length; i++) {
				if ((arr[i].charAt(arr[i].length() - 1)) - '0' == c) {
					ans += arr[i].substring(0, arr[i].length() - 1) + " ";
					c++;
				}
			}
		}
		return ans.stripTrailing();
    }
}