class Solution {
    public int subtractProductAndSum(int n) {
        int temp = n;
		int sum = 0;
		int product = 1;
		while (n != 0) {
			sum += (n % 10);
			product *= (n % 10);
			n /= 10;
		}
		temp = product - sum;
		return temp;
    }
}