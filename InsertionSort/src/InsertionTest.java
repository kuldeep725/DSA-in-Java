
public class InsertionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparable[] a = {3, 2, 5, 11, 43, 22, 24, 54, 10, 16, 30};
		Comparable[] s1 = {'h','e','l','e','n','a'};
		Comparable[] s = {"helena", "ki", "rab", "se", "fariyad"};
		Insertion.sort(a);
		Insertion.sort(s);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+ " ");
		}
	}

}
