//In this heap, N points to the null pointer and 
//N-1 points to the last element in the heap
public class PriorityQueueWithHeaps {

	private int N;
	private static Comparable[] a;
	
	public PriorityQueueWithHeaps(int capacity) {
		N = 1;
		a = new Comparable[capacity+1];
	}
	
	public boolean isEmpty () {
		return N==1;
	}
	
	public void insert (Comparable val) {
		
		a[N++] = val;
		swim(N-1);
		
	}
	
	public Comparable delMax () {
		
		Comparable item = a[1];
		exch (a, 1, --N);
		a[N] = null;
		sink(1);
		return item;
		
	}

	private void sink(int k) {
		
		//k = parent
		//j = child
		int j = 2*k;
		while (j < N-1){
			
			if (less(j, j+1)) 	j++;
			if (less(j, k))		break;
			exch (a, k, j);
			k = j;
			j = 2*k;
			
		}		
		
	}

	private void swim(int k) {
		
		//k = child
		//j = parent
//		int j = k/2;			//j is acting as parent of k
//		while (j >= 1) {
//			
//			if (less(k, j))	break;	
//			if (less(j, k))	exch(a, k, j);
//			k = k/2;
//			j = k/2;
//			
//		}
		while (k>1 && less(k/2,k)){
			exch(a, k/2, k);
			k = k/2;
		}
		
	}
	
	private static boolean less(int v, int w) {
		return a[v].compareTo(a[w]) < 0;
	}

	private static void exch(Comparable[] a, int i, int j) {
		
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
		
	}
	
	
}
