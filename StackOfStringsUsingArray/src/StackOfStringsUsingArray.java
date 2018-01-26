
public class StackOfStringsUsingArray {
	
	private int N;
	private String[] item;
	
	public StackOfStringsUsingArray () {
		
		N = 0;
		item = new String[1];
		
	}
	
	public void push (String s) {
		
		if (N == item.length) resize (2 * N);
		item[N++] = s;
	}
	
	private void resize (int newLength) {
		
		String[] item_d = new String[newLength];
		
		for (int i = 0; i < N; i++) 
			item_d[i] = item[i];
		item = item_d;
		
	}
	
	public String pop () {
		
		if (N == 0) {
			System.out.println("Stack Underflow. Returning null text");
			return "null";
		}
		String poppedItem = item[--N];
		item[N] = null;
		if (N > 0 && N == item.length / 4) resize (item.length / 2);
		
		return poppedItem;
	}
}
