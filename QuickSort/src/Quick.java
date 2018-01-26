
public class Quick {

	public static int partition (Comparable[] a, int lo, int hi) {
		
		int i = lo;
		int j = hi+1;
		
		while (true) {
			
			while (less(a[++i], a[lo])) 
				if (i == hi) break;
			
			while (less(a[lo], a[--j]));	//at most the loop will break 
											//such that a[lo] = a[j] when j = lo
			if (i >= j) break;				//when i pointer crosses or becomes equal to j pointer
			exch(a, i, j);					//exchanges the two number
			
		}
		
		exch (a, lo, j);	
		return j;
	
	}
	
	private static void sort (Comparable[] a, int lo, int hi) {
		
		if (hi <= lo) return;
		int pivot = partition(a, lo, hi);
		sort (a, lo, pivot-1);
		sort (a, pivot+1, hi);
		
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
