
public class Merge {
	
	@SuppressWarnings("rawtypes")
	private static Comparable[] aux;
	
	@SuppressWarnings("rawtypes")
	public static void sort (Comparable[] a) {
		
		aux = new Comparable[a.length];
		sort (a, aux, 0, a.length-1);
		
	}
	
	@SuppressWarnings("rawtypes")
	private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
		
		if (hi <= lo) return;
		
		int mid = lo + (hi - lo)/2;
		sort (a, aux, lo, mid);
		sort (a, aux, mid + 1, hi);
		if (!less(a[mid+1], a[mid])) return;
		merge (a, aux, lo, mid, hi);
//		for (int i = lo; i <= hi; i++) System.out.print(a[i] + " ");
//		System.out.println();
		
	}

	@SuppressWarnings("rawtypes")
	private static void merge(Comparable[] a, Comparable[] aux, int lo,
			int mid, int hi) {
		
		assert isSorted (a, lo, mid);		// precondition: a[lo..mid] sorted
		assert isSorted (a, mid+1, hi);		// precondition: a[mid+1..hi] sorted
		
		for (int i = lo; i <= hi; i++) aux[i] = a[i];
		
		int i = lo;
		int j = mid + 1;
		for (int k = lo; k <= hi; k++) {
			
			if (i > mid) 					a[k] = aux[j++];
			else if (j > hi) 				a[k] = aux[i++];
			else if (less(aux[j], aux[i]))  	a[k] = aux[j++];
			else 						a[k] = aux[i++];
			
		}
		assert isSorted (a, lo, hi);		// postcondition: a[lo..hi] sorted
		
	}
	@SuppressWarnings("rawtypes")
	private static boolean isSorted(Comparable[] a, int lo, int hi) {
		
		for (int i = lo+1; i <= hi; i++) 
			if (!less(a[i-1], a[i])) return false;
		
		return true;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

}
