package com.solutions.listNode;

public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
	    if (head == null) return null;
	    ListNode p = head;
	    while (p.next != null) {
	    	// iterate until p's next value doesn't equal val
	        if (p.next.val == val) {
	        	p.next = p.next.next;
	        } else {
	        	p = p.next;
	        }
	    }
	    // head's value was not processed previously
	    return head.val == val ? head.next : head;
	}
}
