class Solution {
    public int countAsterisks(String s) {
        String ans = "";
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '|') {
				ans += s.charAt(i);
				if (s.charAt(i) == '*')
					c++;
			} else {
				do {
					i++;
				} while (s.charAt(i) != '|');
			}
		}
		return c;
    }
}