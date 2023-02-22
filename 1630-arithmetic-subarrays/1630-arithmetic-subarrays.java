class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list = new ArrayList<Boolean>();
		for (int i = 0; i < l.length; i++) {
			int[] temp = new int[nums.length];
			List<Integer> listi = new ArrayList<Integer>();
			for (int j = l[i]; j <= r[i]; j++) {
				temp[j] = nums[j];
				listi.add(nums[j]);
			}
			list.add(check(listi));
		}
		return list;
	}

	public static boolean check(List<Integer> temp) {
		Collections.sort(temp);
		System.out.println(temp);
		int diff = temp.get(1) - temp.get(0);
		for (int i = 1; i < temp.size(); i++) {
			if ((temp.get(i) - temp.get(i - 1)) != diff)
				return false;
		}
		return true;
    }
}