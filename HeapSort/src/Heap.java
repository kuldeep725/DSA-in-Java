
public class Heap {
	
	public static void sort (Comparable[] a) {
		
		int N = a.length;
		//Building heap using bottom-up method (HEAP CONSTRUCTION)
		for (int k = N/2; k >= 1; k--) {
			sink(a, k, N);
		}
		//SORTDOWN
		while (N > 1) {
			exch (a, 1, N--);
			sink (a, 1, N);
		}
		
	}
	
	private static void sink(Comparable[] a, int k, int N) {
		
		//k = parent
		//j = child
		int j = 2*k;
		while (j <= N){
			
			if (j < N && less(a, j, j+1)) 	j++;
			if (less(a, j, k))		break;
			exch (a, k, j);
			k = j;
			j = 2*k;
			
		}		
		
	}
	
	private static boolean less(Comparable[] a, int v, int w) {
		return a[v-1].compareTo(a[w-1]) < 0;
	}
	
	private static void exch(Comparable[] a, int i, int j) {
		
		Comparable swap = a[i-1];
		a[i-1] = a[j-1];
		a[j-1] = swap;
		
	}
	
}
