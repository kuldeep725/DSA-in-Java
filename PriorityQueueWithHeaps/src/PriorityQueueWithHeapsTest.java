
public class PriorityQueueWithHeapsTest {

	public static void main(String[] args) {

		PriorityQueueWithHeaps task = new PriorityQueueWithHeaps(15);
//		task.insert(1);
//		task.insert(3);
//		task.insert(2);
//		task.insert(5);
//		task.insert(2);
//		Comparable max1 = task.delMax();
//		Comparable max2 = task.delMax();
//		System.out.println("max1 = " + max1);
//		System.out.println("max2 = " + max2);
		task.insert('T');
		task.insert('P');
		task.insert('R');
		task.insert('N');
		task.insert('H');
		task.insert('O');
		task.insert('A');
		task.insert('E');
		task.insert('I');
		task.insert('G');
		
		while(!task.isEmpty()){
			System.out.println("val = " + task.delMax());
		}
		
	}

}
