
public class DijkstraQuick {
	
	private static void sort(Comparable[] a, int lo, int hi) {
		
		if (hi <= lo) return;
		int lt = lo;
		int gt = hi;
		Comparable v = a[lo];
		int i = lo+1;
		
		while (i <= gt) {
			
			if (less(a[i], v))			exch (a, i++, lt++);
			else if (less(v, a[i]))		exch (a, i, gt--);
			else 							i++;	
			
		}
		
		sort(a, lo, lt-1);
		sort(a, gt+1, hi);
		
	}
	
	public static void sort (Comparable[] a) {
		
		sort (a, 0, a.length-1);
		
	}

	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	private static void exch(Comparable[] a, int i, int j) {
		
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
		
	}

}
