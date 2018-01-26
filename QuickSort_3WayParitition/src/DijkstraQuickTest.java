
public class DijkstraQuickTest {

	public static void main(String[] args) {
		
//		P 		ABX		W		P		PV		P		D		P	CYZ
		Comparable[] a = {'P','A','B','X','W','P','P','V', 'P', 'D','P','C','Y','Z'};
		DijkstraQuick.sort(a);
		for (int i = 0; i < a.length; i++) System.out.print(a[i] + " ");
		int j = 0;
		System.out.println("hey"+ (j+1));
	}

}
