import java.util.Scanner;


public class QueueOfStringsUsingLinkedListTest {

	public static void main(String[] args) {
		
		QueueOfStringsUsingLinkedList queue = new QueueOfStringsUsingLinkedList();
		
		Scanner scan = new Scanner(System.in);
		int choice;
		
		do {
			
			System.out.println("----------MAIN MENU----------");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. IsQueueEmpty");
			System.out.println("4. Exit");
			
			choice = scan.nextInt();
			scan.nextLine();
			
			switch (choice) {
			
			case 1 : 
				System.out.println("enter the name to be enqueued into the stack");
				String s = scan.nextLine();
				queue.enQueue(s);
				break;
				
			case 2 :
				System.out.println("top - " + queue.deQueue());
				break;
				
			case 3 :
				System.out.println(queue.isQueueEmpty());
				break;
			
			case 4 :
				break;
				
			default :
				System.out.println("Invalid Choice");
				break;
			
			}
		} while (choice != 4);
		
		scan.close();
	}

}
