import java.util.InputMismatchException;
import java.util.Scanner;


public class StackOfStringsUsingArrayTest {
	
	public static void main(String[] args) {
		
		StackOfStringsUsingArray stack = new StackOfStringsUsingArray();
		Scanner scan = new Scanner(System.in);;
		int choice = 3;
		
		do {
			
			System.out.println("----------MAIN MENU----------");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Exit");
			try {
				choice = scan.nextInt();
			}
			catch (InputMismatchException e) {
				choice = 4;
				scan.reset();
				System.out.println("MisMatched Input. Enter only among 1, 2 or 3");
				//e.printStackTrace();
			}
				scan.nextLine();

				switch (choice) {
				
				case 1 : 
					System.out.println("enter the name to be pushed into the stack");
					String s = scan.nextLine();
					stack.push (s);
					break;
					
				case 2 :
					System.out.println("top - " + stack.pop());
					break;
					
				case 3 :
					System.out.println("Exiting...");
					break;
				
				default :
					System.out.println("Invalid Choice");
					break;
				
				}
				
			
		}while (choice != 3);
			
		
		scan.close();
		
	}
}
