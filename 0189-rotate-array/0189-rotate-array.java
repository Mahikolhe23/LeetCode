class Solution {
    public static void rotate(int[] arr, int k) {
		k = k % arr.length;
		reverse(arr, 0, arr.length - 1);
		reverse(arr, 0, k - 1);
		reverse(arr, k, arr.length - 1);
	}

	private static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
    }
}