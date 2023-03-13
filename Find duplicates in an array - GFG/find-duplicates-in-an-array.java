//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
      HashSet<Integer> set = new HashSet<Integer>();
		Arrays.sort(arr);
		// System.out.println(Arrays.toString(arr));
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] == arr[i]) {
				set.add(arr[i]);
			}
		}
		if (set.isEmpty())
			set.add(-1);
		// System.out.println(set);
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		return list;
    }
}
