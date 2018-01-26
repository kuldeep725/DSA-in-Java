
public class HeapTest {

	public static void main(String[] args) {

		Comparable[] a = {'P','A','B','X','W','P','P','V', 'P', 'D','P','C','Y','Z'};
//		Comparable[] a = {7,3,2,5,2,8,9,4,3};
		Heap.sort(a);
		for (Comparable item : a) System.out.print(item);

	}

}
