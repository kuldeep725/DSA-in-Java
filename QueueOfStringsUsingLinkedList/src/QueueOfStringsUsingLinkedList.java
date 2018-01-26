
public class QueueOfStringsUsingLinkedList {
	
	private Node head = null;
	private Node tail = null;
	
	public class Node {
		
		String item;
		Node next;
		
	}
	
	public boolean isQueueEmpty () {
		return head == null;
	}
	
	public void enQueue (String s) {
		
		Node oldTail = tail;
		
		tail = new Node();
		tail.item = s;
		tail.next = null;
		
		if (isQueueEmpty()) head = tail;
		else 				oldTail.next = tail;
		
	}
	
	public String deQueue () {
		
		if (isQueueEmpty()) {
			tail = null;
			System.out.println("Empty Queue. Returning null text");
			return "null";
		}
		
		String s = head.item;
		head = head.next;
		
		return s;
		
	}
	

}
