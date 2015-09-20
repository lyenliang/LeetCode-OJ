package com.solutions.listNode;

/**
 * @author lyenliang
 *
 */
public class SwapNodesinPairs {

	private void printNodes(ListNode head) {
		while(head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
	
	public ListNode swapPairs(ListNode head) {
		if(head == null || head.next == null) return head;
		
		// swap the first 2 nodes
		ListNode b = head.next;
		head.next = b.next;
		b.next = head;
		
		// keep the returned node
		ListNode result = b;
		
		b = b.next;
		
		// swap the rest pairs
		while(b.next != null && b.next.next != null) {
			ListNode tmp = b.next.next;
			b.next.next = tmp.next;
			tmp.next = b.next;
			b.next = tmp;
			b = tmp.next;
		}
		return result;
	}
	
}
