
public class QuickSelectTest {

	public static void main(String[] args) {
		
		Comparable[] a =  {2, 41, 24, 53, 22, 11, 1, 5, 13, 7};
		Comparable min = QuickSelect.select(a, 0);
		Comparable max = QuickSelect.select(a, a.length-1);
		Comparable median = QuickSelect.select(a,  a.length/2);
		System.out.println("min = " + min);
		System.out.println("max = " + max);
		System.out.println("median = " + median);
		
	}

}
