
public class StackWithGenerics<Item> {
	
	private Node top = null;
	
	public StackWithGenerics() {
		
	}
		
	private class Node {
		
		Item item;
		Node next;
		
	}
	
	public boolean isStackEmpty ()  {
		return top == null;
	}
	
	public void push (Item s) {
		
		Node oldTop = top;
		top = new Node();
		top.item = s;		
		top.next = oldTop;
		
	}
	
	public Item pop () {
		
		if (isStackEmpty()) {
			System.out.println("***STACK UNDERFLOW. RETURNING -1***");
			return (Item) "-1";
		}
		
		Item popItem = top.item;
		top = top.next;
		
		return popItem;
		
	}

}
