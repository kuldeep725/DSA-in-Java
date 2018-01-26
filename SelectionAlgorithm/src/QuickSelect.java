
public class QuickSelect {

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
	
	public static Comparable select (Comparable[] a, int k) {
		
		int lo = 0;
		int hi = a.length - 1;
		
		while (lo < hi) {
			
			int pivot = partition(a, lo, hi);				//finding pivot element position
			
			if (pivot < k) 			lo = pivot + 1;			//if selection element lie ahead of pivot
			else if (pivot > k) 	hi = pivot - 1;			//if selection element lie behind of pivot
			else 					return a[k];			//equivalent to a[pivot]
			
		}
		return a[k];
		
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
