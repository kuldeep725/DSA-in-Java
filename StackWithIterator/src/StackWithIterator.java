import java.util.function.Consumer;
import java.util.Iterator;


public class StackWithIterator<Item> {

	public Iterator<Item> iterator() {
		return new ListIterator();
	}
	
	public class ListIterator implements Iterator<Item> {

		private Node current = top;
		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public Item next() {
			
			Item s = current.item;
			current = current.next;
			return s;
			
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void forEachRemaining(Consumer<? super Item> action) {
			// TODO Auto-generated method stub
			
		}
	}	
	
	private Node top = null;
	
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
	
	@SuppressWarnings("unchecked")
	public Item pop () {
		
		if (isStackEmpty()) {
			System.out.println("***STACK UNDERFLOW. RETURNING -1***");
			return (Item)"-1";
		}
		
		Item popItem = top.item;
		top = top.next;
		
		return popItem;
		
	}

}
