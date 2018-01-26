
public class MergeSortTest {

	/**
	 * @param args
	 */
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparable[] a =  {2, 41, 24, 53, 22, 11, 1, 5, 13, 7};
		Merge.sort(a);
		Comparable[] s = {'M', 'E', 'R', 'G', 'E', 'S', 'O', 'R', 'T'};
		Merge.sort(s);
		for (int i = 0; i < a.length; i++) System.out.print(a[i] + " ");
		System.out.println();
		for (int i = 0; i < s.length; i++) System.out.print(s[i] + " ");
	}

}
