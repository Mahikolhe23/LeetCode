/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
		if (head == null)
			return 0;
		String ans = "";
		while (temp != null) {
			ans += temp.val;
			temp = temp.next;
		}
		int value = Integer.parseInt(ans,2);
		return value;
    }
}