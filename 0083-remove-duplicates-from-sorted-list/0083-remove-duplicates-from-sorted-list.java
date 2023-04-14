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
    public ListNode deleteDuplicates(ListNode head) {
         
        if (head == null || head.next == null)
			return head;
		HashSet<Integer> h = new HashSet<Integer>();
		while (head != null) {
			h.add(head.val);
			head = head.next;
		}
		ArrayList<Integer> l = new ArrayList<Integer>(h);
        Collections.sort(l);
		head = new ListNode(l.get(0));
		ListNode temp = head;
		for (int i = 1; i < h.size(); i++) {
			ListNode node = new ListNode(l.get(i));
			temp.next = node;
			temp = temp.next;
		}
		return head;
    }
}