
public class QuickSortTest {

	public static void main(String[] args) {

		Comparable[] a =  {2, 41, 24, 53, 22, 11, 1, 5, 13, 7};
		Quick.sort(a);
		Comparable[] s1 = {'Q','U', 'I', 'C','K', 'S', 'O', 'R', 'T'};
		//B A A B A B C C B C B
		Comparable[] s = {'B','A','A','B','A','B','C','C','B','C','B'};
		Quick.sort(s);
		for (int i = 0; i < a.length; i++) System.out.print(a[i] + " ");
		System.out.println();
		for (int i = 0; i < s.length; i++) System.out.print(s[i] + " ");

	}

} 
